package com.hcl.tradingsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.tradingsystem.entity.Stocks;

@Repository
public interface StockRepo extends JpaRepository<Stocks, Long> {

}
