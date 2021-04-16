package com.gos.questionnaire.beans;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Embeddable
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="N_QTN_CAT_ID")

public class AaiAbcDimQtnCatMlsPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonView(Views.GetRestJson.class)
	@Column(name="N_QTN_CAT_ID", nullable = false)
	public BigInteger N_QTN_CAT_ID;

	@JsonView(Views.GetRestJson.class)
	@Column(name="DESCLOCALE", nullable = false)
	public String DESCLOCALE;

	public BigInteger getN_QTN_CAT_ID() {
		return N_QTN_CAT_ID;
	}

	public void setN_QTN_CAT_ID(BigInteger n_QTN_CAT_ID) {
		N_QTN_CAT_ID = n_QTN_CAT_ID;
	}

	public String getDESCLOCALE() {
		return DESCLOCALE;
	}

	public void setDESCLOCALE(String dESCLOCALE) {
		DESCLOCALE = dESCLOCALE;
	}


}
