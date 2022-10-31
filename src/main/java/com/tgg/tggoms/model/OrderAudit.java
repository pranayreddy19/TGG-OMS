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
@Table(name="order_audit", schema="oms")
public class OrderAudit implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "audit_id")
	private UUID auditId;
	
	@Column(name = "record_id")
	private UUID recodeId;
	
	@Column(name = "table_name")
	private String tableName;
	
	@Column(name = "mod_date_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private LocalDateTime modDateTime;
	
	@Column(name = "column_name")
	private String columnName;
	
	@Column(name = "old_value")
	private String oldValue;
	
	@Column(name = "new_value")
	private String newValue;
	
	@Column(name = "audit_type")
	private String auditType;
	
	@Column(name = "last_mod_window")
	private String lastModWindow;
	
	@Column(name = "last_mod_user")
	private String lastModUser;

	public UUID getAuditId() {
		return auditId;
	}

	public void setAuditId(UUID auditId) {
		this.auditId = auditId;
	}

	public UUID getRecodeId() {
		return recodeId;
	}

	public void setRecodeId(UUID recodeId) {
		this.recodeId = recodeId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public LocalDateTime getModDateTime() {
		return modDateTime;
	}

	public void setModDateTime(LocalDateTime modDateTime) {
		this.modDateTime = modDateTime;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getLastModWindow() {
		return lastModWindow;
	}

	public void setLastModWindow(String lastModWindow) {
		this.lastModWindow = lastModWindow;
	}

	public String getLastModUser() {
		return lastModUser;
	}

	public void setLastModUser(String lastModUser) {
		this.lastModUser = lastModUser;
	}
	
	
}
