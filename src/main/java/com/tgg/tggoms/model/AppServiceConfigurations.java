package com.tgg.tggoms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="app_service_configurations", schema="oms")
public class AppServiceConfigurations implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ServiceConfig serviceConfig;
	
	@Column(name="filter_rule")
	private String filterRule;
	
	@Column(name="sub_category_order")
	private int subCategoryOrder;

	public ServiceConfig getServiceConfig() {
		return serviceConfig;
	}

	public void setServiceConfig(ServiceConfig serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

	public String getFilterRule() {
		return filterRule;
	}

	public void setFilterRule(String filterRule) {
		this.filterRule = filterRule;
	}

	public int getSubCategoryOrder() {
		return subCategoryOrder;
	}

	public void setSubCategoryOrder(int subCategoryOrder) {
		this.subCategoryOrder = subCategoryOrder;
	}
	
	

}
