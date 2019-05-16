package com.hcl.tradingsystem.dto;

public class PurchaseDto {
	
	
	
	private Long purchseId;	
	private Long StockId;
	private Long userId;	
	private Long purchasedVolume;
	private Double stockPrice;	
	private Double totalprice;
	
	public Long getPurchseId() {
		return purchseId;
	}
	public void setPurchseId(Long purchseId) {
		this.purchseId = purchseId;
	}
	public Long getStockId() {
		return StockId;
	}
	public void setStockId(Long stockId) {
		StockId = stockId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPurchasedVolume() {
		return purchasedVolume;
	}
	public void setPurchasedVolume(Long purchasedVolume) {
		this.purchasedVolume = purchasedVolume;
	}
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	
	
	
	

}
