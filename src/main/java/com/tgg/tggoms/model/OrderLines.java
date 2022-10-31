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
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="order_lines", schema="oms")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class OrderLines implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "line_id")
	private UUID lineId;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private OrderHeader orderHeader;
	
	@Column(name = "line_nbr")
	private Integer lineNbr;
	
	@Column(name = "src_lne_nbr")
	private Integer srcLneNbr;
	
	@Column(name = "prod_nbr")
	private String prodNbr;
	
	@Column(name = "prod_qty")
	private double prodQty;
	
	@Column(name = "total_amt")
	private BigDecimal totalAmt;
	
	@Column(name = "channel_id")
	private String channelId;
	
	@Type(type = "jsonb")
	@Column(name = "line_details", columnDefinition = "jsonb")
	private Object lineDetails;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "line_status")
	private String lineStatus;
	
//	@OneToMany(mappedBy = "orderLines", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<OrderAllocationLines> orderAllocationLines;
//	
//	@OneToMany(mappedBy = "orderLines", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<OrderLinesDiscount> orderLinesDiscount;
//	
//	@OneToMany(mappedBy = "orderLines", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<ProductService> productService;
	
	public OrderHeader getOrderHeader() {
		return orderHeader;
	}
	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}
	public Integer getLineNbr() {
		return lineNbr;
	}
	public void setLineNbr(Integer lineNbr) {
		this.lineNbr = lineNbr;
	}
	public Integer getSrcLneNbr() {
		return srcLneNbr;
	}
	public void setSrcLneNbr(Integer srcLneNbr) {
		this.srcLneNbr = srcLneNbr;
	}
	public String getProdNbr() {
		return prodNbr;
	}
	public void setProdNbr(String prodNbr) {
		this.prodNbr = prodNbr;
	}
	public double getProdQty() {
		return prodQty;
	}
	public void setProdQty(double prodQty) {
		this.prodQty = prodQty;
	}
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public Object getLineDetails() {
		return lineDetails;
	}
	public void setLineDetails(Object lineDetails) {
		this.lineDetails = lineDetails;
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
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}
	public UUID getLineId() {
		return lineId;
	}
	public void setLineId(UUID lineId) {
		this.lineId = lineId;
	}
//	public List<OrderAllocationLines> getOrderAllocationLines() {
//		return orderAllocationLines;
//	}
//	public void setOrderAllocationLines(List<OrderAllocationLines> orderAllocationLines) {
//		this.orderAllocationLines = orderAllocationLines;
//	}
//	public List<OrderLinesDiscount> getOrderLinesDiscount() {
//		return orderLinesDiscount;
//	}
//	public void setOrderLinesDiscount(List<OrderLinesDiscount> orderLinesDiscount) {
//		this.orderLinesDiscount = orderLinesDiscount;
//	}
//	public List<ProductService> getProductService() {
//		return productService;
//	}
//	public void setProductService(List<ProductService> productService) {
//		this.productService = productService;
//	}
	
	

}
