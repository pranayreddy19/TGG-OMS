package com.tgg.tggoms.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "experience_lookup")
public class ExperienceLookup {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "experience_lookup_id")
	private UUID experienceLookupId;
	
	@Column(name = "experience_id")
	private Integer experienceId;
	
	@Column(name = "experience_code")
	private String experienceCode;
	
	@Column(name = "experience_desc")
	private String experienceDesc;
	
	@Column(name = "experience_type")
	private String experienceType;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "sup_prod_number")
	private String supProdNumber;
	
	@Column(name = "is_default")
	private boolean isDefault;
	
	@Column(name = "experience_short_desc")
	private String experienceShortDesc;

	public UUID getExperienceLookupId() {
		return experienceLookupId;
	}

	public void setExperienceLookupId(UUID experienceLookupId) {
		this.experienceLookupId = experienceLookupId;
	}

	public Integer getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}

	public String getExperienceCode() {
		return experienceCode;
	}

	public void setExperienceCode(String experienceCode) {
		this.experienceCode = experienceCode;
	}

	public String getExperienceDesc() {
		return experienceDesc;
	}

	public void setExperienceDesc(String experienceDesc) {
		this.experienceDesc = experienceDesc;
	}

	public String getExperienceType() {
		return experienceType;
	}

	public void setExperienceType(String experienceType) {
		this.experienceType = experienceType;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getSupProdNumber() {
		return supProdNumber;
	}

	public void setSupProdNumber(String supProdNumber) {
		this.supProdNumber = supProdNumber;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getExperienceShortDesc() {
		return experienceShortDesc;
	}

	public void setExperienceShortDesc(String experienceShortDesc) {
		this.experienceShortDesc = experienceShortDesc;
	}
	
	

}
