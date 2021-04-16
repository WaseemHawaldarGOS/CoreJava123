package com.gos.questionnaire.beans;
import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AaiAbcFctQtnAnsOptMlsPK implements Serializable   {

	public AaiAbcFctQtnAnsOptMlsPK(){
	}
	@Column(name="N_OPTION_ID", nullable = false)
	public BigInteger nOptionIdPK;

	@Column(name="METADATA_LOCALE", nullable = false)
	public String metadataLocalePK;


	


	public BigInteger getnOptionIdPK() {
		return nOptionIdPK;
	}

	public void setnOptionIdPK(BigInteger nOptionIdPK) {
		this.nOptionIdPK = nOptionIdPK;
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
		str.append("AaiAbcFctQtnAnsOptMls [");
		str.append("nOptionIdPK="+nOptionIdPK+", ");
		str.append("metadataLocalePK="+metadataLocalePK+", ");
		str.append("]");
		return str.toString();
	}

}