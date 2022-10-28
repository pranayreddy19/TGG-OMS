package com.tgg.tggoms.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ServiceConfig implements Serializable {
	
	@Column(name="app_name")
	private String appName;
	
	@Column(name="screen")
	private String screen;
	
	@Column(name="sub_category")
	private String subCategory;
	
	

	public ServiceConfig() {
		
	}

	public ServiceConfig(String appName, String screen, String subCategory) {
		this.appName = appName;
		this.screen = screen;
		this.subCategory = subCategory;
	}

	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appName, screen, subCategory);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceConfig other = (ServiceConfig) obj;
		return Objects.equals(appName, other.appName) && Objects.equals(screen, other.screen)
				&& Objects.equals(subCategory, other.subCategory);
	}
	
	

}
