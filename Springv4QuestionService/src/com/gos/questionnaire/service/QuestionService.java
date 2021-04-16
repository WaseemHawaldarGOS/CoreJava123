package com.gos.questionnaire.service;

import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.gos.questionnaire.beans.AaiAbcDimQtnCategory;
import com.gos.questionnaire.beans.AaiAbcDimQtnType;
import com.gos.questionnaire.beans.QuestionBean;
import com.gos.questionnaire.repositories.QuestionCategoryRepository;
import com.gos.questionnaire.repositories.QuestionRepository;
import com.gos.questionnaire.repositories.QuestionTypeRepository;

public class QuestionService {
	
	public JsonNode getQuestion(QuestionRepository questionRepository, String questionId) {
		JsonNode questionBeanJson;
		try{
			QuestionBean questionBean=questionRepository.findOne(new BigInteger(questionId));
		    questionBeanJson = JsonNodeFactory.instance.pojoNode(questionBean);
		}catch (Exception e) {
			e.printStackTrace();
			questionBeanJson=null;
		}
		return questionBeanJson;
	}
	
	public JsonNode getAllQuestions(QuestionRepository questionRepository) {
		JsonNode questionsBeanJson;
		try{
			List<QuestionBean> questionBean=(List<QuestionBean>) questionRepository.findAll();
			questionsBeanJson = JsonNodeFactory.instance.pojoNode(questionBean);
		}catch (Exception e) {
			e.printStackTrace();
			questionsBeanJson=null;
		}
		return questionsBeanJson;
	}
	
	public Boolean deleteQuestion(QuestionRepository questionRepository,String questionId) {
		try {
			questionRepository.delete(new BigInteger(questionId));
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public JsonNode getQuestionCategory(QuestionCategoryRepository questionCategoryRepository) {
		JsonNode questionCatJson;
		try{
			List<AaiAbcDimQtnCategory> questionCategoryBean=(List<AaiAbcDimQtnCategory>) questionCategoryRepository.findAll();
			questionCatJson = JsonNodeFactory.instance.pojoNode(questionCategoryBean);
		}catch (Exception e) {
			e.printStackTrace();
			questionCatJson=null;
		}
		return questionCatJson;
	}
	
	public JsonNode getQuestionTypes(QuestionTypeRepository questionTypeRepository) {
		JsonNode questionTypeJson;
		try {
			List<AaiAbcDimQtnType> questionTypeBean= (List<AaiAbcDimQtnType>) questionTypeRepository.findAll();
			questionTypeJson= JsonNodeFactory.instance.pojoNode(questionTypeBean);
			return questionTypeJson;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Boolean saveQuestion(QuestionRepository qRepo,QuestionBean qBean) {
		try {
			qRepo.save(qBean);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
