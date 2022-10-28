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
@Table(name="mapping_process_configuration")
public class MappingProcessConfiguration {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "mapping_process_configuration_id")
	private UUID mappingProcessConfigurationId;
	
	@Column(name = "process_type")
	private String processType;
	
	@Column(name = "from_source")
	private String fromSource;
	
	@Column(name = "from_value")
	private String fromValue;
	
	@Column(name = "from_value_descr")
	private String fromValueDescr;
	
	@Column(name = "to_source")
	private String toSource;
	
	@Column(name = "to_value")
	private String toValue;
	
	@Column(name = "to_value_descr")
	private String toValueDescr;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;

	public UUID getMappingProcessConfigurationId() {
		return mappingProcessConfigurationId;
	}

	public void setMappingProcessConfigurationId(UUID mappingProcessConfigurationId) {
		this.mappingProcessConfigurationId = mappingProcessConfigurationId;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getFromSource() {
		return fromSource;
	}

	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	public String getFromValue() {
		return fromValue;
	}

	public void setFromValue(String fromValue) {
		this.fromValue = fromValue;
	}

	public String getFromValueDescr() {
		return fromValueDescr;
	}

	public void setFromValueDescr(String fromValueDescr) {
		this.fromValueDescr = fromValueDescr;
	}

	public String getToSource() {
		return toSource;
	}

	public void setToSource(String toSource) {
		this.toSource = toSource;
	}

	public String getToValue() {
		return toValue;
	}

	public void setToValue(String toValue) {
		this.toValue = toValue;
	}

	public String getToValueDescr() {
		return toValueDescr;
	}

	public void setToValueDescr(String toValueDescr) {
		this.toValueDescr = toValueDescr;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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
	
	

}
