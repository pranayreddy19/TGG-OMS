package com.tgg.tggoms.model;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="invoice_status", schema = "oms")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "invoiceStatusCode")
public class InvoiceStatus implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "invoice_status_code")
	private UUID invoiceStatusCode;
	
	@Column(name = "invoice_status")
	private String invoiceStatus;
	
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
	
	@OneToMany(mappedBy = "invoiceStatus", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Invoice> invoice;

	public UUID getInvoiceStatusCode() {
		return invoiceStatusCode;
	}

	public void setInvoiceStatusCode(UUID invoiceStatusCode) {
		this.invoiceStatusCode = invoiceStatusCode;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
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

	public Set<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(Set<Invoice> invoice) {
		this.invoice = invoice;
	}
	
	

}
