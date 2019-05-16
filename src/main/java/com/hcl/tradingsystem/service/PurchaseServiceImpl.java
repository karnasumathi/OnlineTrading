package com.hcl.tradingsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.tradingsystem.dto.PurchaseDto;
import com.hcl.tradingsystem.dto.Response;
import com.hcl.tradingsystem.entity.PurchaseOrder;
import com.hcl.tradingsystem.entity.Stocks;
import com.hcl.tradingsystem.repository.PurchaseRepository;
import com.hcl.tradingsystem.repository.StocksRepository;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	StocksRepository stockRepository;
	
	@Autowired
	PurchaseRepository purchaseRepository;
    
	Response response=new Response();
	
	
	@Override
	public String purchaseOrder(PurchaseDto dto) {
		Double fees=0.0;

		PurchaseOrder purchaseinfo = new PurchaseOrder();

		Optional<Stocks> stocks = stockRepository.findById(dto.getStockId());

		if (stocks != null) {
			
			if(dto.getPurchasedVolume()<=stocks.get().getStockQty()) {
				

				   if(dto.getPurchasedVolume()<500) {
					   
					 fees= (stocks.get().getPrice())*(0.10/100)*dto.getPurchasedVolume();
					}
				   
				   if(dto.getPurchasedVolume()>=500) {
					   
			             long shares=dto.getPurchasedVolume()-500;
					   
					    fees= (stocks.get().getPrice()*(0.15/100)*shares)+(stocks.get().getPrice()*(0.10/100)*500);
				      
				   }
	
			purchaseinfo.setStockId(dto.getStockId());
			purchaseinfo.setUserId(dto.getUserId());
			purchaseinfo.setPurchasedVolume(dto.getPurchasedVolume());		
			double totalPrice = fees+(dto.getPurchasedVolume()*stocks.get().getPrice());
			purchaseinfo.setStockPrice(dto.getStockPrice());
			purchaseinfo.setTotalprice(totalPrice);
			purchaseinfo.setConfirmOrder('N');
			 purchaseRepository.save(purchaseinfo);
			}
			
			else {
				response.setMessage("Requested Stocks are morethan stocks avalablity");
				
			}
	
	response.setMessage("proceed to order Confirm or Cancel");
   
	
	
	

		
		}
		

	return "proceed to order Confirm or Cancel";
}
}
