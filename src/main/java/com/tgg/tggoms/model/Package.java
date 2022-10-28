package com.tgg.tggoms.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="package")
public class Package {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "pkg_id")
	private UUID pkgId;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(name = "pkg_status")
	private String pkgStatus;
	
	@Column(name = "count")
	private Integer count;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@ManyToOne
	@JoinColumn(name="shipment_id")
	private Shipment shipment;
	
	@Column(name = "journey_id")
	private String journeyId;
	
	@Column(name = "courier")
	private String courier;
	
	@Column(name = "experience_id")
	private Integer exeperienceId;
	
	@ManyToOne
	@JoinColumn(name="allocation_id")
	private OrderAllocationHeader orderAllocationHeader;
	
	@Column(name = "transaction_id")
	private UUID transactionId;
	
	@OneToMany(mappedBy = "packages", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Parcel> parcel;

	public UUID getPkgId() {
		return pkgId;
	}

	public void setPkgId(UUID pkgId) {
		this.pkgId = pkgId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPkgStatus() {
		return pkgStatus;
	}

	public void setPkgStatus(String pkgStatus) {
		this.pkgStatus = pkgStatus;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
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

	public Integer getExeperienceId() {
		return exeperienceId;
	}

	public void setExeperienceId(Integer exeperienceId) {
		this.exeperienceId = exeperienceId;
	}

	public OrderAllocationHeader getOrderAllocationHeader() {
		return orderAllocationHeader;
	}

	public void setOrderAllocationHeader(OrderAllocationHeader orderAllocationHeader) {
		this.orderAllocationHeader = orderAllocationHeader;
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}

	public List<Parcel> getParcel() {
		return parcel;
	}

	public void setParcel(List<Parcel> parcel) {
		this.parcel = parcel;
	}
	
	

}