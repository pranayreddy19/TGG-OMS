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
@Table(name = "consignment_detail", schema="oms")
public class ConsignmentDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "consignment_detail_id")
	private UUID consignmentDetailId;

	@Column(name = "consignment_id")
	private String consignmentId;

	@Column(name = "event_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime eventDate;
	
	@Column(name = "shipper_ref_nbr")
	private String shipperRefNbr;
	
	@Column(name = "provider")
	private String provider;
	
	@Column(name = "order_ref_nbr")
	private String orderRefNbr;
	
	@Column(name = "manifest_nbr")
	private String manifestNbr;
	
	@Column(name = "consignment_nbr")
	private String consignmentNbr;
	
	@Column(name = "dispatched_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime dispatchDate;
	
	@Column(name = "expected_delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime expectedDeliveryDate;
	
	@Column(name = "actual_delivery_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime actualDeliveryDate;
	
	@Column(name = "carrier")
	private String carrier;
	
	@Column(name = "journey")
	private String journey;
	
	@Column(name = "con_status")
	private String conStatus;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "special_instructions")
	private String specialInstructions;
	
	public UUID getConsignmentDetailId() {
		return consignmentDetailId;
	}
	public void setConsignmentDetailId(UUID consignmentDetailId) {
		this.consignmentDetailId = consignmentDetailId;
	}
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public LocalDateTime getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	public String getShipperRefNbr() {
		return shipperRefNbr;
	}
	public void setShipperRefNbr(String shipperRefNbr) {
		this.shipperRefNbr = shipperRefNbr;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getOrderRefNbr() {
		return orderRefNbr;
	}
	public void setOrderRefNbr(String orderRefNbr) {
		this.orderRefNbr = orderRefNbr;
	}
	public String getManifestNbr() {
		return manifestNbr;
	}
	public void setManifestNbr(String manifestNbr) {
		this.manifestNbr = manifestNbr;
	}
	public String getConsignmentNbr() {
		return consignmentNbr;
	}
	public void setConsignmentNbr(String consignmentNbr) {
		this.consignmentNbr = consignmentNbr;
	}
	public LocalDateTime getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(LocalDateTime dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public LocalDateTime getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(LocalDateTime expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public LocalDateTime getActualDeliveryDate() {
		return actualDeliveryDate;
	}
	public void setActualDeliveryDate(LocalDateTime actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getJourney() {
		return journey;
	}
	public void setJourney(String journey) {
		this.journey = journey;
	}
	public String getConStatus() {
		return conStatus;
	}
	public void setConStatus(String conStatus) {
		this.conStatus = conStatus;
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
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	
	

}
