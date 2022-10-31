package com.tgg.tggoms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tgg.tggoms.model.OrderAllocationHeader;
import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.model.OrderLines;
import com.tgg.tggoms.model.Packages;
import com.tgg.tggoms.model.Parcel;
import com.tgg.tggoms.service.OrderDetailsService;
import com.tgg.tggoms.vo.OrderDetailsVO;

@RestController
public class OrderDetailsController {
	
	@Autowired
	public OrderDetailsService orderDetailsService;

	@GetMapping("/orderdetails/{orderNumber}")
	public OrderDetailsVO getOrderDetails(@PathVariable String orderNumber) {
		OrderDetailsVO orderDetailsVO = new OrderDetailsVO();
		OrderHeader orderHeaader =orderDetailsService.getOrderHeader(orderNumber);
		orderDetailsVO.setOrderHeader(orderHeaader);
		OrderLines orderLines = orderDetailsService.getOrderLines(orderNumber);
		orderDetailsVO.setOrderLines(orderLines);
		OrderAllocationHeader orderAllocationHeader = orderDetailsService.getOrderAllocationHeader(orderNumber);
		orderDetailsVO.setOrderAllocationHeader(orderAllocationHeader);
		Packages packages = orderDetailsService.getPackages(orderNumber);
		orderDetailsVO.setPackages(packages);
		Parcel parcel = orderDetailsService.getParcel(orderNumber);
		orderDetailsVO.setParcel(parcel);
		return orderDetailsVO;
	}

}
