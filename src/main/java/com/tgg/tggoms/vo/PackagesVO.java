package com.tgg.tggoms.vo;

import java.util.Set;

public class PackagesVO {
	
	private AddressVO address;
	
	private String pkgStatus;
	
	private ShipmentVO shipment;
	
	private String journeyId;
	
	private String courier;
	
	private Set<ParcelVO> parcel;

	public AddressVO getAddress() {
		return address;
	}

	public void setAddress(AddressVO address) {
		this.address = address;
	}

	public String getPkgStatus() {
		return pkgStatus;
	}

	public void setPkgStatus(String pkgStatus) {
		this.pkgStatus = pkgStatus;
	}

	public ShipmentVO getShipment() {
		return shipment;
	}

	public void setShipment(ShipmentVO shipment) {
		this.shipment = shipment;
	}

	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	public String getCourier() {
		return courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public Set<ParcelVO> getParcel() {
		return parcel;
	}

	public void setParcel(Set<ParcelVO> parcel) {
		this.parcel = parcel;
	}
	
	

}
