package com.tgg.tggoms.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="order_allocation_lines", schema="oms")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "allocationLineId")
public class OrderAllocationLines implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "allocation_line_id")
	private UUID allocationLineId;
	
	@ManyToOne
	@JoinColumn(name="line_id")
//	@Column(name = "line_id")
	private OrderLines orderLines;
	
	@ManyToOne
	@JoinColumn(name="allocation_id")
//	@Column(name = "allocation_id")
	private OrderAllocationHeader orderAllocationHeader; 
	
//	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime createdAt;
	
//	@Column(name = "created_by")
//	private String createdBy;
//	
//	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime modifiedAt;
//	
//	@Column(name = "modified_by")
//	private String modifiedBy;
	
	@Column(name = "picked_qty")
	private Double pickedQty;
	
	@Column(name = "fulfilment_line_status")
	private String fulfilmentLineStatus;
	
//	@Column(name = "fulfilment_method")
//	private String fulfilmentMethod;
//	
//	@Column(name = "fulfilment_provider")
//	private String fulfilmentProvider;
	
	@Column(name = "packed_qty")
	private Double packedQty;

	public UUID getAllocationLineId() {
		return allocationLineId;
	}

	public void setAllocationLineId(UUID allocationLineId) {
		this.allocationLineId = allocationLineId;
	}

	public OrderLines getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}

	public OrderAllocationHeader getOrderAllocationHeader() {
		return orderAllocationHeader;
	}

	public void setOrderAllocationHeader(OrderAllocationHeader orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}

//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}

//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public LocalDateTime getModifiedAt() {
//		return modifiedAt;
//	}
//
//	public void setModifiedAt(LocalDateTime modifiedAt) {
//		this.modifiedAt = modifiedAt;
//	}
//
//	public String getModifiedBy() {
//		return modifiedBy;
//	}
//
//	public void setModifiedBy(String modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}

	public Double getPickedQty() {
		return pickedQty;
	}

	public void setPickedQty(Double pickedQty) {
		this.pickedQty = pickedQty;
	}

	public String getFulfilmentLineStatus() {
		return fulfilmentLineStatus;
	}

	public void setFulfilmentLineStatus(String fulfilmentLineStatus) {
		this.fulfilmentLineStatus = fulfilmentLineStatus;
	}

//	public String getFulfilmentMethod() {
//		return fulfilmentMethod;
//	}
//
//	public void setFulfilmentMethod(String fulfilmentMethod) {
//		this.fulfilmentMethod = fulfilmentMethod;
//	}
//
//	public String getFulfilmentProvider() {
//		return fulfilmentProvider;
//	}
//
//	public void setFulfilmentProvider(String fulfilmentProvider) {
//		this.fulfilmentProvider = fulfilmentProvider;
//	}

	public Double getPackedQty() {
		return packedQty;
	}

	public void setPackedQty(Double packedQty) {
		this.packedQty = packedQty;
	}
	
	

}
