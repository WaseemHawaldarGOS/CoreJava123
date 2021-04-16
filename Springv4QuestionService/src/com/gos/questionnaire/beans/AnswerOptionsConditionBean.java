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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name ="AAI_ABC_FCT_ANS_OPT_CONDITIONS")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="N_ANS_OPT_COND_ID")
public class AnswerOptionsConditionBean implements Serializable {

	@Id
	@JsonProperty("N_ANS_OPT_COND_ID")
	@Column(name = "N_ANS_OPT_COND_ID", precision = 15)
	private BigInteger N_ANS_OPT_COND_ID;
	
	@JsonProperty("V_ANS_OPT_COND_NAME")
	@Column(name = "V_ANS_OPT_COND_NAME")
	private String V_ANS_OPT_COND_NAME;
	
	
	
	
	@Override
	public String toString() {
		return "AnswerOptionsConditionBean [N_ANS_OPT_COND_ID=" + N_ANS_OPT_COND_ID + ", V_ANS_OPT_COND_NAME="
				+ V_ANS_OPT_COND_NAME + ", V_OPT_TYPE_VALUE=" + V_OPT_TYPE_VALUE + ", N_QTN_ANS_COND_SCOPE_ID="
				+ N_QTN_ANS_COND_SCOPE_ID + ", N_OPERATOR_ID=" + N_OPERATOR_ID + " SOURCE_LOCALE= "+SOURCE_LOCALE+"]";
	}

	@JsonProperty("V_OPT_TYPE_VALUE")
	@Column(name = "V_OPT_TYPE_VALUE")
	private String V_OPT_TYPE_VALUE;
	
	@JsonProperty("N_QTN_ANS_COND_SCOPE_ID")
	@Column(name = "N_QTN_ANS_COND_SCOPE_ID")
	private int N_QTN_ANS_COND_SCOPE_ID;
	
	@JsonProperty("N_OPERATOR_ID")
	@Column(name = "N_OPERATOR_ID")
	private int N_OPERATOR_ID;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "N_DYN_ANS_OPTS_ID", referencedColumnName = "N_DYN_ANS_OPTS_ID")
	private QuestionDynamicAnswerOptions dynamicAnswerOptionscyclerem;
	
	//******* for multilocale support
	@JsonProperty("SOURCE_LOCALE")
	@Column(name = "SOURCE_LOCALE")
	private String SOURCE_LOCALE;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "answerOptionsConditionBeanCycleRem", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AnswerOptionConditionMls> answerOptionConditionMls;
	
	public List<AnswerOptionConditionMls> getAnswerOptionConditionMls() {
		return answerOptionConditionMls;
	}

	public void setAnswerOptionConditionMls(
			List<AnswerOptionConditionMls> answerOptionConditionMls) {
		this.answerOptionConditionMls = answerOptionConditionMls;
	}

	public String getSOURCE_LOCALE() {
		return SOURCE_LOCALE;
	}

	public void setSOURCE_LOCALE(String sOURCE_LOCALE) {
		SOURCE_LOCALE = sOURCE_LOCALE;
	}
	
	
	//*** for multilocale support

	

	public QuestionDynamicAnswerOptions getDynamicAnswerOptionscyclerem() {
		return dynamicAnswerOptionscyclerem;
	}

	public void setDynamicAnswerOptionscyclerem(QuestionDynamicAnswerOptions dynamicAnswerOptionscyclerem) {
		this.dynamicAnswerOptionscyclerem = dynamicAnswerOptionscyclerem;
	}

	public BigInteger getN_ANS_OPT_COND_ID() {
		return N_ANS_OPT_COND_ID;
	}

	public void setN_ANS_OPT_COND_ID(BigInteger n_ANS_OPT_COND_ID) {
		N_ANS_OPT_COND_ID = n_ANS_OPT_COND_ID;
	}

	public String getV_ANS_OPT_COND_NAME() {
		return V_ANS_OPT_COND_NAME;
	}

	public void setV_ANS_OPT_COND_NAME(String v_ANS_OPT_COND_NAME) {
		V_ANS_OPT_COND_NAME = v_ANS_OPT_COND_NAME;
	}


	public String getV_OPT_TYPE_VALUE() {
		return V_OPT_TYPE_VALUE;
	}

	public void setV_OPT_TYPE_VALUE(String v_OPT_TYPE_VALUE) {
		V_OPT_TYPE_VALUE = v_OPT_TYPE_VALUE;
	}

	public int getN_QTN_ANS_COND_SCOPE_ID() {
		return N_QTN_ANS_COND_SCOPE_ID;
	}

	public void setN_QTN_ANS_COND_SCOPE_ID(int n_QTN_ANS_COND_SCOPE_ID) {
		N_QTN_ANS_COND_SCOPE_ID = n_QTN_ANS_COND_SCOPE_ID;
	}

	public int getN_OPERATOR_ID() {
		return N_OPERATOR_ID;
	}

	public void setN_OPERATOR_ID(int n_OPERATOR_ID) {
		N_OPERATOR_ID = n_OPERATOR_ID;
	}
}
