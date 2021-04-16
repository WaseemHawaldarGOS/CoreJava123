package com.gos.questionnaire.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name ="aai_abc_dim_qtn_category")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="n_qtn_cat_id")
public class AaiAbcDimQtnCategory implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@JsonView(Views.GetRestJson.class)
	@Column(name = "n_qtn_cat_id", precision = 15)
	private BigInteger n_qtn_cat_id;
	
	@JsonView(Views.GetRestJson.class)
	@Column(name = "v_qtn_category_desc")
	private String v_qtn_category_desc;
	
	/*@Column(name = "f_is_deleted")
	private String f_is_deleted;*/
	

	@Temporal(TemporalType.TIMESTAMP)
	@JsonView(Views.GetRestJson.class)
	@Column(name = "d_created_dt", precision = 15)
	private Date d_created_dt;
	
	@JsonView(Views.GetRestJson.class)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "qtnCategoryBean", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AaiAbcDimQtnCatMls> qtnCategoryMlsBean;
	
	/*public String getF_is_deleted() {
		return f_is_deleted;
	}

	public void setF_is_deleted(String f_is_deleted) {
		this.f_is_deleted = f_is_deleted;
	}*/

	public BigInteger getN_qtn_cat_id() {
		return n_qtn_cat_id;
	}

	public void setN_qtn_cat_id(BigInteger n_qtn_cat_id) {
		this.n_qtn_cat_id = n_qtn_cat_id;
	}

	public String getV_qtn_category_desc() {
		return v_qtn_category_desc;
	}

	public void setV_qtn_category_desc(String v_qtn_category_desc) {
		this.v_qtn_category_desc = v_qtn_category_desc;
	}

	public Date getD_created_dt() {
		return d_created_dt;
	}

	public void setD_created_dt(Date d_created_dt) {
		this.d_created_dt = d_created_dt;
	}

	public List<AaiAbcDimQtnCatMls> getQtnCategoryMlsBean() {
		return qtnCategoryMlsBean;
	}

	public void setQtnCategoryMlsBean(List<AaiAbcDimQtnCatMls> qtnCategoryMlsBean) {
		this.qtnCategoryMlsBean = qtnCategoryMlsBean;
	}

	
}
