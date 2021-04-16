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
@Table(name="aai_abc_dim_qtn_category_mls")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="aaiAbcDimQtnCatMlsPk")
public class AaiAbcDimQtnCatMls implements Serializable{

	private static final long serialVersionUID = 1L;
			
	@EmbeddedId
	@JsonView(Views.GetRestJson.class)
	private AaiAbcDimQtnCatMlsPk aaiAbcDimQtnCatMlsPk;
	
	@JsonView(Views.GetRestJson.class)
	@Column(name="V_QTN_CATEGORY_DESC", nullable = true)
	private String V_QTN_CATEGORY_DESC;
	
	@JsonView(Views.GetRestJson.class)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="n_qtn_cat_id",referencedColumnName="n_qtn_cat_id",insertable=false, updatable=false)
	public AaiAbcDimQtnCategory qtnCategoryBean;

	public AaiAbcDimQtnCatMlsPk getAaiAbcDimQtnCatMlsPk() {
		return aaiAbcDimQtnCatMlsPk;
	}

	public void setAaiAbcDimQtnCatMlsPk(AaiAbcDimQtnCatMlsPk aaiAbcDimQtnCatMlsPk) {
		this.aaiAbcDimQtnCatMlsPk = aaiAbcDimQtnCatMlsPk;
	}

	public String getV_QTN_CATEGORY_DESC() {
		return V_QTN_CATEGORY_DESC;
	}

	public void setV_QTN_CATEGORY_DESC(String v_QTN_CATEGORY_DESC) {
		V_QTN_CATEGORY_DESC = v_QTN_CATEGORY_DESC;
	}

	public AaiAbcDimQtnCategory getQtnCategoryBean() {
		return qtnCategoryBean;
	}

	public void setQtnCategoryBean(AaiAbcDimQtnCategory qtnCategoryBean) {
		this.qtnCategoryBean = qtnCategoryBean;
	}
	
	
}
