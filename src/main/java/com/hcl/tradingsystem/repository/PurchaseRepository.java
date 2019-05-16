package com.hcl.tradingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.tradingsystem.entity.PurchaseOrder;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseOrder, Long> {

	 
}
