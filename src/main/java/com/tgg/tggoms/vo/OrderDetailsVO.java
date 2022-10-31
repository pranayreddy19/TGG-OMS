package com.tgg.tggoms.vo;

import com.tgg.tggoms.model.OrderAllocationHeader;
import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.model.OrderLines;
import com.tgg.tggoms.model.Packages;
import com.tgg.tggoms.model.Parcel;

public class OrderDetailsVO {
	
	private OrderHeader orderHeader;
	private OrderLines orderLines;
	private OrderAllocationHeader orderAllocationHeader;
	private Packages packages;
	private Parcel parcel;
	
	public OrderHeader getOrderHeader() {
		return orderHeader;
	}
	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}
	public OrderLines getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}
	public OrderAllocationHeader getOrderAllocationHeader() {
		return orderAllocationHeader;
	}
	public void setOrderAllocationHeader(OrderAllocationHeader orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}
	public Packages getPackages() {
		return packages;
	}
	public void setPackages(Packages packages) {
		this.packages = packages;
	}
	public Parcel getParcel() {
		return parcel;
	}
	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}
	
	
	
}
