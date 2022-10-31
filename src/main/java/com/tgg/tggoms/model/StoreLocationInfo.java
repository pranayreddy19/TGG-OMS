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
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="store_location_info", schema="oms")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class StoreLocationInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "store_location_id")
	private UUID storeLocationId;
	
	@Column(name = "time_zone")
	private String timeZone;
	
	@Column(name = "store_number")
	private double storeNumber;
	
	@Column(name = "store_name")
	private String storeName;
	
	@Column(name = "store_address1")
	private String storeAddress1;
	
	@Column(name = "store_address2")
	private String storeAddress2;
	
	@Column(name = "phone_nbr")
	private String phoneNbr;
	
	@Column(name = "email_addr_name")
	private String emailAddrName;
	
	@Type(type = "jsonb")
	@Column(name = "details", columnDefinition = "jsonb")
	private Object details;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "post_code")
	private String postCode;
	
	@Column(name = "town")
	private String town;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "address_code")
	private String addressCode;

	public UUID getStoreLocationId() {
		return storeLocationId;
	}

	public void setStoreLocationId(UUID storeLocationId) {
		this.storeLocationId = storeLocationId;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public double getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(double storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress1() {
		return storeAddress1;
	}

	public void setStoreAddress1(String storeAddress1) {
		this.storeAddress1 = storeAddress1;
	}

	public String getStoreAddress2() {
		return storeAddress2;
	}

	public void setStoreAddress2(String storeAddress2) {
		this.storeAddress2 = storeAddress2;
	}

	public String getPhoneNbr() {
		return phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	public String getEmailAddrName() {
		return emailAddrName;
	}

	public void setEmailAddrName(String emailAddrName) {
		this.emailAddrName = emailAddrName;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	
	

}
