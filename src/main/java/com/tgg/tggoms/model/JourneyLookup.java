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
@Table(name="journey_lookup")
public class JourneyLookup {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "journey_lookup_id")
	private UUID journeyLookupId;
	
	@Column(name = "moveit_journey_id")
	private String moveitJourneyId;
	
	@Column(name = "max_split_count")
	private Integer maxSplitCount;
	
	@Column(name = "edit")
	private boolean edit;
	
	@Column(name = "split")
	private boolean split;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modifiedAt;
	
	@Column(name = "modified_by")
	private String modifiedBy;

	public UUID getJourneyLookupId() {
		return journeyLookupId;
	}

	public void setJourneyLookupId(UUID journeyLookupId) {
		this.journeyLookupId = journeyLookupId;
	}

	public String getMoveitJourneyId() {
		return moveitJourneyId;
	}

	public void setMoveitJourneyId(String moveitJourneyId) {
		this.moveitJourneyId = moveitJourneyId;
	}

	public Integer getMaxSplitCount() {
		return maxSplitCount;
	}

	public void setMaxSplitCount(Integer maxSplitCount) {
		this.maxSplitCount = maxSplitCount;
	}

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public boolean isSplit() {
		return split;
	}

	public void setSplit(boolean split) {
		this.split = split;
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
