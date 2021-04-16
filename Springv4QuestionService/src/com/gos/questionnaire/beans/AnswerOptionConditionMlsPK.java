package com.gos.questionnaire.beans;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AnswerOptionConditionMlsPK implements Serializable{
	
	public AnswerOptionConditionMlsPK(){
	}
	
	@Column(name="N_ANS_OPT_COND_ID", nullable = false)
	public BigInteger nAnsOptCondId;

	@Column(name="METADATA_LOCALE", nullable = false)
	public String metadataLocalePK;

	public BigInteger getnAnsOptCondId() {
		return nAnsOptCondId;
	}

	public void setnAnsOptCondId(BigInteger nAnsOptCondId) {
		this.nAnsOptCondId = nAnsOptCondId;
	}

	public String getMetadataLocalePK() {
		return metadataLocalePK;
	}

	public void setMetadataLocalePK(String metadataLocalePK) {
		this.metadataLocalePK = metadataLocalePK;
	}

	@Override
	public String toString() {
		return "AnswerOptionConditionMlsPK [nAnsOptCondId=" + nAnsOptCondId
				+ ", metadataLocalePK=" + metadataLocalePK + "]";
	}

	

}
