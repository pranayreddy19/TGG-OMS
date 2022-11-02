package com.tgg.tggoms.vo;

import java.time.LocalDateTime;

public class ShipmentVO {
	
private String consignmentNumber;
	
	private String status;
	
	private Object details;
	
	private LocalDateTime despatchDate;
	
	public String getConsignmentNumber() {
		return consignmentNumber;
	}

	public void setConsignmentNumber(String consignmentNumber) {
		this.consignmentNumber = consignmentNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}

	public LocalDateTime getDespatchDate() {
		return despatchDate;
	}

	public void setDespatchDate(LocalDateTime despatchDate) {
		this.despatchDate = despatchDate;
	}
	
	

}
