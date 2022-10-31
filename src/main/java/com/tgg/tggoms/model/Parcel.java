package com.tgg.tggoms.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="parcel", schema="oms")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Parcel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "parcel_id")
	private UUID parcelId;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Type(type = "jsonb")
	@Column(name = "line_details", columnDefinition = "jsonb")
	private String lineDetails;
	
	@Column(name = "parcel_status")
	private String parcelStatus;
	
	@ManyToOne
	@JoinColumn(name="pkg_id")
	private Packages packages;
	
	@Type(type = "jsonb")
	@Column(name = "dimension_details", columnDefinition = "jsonb")
	private Object dimensionDetails;
	
	@Column(name = "unit_of_measure")
	private String unitOfMeasure;
	
	@Column(name = "parcel_spec")
	private String parcelSpec;
	
	@Column(name = "parcel_desc")
	private String parcelDesc;

	public UUID getParcelId() {
		return parcelId;
	}

	public void setParcelId(UUID parcelId) {
		this.parcelId = parcelId;
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

	public String getLineDetails() {
		return lineDetails;
	}

	public void setLineDetails(String lineDetails) {
		this.lineDetails = lineDetails;
	}

	public String getParcelStatus() {
		return parcelStatus;
	}

	public void setParcelStatus(String parcelStatus) {
		this.parcelStatus = parcelStatus;
	}

	public Packages getPackages() {
		return packages;
	}

	public void setPackages(Packages packages) {
		this.packages = packages;
	}

	public Object getDimensionDetails() {
		return dimensionDetails;
	}

	public void setDimensionDetails(Object dimensionDetails) {
		this.dimensionDetails = dimensionDetails;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getParcelSpec() {
		return parcelSpec;
	}

	public void setParcelSpec(String parcelSpec) {
		this.parcelSpec = parcelSpec;
	}

	public String getParcelDesc() {
		return parcelDesc;
	}

	public void setParcelDesc(String parcelDesc) {
		this.parcelDesc = parcelDesc;
	}
	
	

}
