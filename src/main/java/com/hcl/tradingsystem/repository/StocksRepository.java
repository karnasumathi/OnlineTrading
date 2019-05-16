package com.hcl.tradingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.tradingsystem.entity.Stocks;

@Repository
public interface StocksRepository  extends JpaRepository<Stocks, Long>{

	//Stocks findByStockId(Long stockId);

}
