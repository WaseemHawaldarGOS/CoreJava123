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
@Table(name ="AAI_ABC_DIM_QTN_TYPE")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="n_qtn_type_id")
public class AaiAbcDimQtnType implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@JsonView(Views.GetRestJson.class)
	@Column(name = "n_qtn_type_id", precision = 15)
	private BigInteger n_qtn_type_id;
	
	@JsonView(Views.GetRestJson.class)
	@Column(name = "v_qtn_type_desc")
	private String v_qtn_type_desc;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonView(Views.GetRestJson.class)
	@Column(name = "d_created_dt", precision = 15)
	private Date d_created_dt;
	
	@JsonView(Views.GetRestJson.class)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aaiAbcDimQtnTypeBean", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AaiAbcDimQtnTypeMls> aaiAbcDimQtnTypeMlsBean;

}
