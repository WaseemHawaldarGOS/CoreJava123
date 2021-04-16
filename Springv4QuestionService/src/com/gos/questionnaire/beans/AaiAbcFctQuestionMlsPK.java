package com.gos.questionnaire.beans;
import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AaiAbcFctQuestionMlsPK implements Serializable   {

	public AaiAbcFctQuestionMlsPK(){
	}
	@Column(name="N_QTN_ID", nullable = false)
	public BigInteger nQtnIdPK;

	@Column(name="METADATA_LOCALE", nullable = false)
	public String metadataLocalePK;


	
	public BigInteger getnQtnIdPK() {
		return nQtnIdPK;
	}



	public void setnQtnIdPK(BigInteger nQtnIdPK) {
		this.nQtnIdPK = nQtnIdPK;
	}



	public String getMetadataLocalePK() {
		return metadataLocalePK;
	}



	public void setMetadataLocalePK(String metadataLocalePK) {
		this.metadataLocalePK = metadataLocalePK;
	}



	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(); 
		str.append("AaiAbcFctQuestionMls [");
		str.append("nQtnIdPK="+nQtnIdPK+", ");
		str.append("metadataLocalePK="+metadataLocalePK+", ");
		str.append("]");
		return str.toString();
	}

}