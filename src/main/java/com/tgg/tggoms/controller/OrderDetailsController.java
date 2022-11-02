package com.tgg.tggoms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.tgg.tggoms.service.OrderDetailsService;
import com.tgg.tggoms.vo.OrderHeaderVO;

@RestController
public class OrderDetailsController {
	
	@Autowired
	public OrderDetailsService orderDetailsService;

	@GetMapping("/orderdetails/{orderNumber}")
	public OrderHeaderVO getOrderDetails(@PathVariable @Valid String orderNumber) throws JsonMappingException, JsonProcessingException {
		return orderDetailsService.getOrderHeader(orderNumber);
	}

}
