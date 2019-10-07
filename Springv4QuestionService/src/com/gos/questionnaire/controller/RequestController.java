package com.gos.questionnaire.controller;


import com.gos.questionnaire.repositories.QuestionCategoryRepository;
import com.gos.questionnaire.repositories.QuestionRepository;
import com.gos.questionnaire.repositories.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gos.questionnaire.apigateway.QtnApiGateWay;

@RestController
public class RequestController {
	
	@Autowired 
	private QuestionRepository questionRepository;
	
	@Autowired
	private QuestionCategoryRepository questionCategoryRepository;
	
	@Autowired
	private QuestionTypeRepository questionTypeRepository;
	
	@GetMapping("/getQuestion/{questionId}")
	public ResponseEntity<JsonNode> getQuestion(@RequestParam(value="locale", defaultValue="en_US") String locale,@PathVariable("questionId") String questionId,@RequestParam(value="jndiName", defaultValue="") String jndiName){
		try {
			QtnApiGateWay qtnApiGateWay= new QtnApiGateWay(questionRepository);
			return new ResponseEntity<JsonNode>(qtnApiGateWay.getQuestion(questionId),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<JsonNode>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllQuestions")
	public ResponseEntity<JsonNode> getAllQuestions(@RequestParam(value="locale", defaultValue="en_US") String locale,@RequestParam(value="jndiName", defaultValue="") String jndiName){
		try {
			QtnApiGateWay qtnApiGateWay= new QtnApiGateWay(questionRepository,questionCategoryRepository,questionTypeRepository);
			return new ResponseEntity<JsonNode>(qtnApiGateWay.getAllQuestions(),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<JsonNode>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/deleteQuestion/{questionId}")
	public ResponseEntity<String> deleteQuestion(@RequestParam(value="locale", defaultValue="en_US") String locale,@PathVariable("questionId") String questionId,@RequestParam(value="jndiName", defaultValue="") String jndiName){
		try {
			QtnApiGateWay qtnApiGateWay= new QtnApiGateWay(questionRepository);
			return new ResponseEntity<String>(qtnApiGateWay.deleteQuestion(questionId),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/saveQuestion", method = RequestMethod.POST, 
			consumes = "application/json")
	public ResponseEntity<String> saveQuestion(@RequestBody String saveJson){

		try {
			QtnApiGateWay qtnApiGateWay= new QtnApiGateWay(questionRepository);
			return new ResponseEntity<String>(qtnApiGateWay.saveQuestion(saveJson),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
