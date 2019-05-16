package com.hcl.tradingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.tradingsystem.dto.PurchaseDto;
import com.hcl.tradingsystem.service.PurchaseService;

@RestController
public class PurchaseController {
	
	
	@Autowired
	PurchaseService purchaseService;
	
	@PutMapping("/buyStocks")
	public String purchaseOrder(@RequestBody PurchaseDto dto) {
		
		String msg=purchaseService.purchaseOrder(dto);
		
		return msg;
		
		
	}

}
