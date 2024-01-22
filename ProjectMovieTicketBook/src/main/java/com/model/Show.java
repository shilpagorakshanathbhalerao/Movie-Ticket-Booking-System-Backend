package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shows")
public class Show 
{
	@Id
	private int showId;
	private String showName;	
	private String paymentType;
	//private Date showDate;
	private int platiniumPrice;
	private int silverPrice;
	private int goldPrice;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getPlatiniumPrice() {
		return platiniumPrice;
	}
	public void setPlatiniumPrice(int platiniumPrice) {
		this.platiniumPrice = platiniumPrice;
	}
	public int getSilverPrice() {
		return silverPrice;
	}
	public void setSilverPrice(int silverPrice) {
		this.silverPrice = silverPrice;
	}
	public int getGoldPrice() {
		return goldPrice;
	}
	public void setGoldPrice(int goldPrice) {
		this.goldPrice = goldPrice;
	}
	public Show(int showId, String showName, String paymentType, int platiniumPrice, int silverPrice, int goldPrice) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.paymentType = paymentType;
		this.platiniumPrice = platiniumPrice;
		this.silverPrice = silverPrice;
		this.goldPrice = goldPrice;
	}
	public Show() {
		super();
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showName=" + showName + ", paymentType=" + paymentType
				+ ", platiniumPrice=" + platiniumPrice + ", silverPrice=" + silverPrice + ", goldPrice=" + goldPrice
				+ "]";
	}
	
	

}