package com.tgg.tggoms.vo;

import java.util.List;

import com.tgg.tggoms.model.Invoice;
import com.tgg.tggoms.model.OrderAllocationHeader;
import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.model.OrderLines;
import com.tgg.tggoms.model.Packages;
import com.tgg.tggoms.model.Parcel;
import com.tgg.tggoms.model.Shipment;

public class OrderDetailsVO {

	private OrderHeaderVo orderHeader;
	private OrderHeader orderHeaders;
	private List<OrderLines> orderLines;
	private List<OrderAllocationHeader> orderAllocationHeader;
	private List<Packages> packages;
	private List<Parcel> parcel;
	private List<Invoice> invoice;
	private List<Shipment> shipment;

	
	
	public OrderHeaderVo getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeaderVo orderHeader) {
		this.orderHeader = orderHeader;
	}

	public List<OrderLines> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLines> orderLines) {
		this.orderLines = orderLines;
	}

	public List<OrderAllocationHeader> getOrderAllocationHeader() {
		return orderAllocationHeader;
	}

	public void setOrderAllocationHeader(List<OrderAllocationHeader> orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}

	public List<Packages> getPackages() {
		return packages;
	}

	public void setPackages(List<Packages> packages) {
		this.packages = packages;
	}

	public List<Parcel> getParcel() {
		return parcel;
	}

	public void setParcel(List<Parcel> parcel) {
		this.parcel = parcel;
	}

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}

	public List<Shipment> getShipment() {
		return shipment;
	}

	public void setShipment(List<Shipment> shipment) {
		this.shipment = shipment;
	}

	public OrderHeader getOrderHeaders() {
		return orderHeaders;
	}

	public void setOrderHeaders(OrderHeader orderHeaders) {
		this.orderHeaders = orderHeaders;
	}
	
	

}
