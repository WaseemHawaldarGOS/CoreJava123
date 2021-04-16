package com.gos.questionnaire.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name ="AAI_ABC_FCT_QTN_DYN_ANS_OPTS")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="n_DYN_ANS_OPTS_ID")
public class QuestionDynamicAnswerOptions implements Serializable {


	@Id
	@Column(name = "N_DYN_ANS_OPTS_ID")
	private BigInteger N_DYN_ANS_OPTS_ID;

	@Column(name = "N_QTN_ID", unique=true)
	private BigInteger N_QTN_ID;
	
	@Column(name = "V_OPT_KEY_COLUMN_NAME")
	private String V_OPT_KEY_COLUMN_NAME;	

	@Column(name = "V_OPT_DISPLAY_COLUMN_NAME")
	private String V_OPT_DISPLAY_COLUMN_NAME;

	@Column(name = "V_OPT_ANSI_JOIN")
	private String V_OPT_ANSI_JOIN;

	@Column(name = "V_OPT_FILTER_CONDITION")
	private String V_OPT_FILTER_CONDITION;
	
	@Transient
	private String Query;

	@Override
	public String toString() {
		return "QuestionDynamicAnswerOptions [N_DYN_ANS_OPTS_ID=" + N_DYN_ANS_OPTS_ID + ", N_QTN_ID=" + N_QTN_ID
				+ ", V_OPT_KEY_COLUMN_NAME=" + V_OPT_KEY_COLUMN_NAME + ", V_OPT_DISPLAY_COLUMN_NAME="
				+ V_OPT_DISPLAY_COLUMN_NAME + ", V_OPT_ANSI_JOIN=" + V_OPT_ANSI_JOIN + ", V_OPT_FILTER_CONDITION="
				+ V_OPT_FILTER_CONDITION + ", V_OPT_TYPE_COLUMN_NAME=" + V_OPT_TYPE_COLUMN_NAME + "]";
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dynamicAnswerOptionscyclerem", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AnswerOptionsConditionBean> answerOptionsConditionBean;
	
	public List<AnswerOptionsConditionBean> getAnswerOptionsConditionBean() {
		return answerOptionsConditionBean;
	}

	public void setAnswerOptionsConditionBean(List<AnswerOptionsConditionBean> answerOptionsConditionBean) {
		this.answerOptionsConditionBean = answerOptionsConditionBean;
	}

   // private QuestionBean qtnBean; 
	public BigInteger getN_DYN_ANS_OPTS_ID() {
		return N_DYN_ANS_OPTS_ID;
	}

	public void setN_DYN_ANS_OPTS_ID(BigInteger n_DYN_ANS_OPTS_ID) {
		N_DYN_ANS_OPTS_ID = n_DYN_ANS_OPTS_ID;
	}
	
	public BigInteger getN_QTN_ID() {
		return N_QTN_ID;
	}

	public void setN_QTN_ID(BigInteger n_QTN_ID) {
		N_QTN_ID = n_QTN_ID;
	}

	public String getV_OPT_KEY_COLUMN_NAME() {
		return V_OPT_KEY_COLUMN_NAME;
	}

	public void setV_OPT_KEY_COLUMN_NAME(String v_OPT_KEY_COLUMN_NAME) {
		V_OPT_KEY_COLUMN_NAME = v_OPT_KEY_COLUMN_NAME;
	}
	
	@Column(name = "V_OPT_TYPE_COLUMN_NAME")
	private String V_OPT_TYPE_COLUMN_NAME;

	public String getV_OPT_TYPE_COLUMN_NAME() {
		return V_OPT_TYPE_COLUMN_NAME;
	}

	public void setV_OPT_TYPE_COLUMN_NAME(String v_OPT_TYPE_COLUMN_NAME) {
		V_OPT_TYPE_COLUMN_NAME = v_OPT_TYPE_COLUMN_NAME;
	}

	public String getV_OPT_DISPLAY_COLUMN_NAME() {
		return V_OPT_DISPLAY_COLUMN_NAME;
	}

	public void setV_OPT_DISPLAY_COLUMN_NAME(String v_OPT_DISPLAY_COLUMN_NAME) {
		V_OPT_DISPLAY_COLUMN_NAME = v_OPT_DISPLAY_COLUMN_NAME;
	}

	public String getV_OPT_ANSI_JOIN() {
		return V_OPT_ANSI_JOIN;
	}

	public void setV_OPT_ANSI_JOIN(String v_OPT_ANSI_JOIN) {
		V_OPT_ANSI_JOIN = v_OPT_ANSI_JOIN;
	}

	public String getV_OPT_FILTER_CONDITION() {
		return V_OPT_FILTER_CONDITION;
	}

	public void setV_OPT_FILTER_CONDITION(String v_OPT_FILTER_CONDITION) {
		V_OPT_FILTER_CONDITION = v_OPT_FILTER_CONDITION;
	}

	public String getQuery() {
		return Query;
	}

	public void setQuery(String query) {
		Query = query;
	}



}
