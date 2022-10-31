package com.tgg.tggoms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="shipment", schema="oms")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "shipmentId")
public class Shipment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "shipment_id")
	private UUID shipmentId;
	
	@ManyToOne
	@JoinColumn(name="order_id")
//	@Column(name = "order_id")
	private OrderHeader orderHeader;
	
	@Column(name = "consignment_number")
	private String consignmentNumber;
	
	@Column(name = "expected_delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime expectedDeliveryDate;
	
	@Column(name = "actual_despatch_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime actualDespatchDate;
	
	@Column(name = "status")
	private String status;
	
	@Type(type = "jsonb")
	@Column(name = "details", columnDefinition = "jsonb")
	private String details;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@ManyToOne
	@JoinColumn(name="allocation_id")
//	@Column(name = "allocation_id")
	private OrderAllocationHeader orderAllocationHeader;
	
	@Column(name = "despatch_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime despatchDate;
	
//	@Column(name = "cost")
//	private BigDecimal cost;
	
	@Column(name = "shipment_journey")
	private String shipmentJourney;
	
	@Column(name = "shipment_courier")
	private String shipmentCourier;
	
	@OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Invoice> invoice;
	
	@OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Packages> packages;

	public UUID getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(UUID shipmentId) {
		this.shipmentId = shipmentId;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public String getConsignmentNumber() {
		return consignmentNumber;
	}

	public void setConsignmentNumber(String consignmentNumber) {
		this.consignmentNumber = consignmentNumber;
	}

	public LocalDateTime getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(LocalDateTime expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public LocalDateTime getActualDespatchDate() {
		return actualDespatchDate;
	}

	public void setActualDespatchDate(LocalDateTime actualDespatchDate) {
		this.actualDespatchDate = actualDespatchDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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

	public OrderAllocationHeader getOrderAllocationHeader() {
		return orderAllocationHeader;
	}

	public void setOrderAllocationHeader(OrderAllocationHeader orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}

	public LocalDateTime getDespatchDate() {
		return despatchDate;
	}

	public void setDespatchDate(LocalDateTime despatchDate) {
		this.despatchDate = despatchDate;
	}

//	public BigDecimal getCost() {
//		return cost;
//	}
//
//	public void setCost(BigDecimal cost) {
//		this.cost = cost;
//	}

	public String getShipmentJourney() {
		return shipmentJourney;
	}

	public void setShipmentJourney(String shipmentJourney) {
		this.shipmentJourney = shipmentJourney;
	}

	public String getShipmentCourier() {
		return shipmentCourier;
	}

	public void setShipmentCourier(String shipmentCourier) {
		this.shipmentCourier = shipmentCourier;
	}

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}

	public List<Packages> getPackages() {
		return packages;
	}

	public void setPackages(List<Packages> packages) {
		this.packages = packages;
	}
	
	

}
