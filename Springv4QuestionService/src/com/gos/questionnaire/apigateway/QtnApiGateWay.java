package com.gos.questionnaire.apigateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.gos.questionnaire.repositories.QuestionCategoryRepository;
import com.gos.questionnaire.repositories.QuestionRepository;
import com.gos.questionnaire.repositories.QuestionTypeRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.gos.questionnaire.beans.AaiAbcFctQtnAnsOptMls;
import com.gos.questionnaire.beans.AaiAbcFctQtnAnsOptMlsPK;
import com.gos.questionnaire.beans.AaiAbcFctQuestionMls;
import com.gos.questionnaire.beans.AaiAbcFctQuestionMlsPK;
import com.gos.questionnaire.beans.OptionBean;
import com.gos.questionnaire.beans.QuestionBean;
import com.gos.questionnaire.service.QuestionService;

public class QtnApiGateWay {

	private QuestionRepository questionRepository;
	private QuestionCategoryRepository questionCategoryRepository;
	private QuestionTypeRepository questionTypeRepository;

	public QtnApiGateWay(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	public QtnApiGateWay(QuestionRepository questionRepository, QuestionCategoryRepository questionCategoryRepository,
			QuestionTypeRepository questionTypeRepository) {
		this.questionRepository = questionRepository;
		this.questionCategoryRepository = questionCategoryRepository;
		this.questionTypeRepository = questionTypeRepository;
	}

	public JsonNode getQuestion(String questionId) {
		QuestionService questionService;
		try {
			questionService = new QuestionService();
			return questionService.getQuestion(questionRepository, questionId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public JsonNode getAllQuestions() {
		QuestionService questionService;
		try {
			questionService = new QuestionService();

			CompletableFuture<JsonNode> fetchQuestionsService = CompletableFuture.supplyAsync(() -> {
				JsonNode QuestionListJson = null;
				try {
					System.out.println(Thread.currentThread() + " " + System.currentTimeMillis());
					QuestionListJson = questionService.getAllQuestions(questionRepository);
				} catch (Exception e) {
					e.printStackTrace();
				}

				return QuestionListJson;
			});

			CompletableFuture<JsonNode> fetchQtnCategorysService = CompletableFuture.supplyAsync(() -> {
				JsonNode QtnCategoryList = null;
				try {
					System.out.println(Thread.currentThread() + " " + System.currentTimeMillis());
					QtnCategoryList = questionService.getQuestionCategory(questionCategoryRepository);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				return QtnCategoryList;
			});

			CompletableFuture<JsonNode> fetchQtnTypesService = CompletableFuture.supplyAsync(() -> {
				JsonNode QtnCategoryList = null;
				try {
					System.out.println(Thread.currentThread() + " " + System.currentTimeMillis());
					QtnCategoryList = questionService.getQuestionTypes(questionTypeRepository);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				return QtnCategoryList;
			});

			ObjectNode mergedNode = JsonNodeFactory.instance.objectNode();
			mergedNode.set("categoryList", fetchQtnCategorysService.get());
			mergedNode.set("qustionTypeList", fetchQtnTypesService.get());
			mergedNode.set("questionObj", fetchQuestionsService.get());

			CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(fetchQuestionsService,
					fetchQtnTypesService, fetchQtnCategorysService);
			System.out.println("Output from all the futures is " + combinedFuture.get());
			return mergedNode;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String deleteQuestion(String questionId) {
		QuestionService questionService;
		try {
			questionService = new QuestionService();
			if (questionService.deleteQuestion(questionRepository, questionId))
				return "success";
			else
				return "fail";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}

	public JsonNode getQuestionCategory() {
		QuestionService questionService;
		try {
			questionService = new QuestionService();
			return questionService.getQuestionCategory(questionCategoryRepository);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public JsonNode getQuestionTypes() {
		QuestionService questionService;
		try {
			questionService = new QuestionService();
			return questionService.getQuestionTypes(questionTypeRepository);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String saveQuestion(String saveJson) {
		QuestionService questionService;
		try {
			questionService = new QuestionService();
			if (questionService.saveQuestion(questionRepository, createQuesBean(saveJson)))
				return "success";
			else
				return "fail";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}

	private QuestionBean createQuesBean(String saveJson) throws JSONException {

		String quesId = Long.toString(System.nanoTime());
		String startDate;
		JSONObject jsonObject = null;

		Date dateWithoutTime;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		dateWithoutTime = cal.getTime();
		startDate = dateWithoutTime.toString();

		QuestionBean qtnrBean = new QuestionBean();
		ArrayList<OptionBean> optBeanArray = new ArrayList<OptionBean>();

		try {
			jsonObject = new JSONObject(saveJson);

		} catch (JSONException e) {
			e.printStackTrace();
		}

		qtnrBean.setQuestionId(new BigInteger(quesId));
		qtnrBean.setAppId("OFS_AAAI");
		qtnrBean.setSecFlag("false");
		qtnrBean.setCategoryId(jsonObject.getString("questionCat"));
		qtnrBean.setMandatoryYN("Y");
		qtnrBean.setSelectedTypeId(jsonObject.getInt("questionType"));
		qtnrBean.setDocumentYN("N");
		qtnrBean.setDisplayTypeId(jsonObject.getInt("questionType"));
		qtnrBean.setCommentYN("Y");
		qtnrBean.setStatusFlag(3);
		qtnrBean.setVersion(0);
		qtnrBean.setIsLatest("Y");
		qtnrBean.setStartDate(dateWithoutTime);
		qtnrBean.setCreatedDate(dateWithoutTime);
		qtnrBean.setModifiedDate(dateWithoutTime);
		qtnrBean.setModifiedBy("modifiedBy");
		qtnrBean.setQuestionOptionType(Integer.parseInt(jsonObject.getString("questionType")));
		qtnrBean.setLatestQuestionOptionType(Integer.parseInt(jsonObject.getString("questionType")));

		JSONArray optionsArray = jsonObject.getJSONArray("optionArray");

		for (int i = 0; i < optionsArray.length(); i++) {
			JSONObject optionObject = new JSONObject(optionsArray.getString(i));
			OptionBean optBean = optionBeanSetter(optionObject);
			optBean.setQuestBean(qtnrBean);
			optBeanArray.add(optBean);

		}
		qtnrBean.setOptions(optBeanArray);

		List<AaiAbcFctQuestionMls> qtnMLSBeanList = new ArrayList<>();
		AaiAbcFctQuestionMls qtnMlsBean = new AaiAbcFctQuestionMls();

		AaiAbcFctQuestionMlsPK qtnMlsPKBean = new AaiAbcFctQuestionMlsPK();
		qtnMlsPKBean.setnQtnIdPK(new BigInteger(quesId));
		qtnMlsPKBean.setMetadataLocalePK("en_US");
		qtnMlsBean.setAaiAbcFctQuestionMlsPK(qtnMlsPKBean);

		qtnMlsBean.setAaiAbcFctQuestion_nQtnId(qtnrBean);
		qtnMlsBean.setVQtnDesc(jsonObject.getString("questionDesc"));
		qtnMlsBean.setNQtnCd(new BigInteger(quesId));
		qtnMlsBean.setVQtnName(jsonObject.getString("questionDesc"));
		qtnMLSBeanList.add(qtnMlsBean);

		qtnrBean.setAaiAbcFctQuestionMls(qtnMLSBeanList);

		qtnrBean.setSourceLocale("en_US");
		qtnrBean.setQuestionCode(new BigInteger(quesId));
		qtnrBean.setQuestionName(jsonObject.getString("questionDesc"));
		qtnrBean.setQuestionDesc(jsonObject.getString("questionDesc"));

		System.out.println("------------ Qtn Bean is -------------------");
		System.out.println(qtnrBean.toString());

		return qtnrBean;
	}

	private OptionBean optionBeanSetter(JSONObject optionObject) throws JSONException {

		OptionBean respBean = new OptionBean();
		List<AaiAbcFctQtnAnsOptMls> optionMLSBeanList = new ArrayList<>();
		BigInteger optionId = new BigInteger(Long.toString(System.nanoTime()));

		respBean.setOptionId(optionId);
		respBean.setOptionDesc(optionObject.getString("optionDesc"));
		respBean.setFromValue(optionObject.getString("fromValue").isEmpty() ? 0
				: Double.parseDouble(optionObject.getString("fromValue")));
		respBean.setToValue(optionObject.getString("toValue").isEmpty() ? 0
				: Double.parseDouble(optionObject.getString("toValue")));
		respBean.setOperator(optionObject.getString("operator"));
		respBean.setSOURCE_LOCALE("en_US");

		AaiAbcFctQtnAnsOptMls ansOptMlsBean = new AaiAbcFctQtnAnsOptMls();
		AaiAbcFctQtnAnsOptMlsPK ansOptMlsPK = new AaiAbcFctQtnAnsOptMlsPK();
		ansOptMlsPK.setnOptionIdPK(optionId);
		ansOptMlsPK.setMetadataLocalePK("en_US");
		ansOptMlsBean.setAaiAbcFctQtnAnsOptMlsPK(ansOptMlsPK);

		ansOptMlsBean.setVOptionDesc(optionObject.getString("optionDesc"));
		ansOptMlsBean.setAaiAbcFctQtnAnswerOptions_nOptionId(respBean);
		optionMLSBeanList.add(ansOptMlsBean);
		
		respBean.setAaiAbcFctQtnAnsOptMls(optionMLSBeanList);

		return respBean;
	}

}
