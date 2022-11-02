package com.tgg.tggoms.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
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
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="order_header", schema = "oms" )
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "orderId")
public class OrderHeader implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "order_id")
	private UUID orderId;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
//	@Column(name = "customer_id")
	private Customers customerId;
	
	@Column(name = "order_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime orderDate;
	
//	@Column(name = "total_amount")
//	private BigDecimal totalAmount;
//	
//	@Column(name = "paid_amount")
//	private BigDecimal paidAmount;
//	
//	@Column(name = "despatched_amount")
//	private BigDecimal despatchedAmount;
	
//	@Column(name = "request_delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime requestDeliveryDate;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name = "order_location_nbr")
	private Integer orderLocationNbr;
	
//	@Column(name = "order_follow_update", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime orderFollowUpdate;
	
	@Column(name = "external_order_reference")
	private String externalOrderReference;
	
	@Column(name = "pos_order_number")
	private String posOrderNumber;
	
//	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime createdAt;
//	
//	@Column(name = "created_by")
//	private String createdBy;
//	
//	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime modifiedAt;
//	
//	@Column(name = "modified_by")
//	private String modifiedBy;
	
	@Type(type = "jsonb")
	@Column(name = "delivery_address", columnDefinition = "jsonb")
	private Object deliveryAddress;
	
//	@Type(type = "jsonb")
//	@Column(name = "order_notes", columnDefinition = "jsonb")
//	private Object orderNotes;
	
	@Column(name = "order_source")
	private String orderSource;
	
	@Column(name = "order_number")
	private Integer orderNumber;
	
//	@Column(name = "delivery_address_id")
//	private UUID deliveryAddressId;
	
//	@Type(type = "jsonb")
//	@Column(name = "order_info", columnDefinition = "jsonb")
//	private Object orderInfo;
	
//	@OneToMany(mappedBy = "orderHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private Set<Invoice> invoice;
	
	
	@OneToMany(mappedBy = "orderHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<OrderAllocationHeader> orderAllocationHeader;
	
	
	@OneToMany(mappedBy = "orderHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<OrderLines> orderLines;
	
	@JsonIgnore
	@OneToMany(mappedBy = "orderHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Shipment> shipment;

	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}

	public Customers getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customers customerId) {
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

//	public LocalDateTime getRequestDeliveryDate() {
//		return requestDeliveryDate;
//	}
//
//	public void setRequestDeliveryDate(LocalDateTime requestDeliveryDate) {
//		this.requestDeliveryDate = requestDeliveryDate;
//	}

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

//	public LocalDateTime getOrderFollowUpdate() {
//		return orderFollowUpdate;
//	}
//
//	public void setOrderFollowUpdate(LocalDateTime orderFollowUpdate) {
//		this.orderFollowUpdate = orderFollowUpdate;
//	}

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

//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}
//
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

	public Object getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Object deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

//	public Object getOrderNotes() {
//		return orderNotes;
//	}
//
//	public void setOrderNotes(Object orderNotes) {
//		this.orderNotes = orderNotes;
//	}

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

//	public UUID getDeliveryAddressId() {
//		return deliveryAddressId;
//	}
//
//	public void setDeliveryAddressId(UUID deliveryAddressId) {
//		this.deliveryAddressId = deliveryAddressId;
//	}
//
//	public Object getOrderInfo() {
//		return orderInfo;
//	}
//
//	public void setOrderInfo(Object orderInfo) {
//		this.orderInfo = orderInfo;
//	}

//	public Set<Invoice> getInvoice() {
//		return invoice;
//	}
//
//	public void setInvoice(Set<Invoice> invoice) {
//		this.invoice = invoice;
//	}

	public Set<OrderAllocationHeader> getOrderAllocationHeader() {
		return orderAllocationHeader;
	}

	public void setOrderAllocationHeader(Set<OrderAllocationHeader> orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}

	public Set<OrderLines> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(Set<OrderLines> orderLines) {
		this.orderLines = orderLines;
	}

	public List<Shipment> getShipment() {
		return shipment;
	}

	public void setShipment(List<Shipment> shipment) {
		this.shipment = shipment;
	}
	
	
	

}
