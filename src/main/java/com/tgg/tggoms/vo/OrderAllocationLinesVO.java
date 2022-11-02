package com.tgg.tggoms.vo;

public class OrderAllocationLinesVO {
	
	private OrderLinesVO orderLines;
	
	private Double pickedQty;
	
	private String fulfilmentLineStatus;
	
	private Double packedQty;

	public OrderLinesVO getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(OrderLinesVO orderLines) {
		this.orderLines = orderLines;
	}

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

	public Double getPackedQty() {
		return packedQty;
	}

	public void setPackedQty(Double packedQty) {
		this.packedQty = packedQty;
	}
	
	

}
