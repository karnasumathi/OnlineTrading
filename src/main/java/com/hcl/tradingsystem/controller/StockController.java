package com.hcl.tradingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.tradingsystem.entity.Stocks;
import com.hcl.tradingsystem.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@PostMapping("/addStock")
	public String addStock(@RequestBody Stocks stock) {
		stockService.saveStock(stock);
		return "Stock added";
	}
	
	@GetMapping("/findAllStocks")
	public List<Stocks> getAllStocks() {
		return stockService.findAllStocks();
	}

}
