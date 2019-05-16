package com.hcl.tradingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.tradingsystem.entity.Stocks;
import com.hcl.tradingsystem.repo.StockRepo;
import com.hcl.tradingsystem.service.StockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradingsystemApplicationTests {
	
	@Autowired
	private StockService stockService;
	
	@MockBean
	private StockRepo stockRepo;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void findAllStocksTest() {
		List<Stocks> list = new ArrayList<Stocks>();
		Stocks stock1 = new Stocks(1L,"HCL",980.0,1);
		Stocks stock2 = new Stocks(2L,"Wipro",900.0,2);
        
         
        list.add(stock1);
        list.add(stock2);
         
        when(stockRepo.findAll()).thenReturn(list);
         
        //test
        List<Stocks> stockList = stockService.findAllStocks();
         
        assertEquals(2, stockList.size());
        verify(stockRepo, times(1)).findAll();
    }
	

}
