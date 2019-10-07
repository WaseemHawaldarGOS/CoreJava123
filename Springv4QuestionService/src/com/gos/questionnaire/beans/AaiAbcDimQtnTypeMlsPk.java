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
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="n_qtn_type_id")
public class AaiAbcDimQtnTypeMlsPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonView(Views.GetRestJson.class)
	@Column(name="n_qtn_type_id", nullable = false)
	public BigInteger n_qtn_type_id;

	@JsonView(Views.GetRestJson.class)
	@Column(name="DESCLOCALE", nullable = false)
	public String desclocale;

	public BigInteger getnQtnTypeId() {
		return n_qtn_type_id;
	}

	public void setnQtnTypeId(BigInteger nQtnTypeId) {
		this.n_qtn_type_id = nQtnTypeId;
	}

	public String getDesclocale() {
		return desclocale;
	}

	public void setDesclocale(String desclocale) {
		this.desclocale = desclocale;
	}

}
