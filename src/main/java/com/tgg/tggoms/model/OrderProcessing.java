package com.tgg.tggoms.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="order_processing")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class OrderProcessing implements Serializable {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "processing_id")
	private UUID processingId;
	
	@Column(name = "device_id")
	private String deviceId;
	
	@Column(name = "processing_type")
	private String processingType;
	
	@Column(name = "reference_table")
	private String referenceTable;
	
	@Column(name = "reference_id")
	private UUID referenceId;
	
	@Column(name = "process_flag")
	private String processFlag;
	
	@Type(type = "jsonb")
	@Column(name = "detail_json", columnDefinition = "jsonb")
	private String detailJson;
	
	@Column(name = "date_created", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime dateCreated;

	public UUID getProcessingId() {
		return processingId;
	}

	public void setProcessingId(UUID processingId) {
		this.processingId = processingId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getProcessingType() {
		return processingType;
	}

	public void setProcessingType(String processingType) {
		this.processingType = processingType;
	}

	public String getReferenceTable() {
		return referenceTable;
	}

	public void setReferenceTable(String referenceTable) {
		this.referenceTable = referenceTable;
	}

	public UUID getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(UUID referenceId) {
		this.referenceId = referenceId;
	}

	public String getProcessFlag() {
		return processFlag;
	}

	public void setProcessFlag(String processFlag) {
		this.processFlag = processFlag;
	}

	public String getDetailJson() {
		return detailJson;
	}

	public void setDetailJson(String detailJson) {
		this.detailJson = detailJson;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}
