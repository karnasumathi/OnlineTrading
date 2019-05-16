package com.hcl.tradingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.tradingsystem.repo.StockRepo;

@Service
@Transactional
public class ConfirmOrderService {
	
	@Autowired
	private StockRepo stockRepo;
	String message="no";
	
	public void confirmOrder(Long userId,Long stockId) {
		if(message.equalsIgnoreCase("no")) {
			stockRepo.getOne(stockId);
			
		}
	}

}
