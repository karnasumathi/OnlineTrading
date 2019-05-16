package com.hcl.tradingsystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.tradingsystem.dto.PurchaseDto;
import com.hcl.tradingsystem.dto.Response;
import com.hcl.tradingsystem.entity.Stocks;
import com.hcl.tradingsystem.repository.PurchaseRepository;
import com.hcl.tradingsystem.repository.StocksRepository;


@RunWith(MockitoJUnitRunner.class)
public class ReviewOrderTests {
	
	
	@Mock
	PurchaseRepository puchaseRepository;
	
	@Mock
	StocksRepository stockRepository;
	
	@InjectMocks
	PurchaseServiceImpl purchaseServiceImpl;
	
	@Test
	public void testReviewOrder() {
		
		Optional<Stocks> stocks=Optional.empty();
		
		Stocks stock=new Stocks();
		stock.setStockQty(200);
		stock.setPrice(200.0);
		
		stocks=Optional.of(stock);
		
		PurchaseDto dto=new PurchaseDto();
		dto.setStockId(1L);
		dto.setUserId(2L);
		dto.setPurchasedVolume(100L);
		
		
       Mockito.when(stockRepository.findById(dto.getStockId())).thenReturn(stocks);
        
       String response=purchaseServiceImpl.purchaseOrder(dto);
         System.out.println(response);
		      Assert.assertEquals("proceed to order Confirm or Cancel", response);
		
	}
	


}
