package com.gos.questionnaire.beans;
import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name="AAI_ABC_FCT_QUESTION_MLS")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="aaiAbcFctQuestionMlsPK")
public class AaiAbcFctQuestionMls implements Serializable{
	public AaiAbcFctQuestionMls(){
	}
	@EmbeddedId
	public AaiAbcFctQuestionMlsPK aaiAbcFctQuestionMlsPK;

	@ManyToOne(optional = false)
	@JoinColumn(name="N_QTN_ID",referencedColumnName="N_QTN_ID",insertable=false, updatable=false)
	public QuestionBean aaiAbcFctQuestion_nQtnId;

	@JsonProperty("VQtnDesc")
	@Column(name="V_QTN_DESC", nullable = true)
	public String vQtnDesc;

	@JsonProperty("NQtnCd")
	@Column(name="N_QTN_CD", nullable = true)
	public BigInteger nQtnCd;

	@JsonProperty("VQtnName")
	@Column(name="V_QTN_NAME", nullable = true)
	public String vQtnName;


	public AaiAbcFctQuestionMlsPK getAaiAbcFctQuestionMlsPK(){
		return aaiAbcFctQuestionMlsPK;
	}

	public void setAaiAbcFctQuestionMlsPK(AaiAbcFctQuestionMlsPK aaiAbcFctQuestionMlsPK){
		this.aaiAbcFctQuestionMlsPK = aaiAbcFctQuestionMlsPK;
	}

	public QuestionBean getAaiAbcFctQuestion_nQtnId(){
		return aaiAbcFctQuestion_nQtnId;
	}

	public void setAaiAbcFctQuestion_nQtnId(QuestionBean aaiAbcFctQuestion_nQtnId){
		this.aaiAbcFctQuestion_nQtnId = aaiAbcFctQuestion_nQtnId;
	}

	
	public String getVQtnDesc(){
		return vQtnDesc;
	}

	public void setVQtnDesc(String vQtnDesc){
		this.vQtnDesc = vQtnDesc;
	}
	
	public BigInteger getNQtnCd(){
		return nQtnCd;
	}

	public void setNQtnCd(BigInteger nQtnCd){
		this.nQtnCd = nQtnCd;
	}

	public String getVQtnName(){
		return vQtnName;
	}

	public void setVQtnName(String vQtnName){
		this.vQtnName = vQtnName;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(); 
		str.append("AaiAbcFctQuestionMls [");
		str.append("aaiAbcFctQuestionMlsPK="+aaiAbcFctQuestionMlsPK+", ");
		str.append((aaiAbcFctQuestion_nQtnId!=null)?"aaiAbcFctQuestion_nQtnId.getNQtnId()="+aaiAbcFctQuestion_nQtnId.getQuestionId()+", ":"aaiAbcFctQuestion_nQtnId.getNQtnId() is null, ");
		str.append("vQtnDesc="+vQtnDesc+", ");
		str.append("nQtnCd="+nQtnCd+", ");
		str.append("vQtnName="+vQtnName+", ");
		str.append("]");
		return str.toString();
	}
}