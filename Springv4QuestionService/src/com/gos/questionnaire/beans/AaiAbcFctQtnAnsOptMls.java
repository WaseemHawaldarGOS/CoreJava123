package com.gos.questionnaire.beans;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name="AAI_ABC_FCT_QTN_ANS_OPT_MLS")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
public class AaiAbcFctQtnAnsOptMls implements Serializable{
	public AaiAbcFctQtnAnsOptMls(){
	}
	@EmbeddedId
	public AaiAbcFctQtnAnsOptMlsPK aaiAbcFctQtnAnsOptMlsPK;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="N_OPTION_ID",referencedColumnName="N_OPTION_ID",insertable=false, updatable=false)
	public OptionBean aaiAbcFctQtnAnswerOptions_nOptionId;

	@JsonProperty("VOptionDesc")
	@Column(name="V_OPTION_DESC", nullable = true)
	public String vOptionDesc;


	public AaiAbcFctQtnAnsOptMlsPK getAaiAbcFctQtnAnsOptMlsPK(){
		return aaiAbcFctQtnAnsOptMlsPK;
	}

	public void setAaiAbcFctQtnAnsOptMlsPK(AaiAbcFctQtnAnsOptMlsPK aaiAbcFctQtnAnsOptMlsPK){
		this.aaiAbcFctQtnAnsOptMlsPK = aaiAbcFctQtnAnsOptMlsPK;
	}

	public OptionBean getAaiAbcFctQtnAnswerOptions_nOptionId(){
		return aaiAbcFctQtnAnswerOptions_nOptionId;
	}

	public void setAaiAbcFctQtnAnswerOptions_nOptionId(OptionBean aaiAbcFctQtnAnswerOptions_nOptionId){
		this.aaiAbcFctQtnAnswerOptions_nOptionId = aaiAbcFctQtnAnswerOptions_nOptionId;
	}

	public String getVOptionDesc(){
		return vOptionDesc;
	}

	public void setVOptionDesc(String vOptionDesc){
		this.vOptionDesc = vOptionDesc;
	}


	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(); 
		str.append("AaiAbcFctQtnAnsOptMls [");
		str.append("aaiAbcFctQtnAnsOptMlsPK="+aaiAbcFctQtnAnsOptMlsPK+", ");
		str.append((aaiAbcFctQtnAnswerOptions_nOptionId!=null)?"aaiAbcFctQtnAnswerOptions_nOptionId.getNOptionId()="+aaiAbcFctQtnAnswerOptions_nOptionId.getOptionId()+", ":"aaiAbcFctQtnAnswerOptions_nOptionId.getNOptionId() is null, ");
		str.append("vOptionDesc="+vOptionDesc+", ");
		str.append("]");
		return str.toString();
	}
}