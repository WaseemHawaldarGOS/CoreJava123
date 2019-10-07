/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@Entity
@Table(name = "AAI_ABC_FCT_QUESTION")
@JsonAutoDetect(fieldVisibility =Visibility.ANY, getterVisibility = Visibility.NONE)
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="questionId")
public class QuestionBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonView(Views.GetRestJson.class)
    @JsonProperty("questionId")
    @Column(name = "N_QTN_ID", precision = 15)
    private BigInteger questionId;

    @JsonProperty("questionCode")
    @Column(name = "N_QTN_CD")
    private BigInteger questionCode;

    @JsonProperty("questionName")
    @JsonView(Views.GetRestJson.class)
    @Column(name = "V_QTN_NAME")
    private String questionName;
    
    @Column(name = "V_USED_IN_DT_LOGIC")
    private String freeTextUsedInDtLogic;
    
    @JsonView(Views.GetRestJson.class)
	@Column(name = "V_APP_ID")
	private String appId;

	@Transient
    @JsonView(Views.GetRestJson.class)
    private BigInteger sectionQuestMapId;
	
	@Transient
	String secFlag = "false";
    
	public BigInteger getSectionQuestMapId() {
		return sectionQuestMapId;
	}

	public void setSectionQuestMapId(BigInteger sectionQuestMapId) {
		this.sectionQuestMapId = sectionQuestMapId;
	}

	@JsonProperty("questionDesc")
	@JsonView(Views.GetRestJson.class)
	@Column(name = "V_QTN_DESC")
    private String questionDesc;

    @Column(name = "N_CATEGORY_ID")
    private String categoryId;

	@Column(name = "V_MANDATORY_YN")
    private String mandatoryYN;

	@JsonView(Views.GetRestJson.class)
    @Column(name = "N_SEL_TYPE_ID")
    private int selectedTypeId;
    
	@Column(name = "V_DOC_YN")
    private String documentYN;

	@JsonView(Views.GetRestJson.class)
    @Column(name = "N_DISP_TYPE_ID")
    private int displayTypeId;

    @Column(name = "V_CMMNT_YN")
    private String commentYN;

    @Column(name = "V_USED_FLG")
    private String usedFlag;

    @Column(name = "N_OR_STATUS_CD")
    private int statusFlag;

    @Column(name = "N_VERSION")
    private int version;

    @Column(name = "V_IS_LATEST")
    private String isLatest;

    @Column(name = "N_QTNR_ID")
    private BigInteger qtnrId;

    //@JsonSerialize(using = CustomDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "D_START_DT")
    private Date startDate;

    //@JsonSerialize(using = CustomDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "D_END_DT")
    private Date endDate;
    
    //@JsonSerialize(using = CustomDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "D_CREATED_DT")
    private Date createdDate;

    //@JsonSerialize(using = CustomDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "D_MODIFIED_DT")
    private Date modifiedDate;

    @Column(name = "V_CREATED_BY")
    private String createdBy;

    @Column(name = "V_MODIFIED_BY")
    private String modifiedBy;

    @Transient
    @JsonView(Views.GetRestJson.class)
    private Long questionWeightage;

	public Long getQuestionWeightage() {

        return questionWeightage;
    }

    public void setQuestionWeightage(Long questionWeightage) {

        this.questionWeightage = questionWeightage;
    }

    @Column(name = "N_QTN_OPT_TYPE_ID")
	private int questionOptionType;
    
	public int getQuestionOptionType() {
		return questionOptionType;
	}
	
	@Column(name = "N_LATEST_QTN_OPT_TYPE_ID")
	private int latestQuestionOptionType;
	
	public int getLatestQuestionOptionType() {
		return latestQuestionOptionType;
	}

	public void setLatestQuestionOptionType(int latestQuestionOptionType) {
		this.latestQuestionOptionType = latestQuestionOptionType;
	}

	public void setQuestionOptionType(int questionOptionTypes) {
		this.questionOptionType = questionOptionTypes;
	}

	@JsonView(Views.GetRestJson.class)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "questBean", orphanRemoval = true, fetch = FetchType.EAGER)
    @OrderBy("optionId asc")
    private List<OptionBean> options;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aaiAbcFctQuestion_nQtnId", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<AaiAbcFctQuestionMls> aaiAbcFctQuestionMls;
	

	@OneToOne(optional=false, cascade = CascadeType.ALL)
    @JoinColumn(name="N_QTN_ID", nullable=false, insertable=false, updatable=false, referencedColumnName="N_QTN_ID")
	private QuestionDynamicAnswerOptions dynamicAnswerOptions; 
	
	//added for storing source locale -muhsina
	@Column(name = "SOURCE_LOCALE")
	private String sourceLocale;
		
	public String getSourceLocale() {
		return sourceLocale;
	}

	public void setSourceLocale(String sourceLocale) {
		this.sourceLocale = sourceLocale;
	}

	
	
	public QuestionDynamicAnswerOptions getDynamicAnswerOptions() {
		return dynamicAnswerOptions;
	}
	
	public void setDynamicAnswerOptions(QuestionDynamicAnswerOptions dynamicAnswerOptions) {
		this.dynamicAnswerOptions = dynamicAnswerOptions;
	}

	@PrePersist
    public void initializeQtnId() {
		if(questionOptionType == 2){
			this.dynamicAnswerOptions.setN_QTN_ID(questionId);
		}
    }

	@Transient
    private BigInteger rUId;
    
    @Transient
    private String rUText;

    @Transient
    private String rUNum;
    
    public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
    public String getDocumentYN() {
		return documentYN;
	}

	public void setDocumentYN(String documentYN) {
		this.documentYN = documentYN;
	}

	public BigInteger getrUId() {

        return rUId;
    }

    public void setrUId(BigInteger rUId) {

        this.rUId = rUId;
    }

    public String getrUText() {

        return rUText;
    }

    public void setrUText(String rUText) {

        this.rUText = rUText;
    }

    public String getrUNum() {

        return rUNum;
    }

    public void setrUNum(String rUNum) {

        this.rUNum = rUNum;
    }

    public List<OptionBean> getOptions() {

        return options;
    }

    public void setOptions(List<OptionBean> options) {

        this.options = options;
    }

    
/*    @Override
    public int hashCode() {

        int hash = 0;
        hash += (getQuestionId() != null ? getQuestionId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuestionBean)) {
            return false;
        }
        QuestionBean other = (QuestionBean) object;
        if ((this.getQuestionId() == null && other.getQuestionId() != null) || (this.getQuestionId() != null && !this.questionId.equals(other.questionId))) {
            return false;
        }
        return true;
    }*/

   

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof QuestionBean))
			return false;
		QuestionBean other = (QuestionBean) obj;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuestionBean [questionId=" + questionId + ", questionCode=" + questionCode + ", questionName="
				+ questionName + ", sectionQuestMapId=" + sectionQuestMapId + ", questionDesc=" + questionDesc
				+ ", categoryId=" + categoryId + ", mandatoryYN=" + mandatoryYN + ", selectedTypeId=" + selectedTypeId
				+ ", documentYN=" + documentYN + ", displayTypeId=" + displayTypeId + ", commentYN=" + commentYN
				+ ", usedFlag=" + usedFlag + ", statusFlag=" + statusFlag + ", version=" + version + ", isLatest="
				+ isLatest + ", qtnrId=" + qtnrId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + ", questionWeightage=" + questionWeightage + ", questionOptionType="
				+ questionOptionType + ", options=" + options + ", dynamicAnswerOptions=" + dynamicAnswerOptions
				+ ", rUId=" + rUId + ", rUText=" + rUText + ", rUNum=" + rUNum + ", qtnRespId=" + qtnRespId+", sourceLocale="+sourceLocale + " , latestquestionoptiontype="+latestQuestionOptionType+"]";
	}

	/**
     * @return the questionId
     */
    public BigInteger getQuestionId() {

        return questionId;
    }

    /**
     * @param questionId the questionId to set
     */
    public void setQuestionId(BigInteger questionId) {

        this.questionId = questionId;
    }

    /**
     * @return the questionCode
     */
    public BigInteger getQuestionCode() {

        return questionCode;
    }

    /**
     * @param questionCode the questionCode to set
     */
    public void setQuestionCode(BigInteger questionCode) {

        this.questionCode = questionCode;
    }

    /**
     * @return the questionName
     */
    public String getQuestionName() {

        return questionName;
    }

    /**
     * @param questionName the questionName to set
     */
    public void setQuestionName(String questionName) {

        this.questionName = questionName;
    }

    /**
     * @return the questionDesc
     */
    public String getQuestionDesc() {

        return questionDesc;
    }

    /**
     * @param questionDesc the questionDesc to set
     */
    public void setQuestionDesc(String questionDesc) {

        this.questionDesc = questionDesc;
    }

    public String getCategoryId() {

        return categoryId;
    }

    public void setCategoryId(String categoryId) {

        this.categoryId = categoryId;
    }

    /**
     * @return the selectedTypeId
     */
    public int getSelectedTypeId() {

        return selectedTypeId;
    }

    /**
     * @param selectedTypeId the selectedTypeId to set
     */
    public void setSelectedTypeId(int selectedTypeId) {

        this.selectedTypeId = selectedTypeId;
    }

    /**
     * @return the displayTypeId
     */
    public int getDisplayTypeId() {

        return displayTypeId;
    }

    /**
     * @param displayTypeId the displayTypeId to set
     */
    public void setDisplayTypeId(int displayTypeId) {

        this.displayTypeId = displayTypeId;
    }

    /**
     * @return the commentYN
     */
    public String getCommentYN() {

        return commentYN;
    }

    /**
     * @param commentYN the commentYN to set
     */
    public void setCommentYN(String commentYN) {

        this.commentYN = commentYN;
    }

    /**
     * @return the usedFlag
     */
    public String getUsedFlag() {

        return usedFlag;
    }

    /**
     * @param usedFlag the usedFlag to set
     */
    public void setUsedFlag(String usedFlag) {

        this.usedFlag = usedFlag;
    }

    /**
     * @return the statusFlag
     */
    public int getStatusFlag() {

        return statusFlag;
    }

    /**
     * @param statusFlag the statusFlag to set
     */
    public void setStatusFlag(int statusFlag) {

        this.statusFlag = statusFlag;
    }

    /**
     * @return the version
     */
    public int getVersion() {

        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(int version) {

        this.version = version;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {

        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {

        this.createdBy = createdBy;
    }

    /**
     * @return the modifiedBy
     */
    public String getModifiedBy() {

        return modifiedBy;
    }

    /**
     * @param modifiedBy the modifiedBy to set
     */
    public void setModifiedBy(String modifiedBy) {

        this.modifiedBy = modifiedBy;
    }

    public Date getStartDate() {

        return startDate;
    }

    public void setStartDate(Date startDate) {

        this.startDate = startDate;
    }

    public Date getEndDate() {

        return endDate;
    }

    public void setEndDate(Date endDate) {

        this.endDate = endDate;
    }

    public Date getCreatedDate() {

        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {

        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {

        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {

        this.modifiedDate = modifiedDate;
    }

    public String getIsLatest() {

        return isLatest;
    }

    public void setIsLatest(String isLatest) {

        this.isLatest = isLatest;
    }

    public BigInteger getQtnrId() {

        return qtnrId;
    }

    public void setQtnrId(BigInteger qtnrId) {

        this.qtnrId = qtnrId;
    }

    public String getMandatoryYN() {

        return mandatoryYN;
    }

    public void setMandatoryYN(String mandatoryYN) {

        this.mandatoryYN = mandatoryYN;
    }
    
    
    
    public List<AaiAbcFctQuestionMls> getAaiAbcFctQuestionMls() {
		return aaiAbcFctQuestionMls;
	}

	public void setAaiAbcFctQuestionMls(
			List<AaiAbcFctQuestionMls> aaiAbcFctQuestionMls) {
		this.aaiAbcFctQuestionMls = aaiAbcFctQuestionMls;
	}


	/*GRC - I starts*/
    @Transient
	private BigInteger qtnRespId;
	
	public BigInteger getQtnRespId() {
		return qtnRespId;
	}

	public void setQtnRespId(BigInteger qtnRespId) {
		this.qtnRespId = qtnRespId;
	}
	/*GRC - I ends*/

	public String getFreeTextUsedInDtLogic() {
		return freeTextUsedInDtLogic;
	}

	public void setFreeTextUsedInDtLogic(String freeTextUsedInDtLogic) {
		this.freeTextUsedInDtLogic = freeTextUsedInDtLogic;
	}
	public String getSecFlag() {
		return secFlag;
	}

	public void setSecFlag(String secFlag) {
		this.secFlag = secFlag;
	}
	

}
