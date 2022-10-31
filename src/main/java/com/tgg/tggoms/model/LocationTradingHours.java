package com.tgg.tggoms.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="location_trading_hours", schema="oms")
public class LocationTradingHours implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "location_trading_hour_id")
	private UUID locationTradingHourId;
	
	@Column(name = "locn_nbr")
	private Integer locnNbr;
	
	@Column(name = "day_of_week")
	private Integer dayOfWeek;
	
	@Column(name = "day_name")
	private String dayName;
	
	@Column(name = "open_time")
	private Integer openTime;
	
	@Column(name = "close_time")
	private Integer closeTime;
	
	@Column(name = "wsc_status")
	private String wscStatus;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;

	public UUID getLocationTradingHourId() {
		return locationTradingHourId;
	}

	public void setLocationTradingHourId(UUID locationTradingHourId) {
		this.locationTradingHourId = locationTradingHourId;
	}

	public Integer getLocnNbr() {
		return locnNbr;
	}

	public void setLocnNbr(Integer locnNbr) {
		this.locnNbr = locnNbr;
	}

	public Integer getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public Integer getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Integer openTime) {
		this.openTime = openTime;
	}

	public Integer getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Integer closeTime) {
		this.closeTime = closeTime;
	}

	public String getWscStatus() {
		return wscStatus;
	}

	public void setWscStatus(String wscStatus) {
		this.wscStatus = wscStatus;
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
	
	

}
