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
@Table(name="location_trading_events", schema="oms")
public class LocationTradingEvents implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "location_trading_events_id")
	private UUID locationTradingEventsId;
	
	@Column(name = "locn_nbr")
	private Integer locnNbr;
	
	@Column(name = "location_event_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime locationEventDate;
	
	@Column(name = "open_time")
	private Integer openTime;
	
	@Column(name = "close_time")
	private Integer closeTime;
	
	@Column(name = "location_open_ind")
	private String locationOpenInd;
	
	@Column(name = "display_from_date")
	private LocalDateTime displayFromDate;
	
	@Column(name = "event_descr")
	private String eventDescr;
	
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

	public UUID getLocationTradingEventsId() {
		return locationTradingEventsId;
	}

	public void setLocationTradingEventsId(UUID locationTradingEventsId) {
		this.locationTradingEventsId = locationTradingEventsId;
	}

	public Integer getLocnNbr() {
		return locnNbr;
	}

	public void setLocnNbr(Integer locnNbr) {
		this.locnNbr = locnNbr;
	}

	public LocalDateTime getLocationEventDate() {
		return locationEventDate;
	}

	public void setLocationEventDate(LocalDateTime locationEventDate) {
		this.locationEventDate = locationEventDate;
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

	public String getLocationOpenInd() {
		return locationOpenInd;
	}

	public void setLocationOpenInd(String locationOpenInd) {
		this.locationOpenInd = locationOpenInd;
	}

	public LocalDateTime getDisplayFromDate() {
		return displayFromDate;
	}

	public void setDisplayFromDate(LocalDateTime displayFromDate) {
		this.displayFromDate = displayFromDate;
	}

	public String getEventDescr() {
		return eventDescr;
	}

	public void setEventDescr(String eventDescr) {
		this.eventDescr = eventDescr;
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
