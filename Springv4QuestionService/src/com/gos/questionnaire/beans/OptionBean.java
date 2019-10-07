/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gos.questionnaire.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name ="AAI_ABC_FCT_QTN_ANSWER_OPTIONS")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="optionId")

public class OptionBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@JsonView(Views.GetRestJson.class)
	@Column(name = "N_OPTION_ID", precision = 15)
	private BigInteger optionId;

	@ManyToOne(optional = false)
	@JoinColumn(name = "N_QTN_ID", referencedColumnName = "N_QTN_ID")
	private QuestionBean questBean;

	@JsonProperty("optionDesc")
	@JsonView(Views.GetRestJson.class)
	@Column(name = "V_OPTION_DESC")
	private String optionDesc;	

	@JsonProperty("fromValue")
	@JsonView(Views.GetRestJson.class)
	@Column(name = "N_FROM_VAL")
	private double fromValue;

	@JsonProperty("toValue")
	@JsonView(Views.GetRestJson.class)
	@Column(name = "N_TO_VAL")
	private double toValue;

	@JsonProperty("operator")
	@JsonView(Views.GetRestJson.class)
	@Column(name = "V_OPERATOR")
	private String operator;

	@JsonProperty("v_OPTION_COLOR")
	@JsonView(Views.GetRestJson.class)
	@Column(name = "V_OPTION_COLOR")
	private String V_OPTION_COLOR;
	
	//**********for multilocale support
	@JsonView(Views.GetRestJson.class)
	@JsonProperty("SOURCE_LOCALE")
	@Column(name = "SOURCE_LOCALE")
	private String SOURCE_LOCALE;
	
	public String getSOURCE_LOCALE() {
		return SOURCE_LOCALE;
	}

	public void setSOURCE_LOCALE(String sOURCE_LOCALE) {
		SOURCE_LOCALE = sOURCE_LOCALE;
	}

	//********addded for multilocale support 
	@Transient
    private Long resultCategoryId;
    
    @Transient
    private List<Map<String, String>> resultCategoryList;
    
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aaiAbcFctQtnAnswerOptions_nOptionId", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AaiAbcFctQtnAnsOptMls> aaiAbcFctQtnAnsOptMls;
		
	public List<AaiAbcFctQtnAnsOptMls> getAaiAbcFctQtnAnsOptMls() {
		return aaiAbcFctQtnAnsOptMls;
	}

	public void setAaiAbcFctQtnAnsOptMls(
			List<AaiAbcFctQtnAnsOptMls> aaiAbcFctQtnAnsOptMls) {
		this.aaiAbcFctQtnAnsOptMls = aaiAbcFctQtnAnsOptMls;
	}
	
	public Long getResultCategoryId() {
		return resultCategoryId;
	}

	public void setResultCategoryId(Long resultCategoryId) {
		this.resultCategoryId = resultCategoryId;
	}

	public List<Map<String, String>> getResultCategoryList() {
		return resultCategoryList;
	}

	public void setResultCategoryList(List<Map<String, String>> resultCategoryList) {
		this.resultCategoryList = resultCategoryList;
	}

	public String getV_OPTION_COLOR() {
		return V_OPTION_COLOR;
	}

	public void setV_OPTION_COLOR(String v_OPTION_COLOR) {
		V_OPTION_COLOR = v_OPTION_COLOR;
	}

	/*@Override
	public int hashCode() {
		int hash = 0;
		hash += (getOptionId() != null ? getOptionId().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		//  Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof OptionBean)) {
			return false;
		}
		OptionBean other = (OptionBean) object;
		if ((this.getOptionId() == null && other.getOptionId() != null) || (this.getOptionId() != null && !this.optionId.equals(other.optionId))) {
			return false;
		}
		return true;
	}
*/
	
	
	public double getFromValue() {
		return fromValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof OptionBean))
			return false;
		OptionBean other = (OptionBean) obj;
		if (optionId == null) {
			if (other.optionId != null)
				return false;
		} else if (!optionId.equals(other.optionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OptionBean [optionId=" + optionId + ", optionDesc=" + optionDesc + ", fromValue=" + fromValue
				+ ", toValue=" + toValue + ", operator=" + operator + ", V_OPTION_COLOR=" + V_OPTION_COLOR
				+ ", SOURCE_LOCALE="+SOURCE_LOCALE+", resultCategoryId=" + resultCategoryId + "]";
	}

	public void setFromValue(double fromValue) {
		this.fromValue = fromValue;
	}

	public double getToValue() {
		return toValue;
	}

	public void setToValue(double toValue) {
		this.toValue = toValue;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public BigInteger getOptionId() {
		return optionId;
	}

	public void setOptionId(BigInteger optionId) {
		this.optionId = optionId;
	}

	public String getOptionDesc() {
		return optionDesc;
	}

	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}


	/*    public String getDeleteFlag() {
        return deleteFlag;
    }


    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }*/



	public QuestionBean getQuestBean() {
		return questBean;
	}

	public void setQuestBean(QuestionBean questBean) {
		this.questBean = questBean;
	}

}
