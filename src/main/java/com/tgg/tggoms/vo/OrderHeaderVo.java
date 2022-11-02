package com.tgg.tggoms.vo;

import java.time.LocalDateTime;
import java.util.Set;

public class OrderHeaderVO{

	
	private CustomersVO customerDetails;
	
	private LocalDateTime orderDate;
	
	private String orderStatus;
	
	private Integer orderLocationNbr;
	
	private String externalOrderReference;
	
	private String posOrderNumber;
	
	private Object deliveryAddress;
	
	private String orderSource;
	
	private Integer orderNumber;
	
	private Set<OrderAllocationHeaderVO> orderAllocationHeader;
	
	private Set<OrderLinesVO> orderLines;
	
	
	public CustomersVO getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomersVO customerDetails) {
		this.customerDetails = customerDetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
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

	public Object getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Object deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
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

	public Set<OrderAllocationHeaderVO> getOrderAllocationHeader() {
		return orderAllocationHeader;
	}

	public void setOrderAllocationHeader(Set<OrderAllocationHeaderVO> orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}

	public Set<OrderLinesVO> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(Set<OrderLinesVO> orderLines) {
		this.orderLines = orderLines;
	}
	
	
}
