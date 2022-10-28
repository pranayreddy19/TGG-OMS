package com.tgg.tggoms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.repository.DatabaseRepository;

@RestController
public class OrderHeaderController {
	@Autowired
	DatabaseRepository databaseRepository;
	
	@GetMapping("/welcome/{orderNumber}")
	public void getOrderHeader(@PathVariable String orderNumber){
		 databaseRepository.getOrderHeader(orderNumber);
	}

}
