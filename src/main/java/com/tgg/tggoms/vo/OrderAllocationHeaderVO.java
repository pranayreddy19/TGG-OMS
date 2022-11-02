package com.tgg.tggoms.vo;

import java.time.LocalDateTime;
import java.util.Set;

public class OrderAllocationHeaderVO {
	
	
	
	private String allocationNumber;
	
	private LocalDateTime actualDeliveryDate;
	
	private String fulfilmentProvider;
	
	private LocalDateTime pickingSlaTime;
	
	private Set<OrderAllocationLinesVO> orderAllocationLines;
	
	private Set<PackagesVO> packages;
	
//	private Set<ShipmentVO> shipment;

	public String getAllocationNumber() {
		return allocationNumber;
	}

	public void setAllocationNumber(String allocationNumber) {
		this.allocationNumber = allocationNumber;
	}

	public LocalDateTime getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(LocalDateTime actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getFulfilmentProvider() {
		return fulfilmentProvider;
	}

	public void setFulfilmentProvider(String fulfilmentProvider) {
		this.fulfilmentProvider = fulfilmentProvider;
	}

	public LocalDateTime getPickingSlaTime() {
		return pickingSlaTime;
	}

	public void setPickingSlaTime(LocalDateTime pickingSlaTime) {
		this.pickingSlaTime = pickingSlaTime;
	}

	public Set<OrderAllocationLinesVO> getOrderAllocationLines() {
		return orderAllocationLines;
	}

	public void setOrderAllocationLines(Set<OrderAllocationLinesVO> orderAllocationLines) {
		this.orderAllocationLines = orderAllocationLines;
	}

	public Set<PackagesVO> getPackages() {
		return packages;
	}

	public void setPackages(Set<PackagesVO> packages) {
		this.packages = packages;
	}

//	public Set<ShipmentVO> getShipment() {
//		return shipment;
//	}
//
//	public void setShipment(Set<ShipmentVO> shipment) {
//		this.shipment = shipment;
//	}
	
	

}
