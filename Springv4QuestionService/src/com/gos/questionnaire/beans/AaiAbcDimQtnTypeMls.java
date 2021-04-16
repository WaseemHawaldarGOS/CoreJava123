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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name="AAI_ABC_DIM_QTN_TYPE_MLS")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="aaiAbcDimQtnTypeMlsPk")
public class AaiAbcDimQtnTypeMls implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@JsonView(Views.GetRestJson.class)
	private AaiAbcDimQtnTypeMlsPk aaiAbcDimQtnTypeMlsPk;
	
	@JsonView(Views.GetRestJson.class)
	@Column(name="v_qtn_type_desc", nullable = true)
	private String v_qtn_type_desc;
	
	@JsonView(Views.GetRestJson.class)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="n_qtn_type_id",referencedColumnName="n_qtn_type_id",insertable=false, updatable=false)
	public AaiAbcDimQtnType aaiAbcDimQtnTypeBean;

	public AaiAbcDimQtnTypeMlsPk getAaiAbcDimQtnTypeMlsPk() {
		return aaiAbcDimQtnTypeMlsPk;
	}

	public void setAaiAbcDimQtnTypeMlsPk(AaiAbcDimQtnTypeMlsPk aaiAbcDimQtnTypeMlsPk) {
		this.aaiAbcDimQtnTypeMlsPk = aaiAbcDimQtnTypeMlsPk;
	}

	public String getvQtnTypeDesc() {
		return v_qtn_type_desc;
	}

	public void setvQtnTypeDesc(String vQtnTypeDesc) {
		this.v_qtn_type_desc = vQtnTypeDesc;
	}
	
	
}
