package com.tgg.tggoms.model;

import java.io.Serializable;
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
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="invoice", schema = "oms")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "invoiceId")
public class Invoice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "invoice_id")
	private UUID invoiceId;
	
	@ManyToOne
	@JoinColumn(name="order_id")
//	@Column(name = "order_id")
	private OrderHeader orderHeader;
	
	@ManyToOne
	@JoinColumn(name="shipment_id")
//	@Column(name = "shipment_id")
	private Shipment shipment;
	
	@ManyToOne
	@JoinColumn(name="invoice_status_code")
//	@Column(name = "invoice_status_code")
	private InvoiceStatus invoiceStatus;
	
//	@Column(name = "invoice_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
//	private LocalDateTime invoiceDate;
//	
//	@Type(type = "jsonb")
//	@Column(name = "invoice_details", columnDefinition = "jsonb")
//	private Object invoiceDetails;
//	
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
	
	@OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Payment> payment;

	public UUID getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(UUID invoiceId) {
		this.invoiceId = invoiceId;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public InvoiceStatus getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

//	public LocalDateTime getInvoiceDate() {
//		return invoiceDate;
//	}
//
//	public void setInvoiceDate(LocalDateTime invoiceDate) {
//		this.invoiceDate = invoiceDate;
//	}
//
//	public Object getInvoiceDetails() {
//		return invoiceDetails;
//	}
//
//	public void setInvoiceDetails(Object invoiceDetails) {
//		this.invoiceDetails = invoiceDetails;
//	}
//
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

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	
	
}
