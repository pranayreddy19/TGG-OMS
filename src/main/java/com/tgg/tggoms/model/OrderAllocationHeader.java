package com.tgg.tggoms.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity
@Table(name="order_allocation_header", schema="oms")
public class OrderAllocationHeader implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "allocation_id")
	private UUID allocationId;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private OrderHeader orderHeader;
	
	@Column(name = "allocation_number")
	private String allocationNumber;
	
	@Column(name = "delv_run")
	private Integer delvRun;
	
	@Column(name = "actual_delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime actualDeliveryDate;
	
	@Column(name = "requested_delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime requestedDeliveryDate;
	
	@Column(name = "atl")
	private Boolean atl;
	
	@Column(name = "total_amt")
	private BigDecimal totalAmt;
	
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "cut_off_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime cutOffTime;
	
	@Column(name = "order_type")
	private String orderType;
	
	@Column(name = "fulfilment_method")
	private String fulfilmentMethod;
	
	@Column(name = "fulfilment_provider")
	private String fulfilmentProvider;
	
	@Column(name = "package_wrap")
	private Boolean packageWrap;
	
	@Column(name = "lead_date_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime leadDateTime;
	
	@Column(name = "picking_sla_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime pickingSlaTime;
	
//	@OneToMany(mappedBy = "orderAllocationHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<OrderAllocationLines> orderAllocationLines;
//	
//	@OneToMany(mappedBy = "orderAllocationHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Package> packages;
//	
//	@OneToMany(mappedBy = "orderAllocationHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Shipment> shipment;

	public UUID getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(UUID allocationId) {
		this.allocationId = allocationId;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public String getAllocationNumber() {
		return allocationNumber;
	}

	public void setAllocationNumber(String allocationNumber) {
		this.allocationNumber = allocationNumber;
	}

	public Integer getDelvRun() {
		return delvRun;
	}

	public void setDelvRun(Integer delvRun) {
		this.delvRun = delvRun;
	}

	public LocalDateTime getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(LocalDateTime actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public LocalDateTime getRequestedDeliveryDate() {
		return requestedDeliveryDate;
	}

	public void setRequestedDeliveryDate(LocalDateTime requestedDeliveryDate) {
		this.requestedDeliveryDate = requestedDeliveryDate;
	}

	public Boolean isAtl() {
		return atl;
	}

	public void setAtl(Boolean atl) {
		this.atl = atl;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
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

	public LocalDateTime getCutOffTime() {
		return cutOffTime;
	}

	public void setCutOffTime(LocalDateTime cutOffTime) {
		this.cutOffTime = cutOffTime;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getFulfilmentMethod() {
		return fulfilmentMethod;
	}

	public void setFulfilmentMethod(String fulfilmentMethod) {
		this.fulfilmentMethod = fulfilmentMethod;
	}

	public String getFulfilmentProvider() {
		return fulfilmentProvider;
	}

	public void setFulfilmentProvider(String fulfilmentProvider) {
		this.fulfilmentProvider = fulfilmentProvider;
	}

	public Boolean isPackageWrap() {
		return packageWrap;
	}

	public void setPackageWrap(Boolean packageWrap) {
		this.packageWrap = packageWrap;
	}

	public LocalDateTime getLeadDateTime() {
		return leadDateTime;
	}

	public void setLeadDateTime(LocalDateTime leadDateTime) {
		this.leadDateTime = leadDateTime;
	}

	public LocalDateTime getPickingSlaTime() {
		return pickingSlaTime;
	}

	public void setPickingSlaTime(LocalDateTime pickingSlaTime) {
		this.pickingSlaTime = pickingSlaTime;
	}

//	public List<OrderAllocationLines> getOrderAllocationLines() {
//		return orderAllocationLines;
//	}
//
//	public void setOrderAllocationLines(List<OrderAllocationLines> orderAllocationLines) {
//		this.orderAllocationLines = orderAllocationLines;
//	}
//
//	public List<Package> getPackages() {
//		return packages;
//	}
//
//	public void setPackages(List<Package> packages) {
//		this.packages = packages;
//	}
//
//	public List<Shipment> getShipment() {
//		return shipment;
//	}
//
//	public void setShipment(List<Shipment> shipment) {
//		this.shipment = shipment;
//	}
//	
	
}
