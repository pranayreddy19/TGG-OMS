package com.tgg.tggoms.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="store_trading_hour")
public class StoreTradingHour {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "store_trading_hour_id")
	private UUID storeTradingHourId;
	
	@Column(name = "loc_number")
	private Integer locNumber;
	
	@Column(name = "trading_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime tradingDate;
	
	@Column(name = "open_time")
	private String openTime;
	
	@Column(name = "close_time")
	private String closeTime;
	
	@Column(name = "trading_status")
	private String tradingStatus;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "delivery_available")
	private String deliveryAvailable;

	public UUID getStoreTradingHourId() {
		return storeTradingHourId;
	}

	public void setStoreTradingHourId(UUID storeTradingHourId) {
		this.storeTradingHourId = storeTradingHourId;
	}

	public Integer getLocNumber() {
		return locNumber;
	}

	public void setLocNumber(Integer locNumber) {
		this.locNumber = locNumber;
	}

	public LocalDateTime getTradingDate() {
		return tradingDate;
	}

	public void setTradingDate(LocalDateTime tradingDate) {
		this.tradingDate = tradingDate;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getTradingStatus() {
		return tradingStatus;
	}

	public void setTradingStatus(String tradingStatus) {
		this.tradingStatus = tradingStatus;
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

	public String getDeliveryAvailable() {
		return deliveryAvailable;
	}

	public void setDeliveryAvailable(String deliveryAvailable) {
		this.deliveryAvailable = deliveryAvailable;
	}
	
	

}
