package com.hcl.tradingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.tradingsystem.entity.Stocks;
import com.hcl.tradingsystem.repo.StockRepo;

@Service
@Transactional
public class StockService {
	
	@Autowired
	private StockRepo stockRepo;
	
	public Stocks saveStock(Stocks stock) {
		return stockRepo.save(stock);
	}
	
	public List<Stocks> findAllStocks(){
		return stockRepo.findAll();
	}

}
