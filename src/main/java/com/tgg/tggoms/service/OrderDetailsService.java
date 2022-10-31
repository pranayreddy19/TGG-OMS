package com.tgg.tggoms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgg.tggoms.model.OrderAllocationHeader;
import com.tgg.tggoms.model.OrderAllocationLines;
import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.model.OrderLines;
import com.tgg.tggoms.model.Packages;
import com.tgg.tggoms.model.Parcel;
import com.tgg.tggoms.repository.OrderAllocationHeaderDao;
import com.tgg.tggoms.repository.OrderAllocationLinesDao;
import com.tgg.tggoms.repository.OrderHeaderDao;
import com.tgg.tggoms.repository.OrderLinesDao;
import com.tgg.tggoms.repository.PackageDao;
import com.tgg.tggoms.repository.ParcelDao;

@Service
public class OrderDetailsService {

	@Autowired
	OrderHeaderDao orderHeaderDao;

	@Autowired
	OrderLinesDao orderLinesDao;
	
	@Autowired
	OrderAllocationHeaderDao orderAllocationHeaderDao;
	
	@Autowired
	OrderAllocationLinesDao orderAllocationLinesDao;
	
	@Autowired
	PackageDao packageDao;
	
	@Autowired
	ParcelDao parcelDao;

	public OrderHeader getOrderHeader(String orderNumber) {
		return orderHeaderDao.getOrderHeader(orderNumber);
	}

	public OrderLines getOrderLines(String orderNumber) {
		return orderLinesDao.getOrderLines(orderNumber);
	}
	
	public OrderAllocationHeader getOrderAllocationHeader(String orderNumber) {
		return orderAllocationHeaderDao.getOrderAllocationHeader(orderNumber);
	}
	
	public OrderAllocationLines getOrderOrderAllocationLines(String orderNumber) {
		return orderAllocationLinesDao.getOrderLines(orderNumber);
	}
	
	public Packages getPackages(String orderNumber) {
		return packageDao.getPackage(orderNumber);
	}
	
	public Parcel getParcel(String orderNumber) {
		return parcelDao.getParcel(orderNumber);
	}

}
