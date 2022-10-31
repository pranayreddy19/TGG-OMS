package com.tgg.tggoms.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class OrderLinesVO {
	
	private UUID lineId;
	
	private String orderHeader;
	
	private Integer lineNbr;
	
	private Integer srcLneNbr;
	
	private String prodNbr;
	
	private double prodQty;
	
	private BigDecimal totalAmt;
	
	private String channelId;
	
	private Object lineDetails;
	
	private LocalDateTime createdAt;
	
	private String createdBy;
	
	private LocalDateTime modifiedAt;
	
	private String modifiedBy;
	
	private String lineStatus;

	public UUID getLineId() {
		return lineId;
	}

	public void setLineId(UUID lineId) {
		this.lineId = lineId;
	}

	public String getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(String orderHeader) {
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
	
	

}
