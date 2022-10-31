package com.tgg.tggoms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.service.OrderDetailsService;
import com.tgg.tggoms.vo.OrderDetailsVO;

@RestController
public class OrderDetailsController {
	
	@Autowired
	public OrderDetailsService orderDetailsService;

	@GetMapping("/orderdetails/{orderNumber}")
	public OrderHeader getOrderDetails(@PathVariable @Valid String orderNumber) {
		return orderDetailsService.getOrderHeader(orderNumber);
	}

}
