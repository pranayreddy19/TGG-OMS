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
@Table(name="order_customerpo")
public class OrderCustomerpo {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "order_cust_id")
	private UUID orderCustId;
	
	@Column(name = "po_indicator")
	private String poIndicator;
	
	@Column(name = "po_qty")
	private double poQty;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "prod_nbr")
	private String prodNbr;
	
	@Column(name = "po_number")
	private String poNumber;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "pos_order_number")
	private String posOrderNumber;
	
	@Column(name = "external_order_reference")
	private String externalOrderReference;

	public UUID getOrderCustId() {
		return orderCustId;
	}

	public void setOrderCustId(UUID orderCustId) {
		this.orderCustId = orderCustId;
	}

	public String getPoIndicator() {
		return poIndicator;
	}

	public void setPoIndicator(String poIndicator) {
		this.poIndicator = poIndicator;
	}

	public double getPoQty() {
		return poQty;
	}

	public void setPoQty(double poQty) {
		this.poQty = poQty;
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

	public String getProdNbr() {
		return prodNbr;
	}

	public void setProdNbr(String prodNbr) {
		this.prodNbr = prodNbr;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPosOrderNumber() {
		return posOrderNumber;
	}

	public void setPosOrderNumber(String posOrderNumber) {
		this.posOrderNumber = posOrderNumber;
	}

	public String getExternalOrderReference() {
		return externalOrderReference;
	}

	public void setExternalOrderReference(String externalOrderReference) {
		this.externalOrderReference = externalOrderReference;
	}
	
	
}
