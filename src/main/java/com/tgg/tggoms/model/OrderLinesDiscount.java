package com.tgg.tggoms.model;

import java.io.Serializable;
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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="order_lines_discount", schema="oms")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "LineDiscId")
public class OrderLinesDiscount implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "line_disc_id")
	private UUID lineDiscId;
	
	@ManyToOne
	@JoinColumn(name="line_id")
//	@Column(name = "line_id")
	private OrderLines orderLines;
	
//	@Column(name = "discount_code")
//	private String discountCode;
	
//	@Column(name = "total_amt")
//	private BigDecimal totalAmt;
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

	public UUID getLineDiscId() {
		return lineDiscId;
	}

	public void setLineDiscId(UUID lineDiscId) {
		this.lineDiscId = lineDiscId;
	}

	public OrderLines getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}

//	public String getDiscountCode() {
//		return discountCode;
//	}
//
//	public void setDiscountCode(String discountCode) {
//		this.discountCode = discountCode;
//	}

//	public BigDecimal getTotalAmt() {
//		return totalAmt;
//	}
//
//	public void setTotalAmt(BigDecimal totalAmt) {
//		this.totalAmt = totalAmt;
//	}

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
	
	

}
