package com.tgg.tggoms.vo;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class OrderHeaderVo{

	private UUID orderId;
	
	private UUID customerId;
	
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime orderDate;
	
//	@Column(name = "total_amount")
//	private BigDecimal totalAmount;
//	
//	@Column(name = "paid_amount")
//	private BigDecimal paidAmount;
//	
//	@Column(name = "despatched_amount")
//	private BigDecimal despatchedAmount;
	
	private LocalDateTime requestDeliveryDate;
	
	private String orderStatus;
	
	private Integer orderLocationNbr;
	
	private LocalDateTime orderFollowUpdate;
	
	private String externalOrderReference;
	
	private String posOrderNumber;
	
	private LocalDateTime createdAt;
	
	private String createdBy;
	
	private LocalDateTime modifiedAt;
	
	private String modifiedBy;
	
	private Object deliveryAddress;
	
	private Object orderNotes;
	
	private String orderSource;
	
	private Integer orderNumber;
	
	private UUID deliveryAddressId;
	
	private Object orderInfo;
	

	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}

	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

//	public BigDecimal getTotalAmount() {
//		return totalAmount;
//	}
//
//	public void setTotalAmount(BigDecimal totalAmount) {
//		this.totalAmount = totalAmount;
//	}
//
//	public BigDecimal getPaidAmount() {
//		return paidAmount;
//	}
//
//	public void setPaidAmount(BigDecimal paidAmount) {
//		this.paidAmount = paidAmount;
//	}
//
//	public BigDecimal getDespatchedAmount() {
//		return despatchedAmount;
//	}
//
//	public void setDespatchedAmount(BigDecimal despatchedAmount) {
//		this.despatchedAmount = despatchedAmount;
//	}

	public LocalDateTime getRequestDeliveryDate() {
		return requestDeliveryDate;
	}

	public void setRequestDeliveryDate(LocalDateTime requestDeliveryDate) {
		this.requestDeliveryDate = requestDeliveryDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderLocationNbr() {
		return orderLocationNbr;
	}

	public void setOrderLocationNbr(Integer orderLocationNbr) {
		this.orderLocationNbr = orderLocationNbr;
	}

	public LocalDateTime getOrderFollowUpdate() {
		return orderFollowUpdate;
	}

	public void setOrderFollowUpdate(LocalDateTime orderFollowUpdate) {
		this.orderFollowUpdate = orderFollowUpdate;
	}

	public String getExternalOrderReference() {
		return externalOrderReference;
	}

	public void setExternalOrderReference(String externalOrderReference) {
		this.externalOrderReference = externalOrderReference;
	}

	public String getPosOrderNumber() {
		return posOrderNumber;
	}

	public void setPosOrderNumber(String posOrderNumber) {
		this.posOrderNumber = posOrderNumber;
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

	public Object getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Object deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Object getOrderNotes() {
		return orderNotes;
	}

	public void setOrderNotes(Object orderNotes) {
		this.orderNotes = orderNotes;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public UUID getDeliveryAddressId() {
		return deliveryAddressId;
	}

	public void setDeliveryAddressId(UUID deliveryAddressId) {
		this.deliveryAddressId = deliveryAddressId;
	}

	public Object getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}

	public OrderHeaderVo() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public List<Invoice> getInvoice() {
//		return invoice;
//	}
//
//	public void setInvoice(List<Invoice> invoice) {
//		this.invoice = invoice;
//	}
//
//	public List<OrderAllocationHeader> getOrderAllocationHeader() {
//		return orderAllocationHeader;
//	}
//
//	public void setOrderAllocationHeader(List<OrderAllocationHeader> orderAllocationHeader) {
//		this.orderAllocationHeader = orderAllocationHeader;
//	}
//
//	public List<OrderLines> getOrderLines() {
//		return orderLines;
//	}
//
//	public void setOrderLines(List<OrderLines> orderLines) {
//		this.orderLines = orderLines;
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
//	
	

}
