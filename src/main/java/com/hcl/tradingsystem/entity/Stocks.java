package com.hcl.tradingsystem.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

	@Table(name="stocks")

	public class Stocks implements Serializable{


		private static final long serialVersionUID = 1L;

		@Id

		@GeneratedValue(strategy = GenerationType.IDENTITY)

		private Long StockId;	

		private String ComapnyName;

		private Double Price;

		private Integer StockQty;

		public Long getStockId() {

			return StockId;

		}

		public void setStockId(Long stockId) {

			StockId = stockId;

		}

		public String getComapnyName() {

			return ComapnyName;

		}

		public void setComapnyName(String comapnyName) {

			ComapnyName = comapnyName;

		}

		public Double getPrice() {

			return Price;

		}

		public void setPrice(Double price) {

			Price = price;

		}

		public Integer getStockQty() {

			return StockQty;

		}

		public void setStockQty(Integer stockQty) {

			StockQty = stockQty;

		}	

	}
	


