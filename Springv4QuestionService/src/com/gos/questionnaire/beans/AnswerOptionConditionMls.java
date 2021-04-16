package com.gos.questionnaire.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name ="AAI_ABC_FCT_ANS_OPT_COND_MLS")
public class AnswerOptionConditionMls implements Serializable{
	
	public AnswerOptionConditionMls(){	
	}
	
	@EmbeddedId
	private AnswerOptionConditionMlsPK answerOptionConditionMlsPK;
	
	@JsonProperty("v_ANS_OPT_COND_NAME")
	@Column(name = "V_ANS_OPT_COND_NAME" , nullable = true) 
	private String V_ANS_OPT_COND_NAME;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name="N_ANS_OPT_COND_ID",referencedColumnName="N_ANS_OPT_COND_ID",insertable=false, updatable=false)
	private AnswerOptionsConditionBean answerOptionsConditionBeanCycleRem;

	
	public AnswerOptionConditionMlsPK getAnswerOptionConditionMlsPK() {
		return answerOptionConditionMlsPK;
	}

	public void setAnswerOptionConditionMlsPK(
			AnswerOptionConditionMlsPK answerOptionConditionMlsPK) {
		this.answerOptionConditionMlsPK = answerOptionConditionMlsPK;
	}

	public String getV_ANS_OPT_COND_NAME() {
		return V_ANS_OPT_COND_NAME;
	}

	public void setV_ANS_OPT_COND_NAME(String v_ANS_OPT_COND_NAME) {
		V_ANS_OPT_COND_NAME = v_ANS_OPT_COND_NAME;
	}

	public AnswerOptionsConditionBean getAnswerOptionsConditionBeanCycleRem() {
		return answerOptionsConditionBeanCycleRem;
	}

	public void setAnswerOptionsConditionBeanCycleRem(
			AnswerOptionsConditionBean answerOptionsConditionBeanCycleRem) {
		this.answerOptionsConditionBeanCycleRem = answerOptionsConditionBeanCycleRem;
	}

	@Override
	public String toString() {
		return "AnswerOptionConditionMls [answerOptionConditionMlsPK="
				+ answerOptionConditionMlsPK + ", V_ANS_OPT_COND_NAME="
				+ V_ANS_OPT_COND_NAME +"]";
	}

	
}
