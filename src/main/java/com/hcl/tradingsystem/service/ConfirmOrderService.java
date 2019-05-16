package com.hcl.tradingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.tradingsystem.repo.StockRepo;
import com.hcl.tradingsystem.repository.UserRepository;

public class ConfirmOrderService {
	
	@Autowired
	UserRepository userRepo;

	@Autowired
	private StockRepo stockRepo;
	Character confirmOrder='n';
	public void confirmOrder(Long stockId ,Long userId) {
		
	}

}
