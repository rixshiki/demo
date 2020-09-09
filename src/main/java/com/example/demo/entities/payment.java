package com.example.demo.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")

public class payment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrder;
	private String userBank;
	private String sellerBank;
	private int lastNum;
	private int totalPayment;
	private LocalDateTime time;
	private String photoPayment;
	private LocalDateTime createdPayment;
	
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public String getUserBank() {
		return userBank;
	}
	public void setUserBank(String userBank) {
		this.userBank = userBank;
	}
	public String getSellerBank() {
		return sellerBank;
	}
	public void setSellerBank(String sellerBank) {
		this.sellerBank = sellerBank;
	}
	public int getLastNum() {
		return lastNum;
	}
	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}
	public int getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getPhotoPayment() {
		return photoPayment;
	}
	public void setPhotoPayment(String photoPayment) {
		this.photoPayment = photoPayment;
	}
	public LocalDateTime getCreatedPayment() {
		return createdPayment;
	}
	public void setCreatedPayment(LocalDateTime createdPayment) {
		this.createdPayment = createdPayment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdPayment == null) ? 0 : createdPayment.hashCode());
		result = prime * result + idOrder;
		result = prime * result + lastNum;
		result = prime * result + ((photoPayment == null) ? 0 : photoPayment.hashCode());
		result = prime * result + ((sellerBank == null) ? 0 : sellerBank.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + totalPayment;
		result = prime * result + ((userBank == null) ? 0 : userBank.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		payment other = (payment) obj;
		if (createdPayment == null) {
			if (other.createdPayment != null)
				return false;
		} else if (!createdPayment.equals(other.createdPayment))
			return false;
		if (idOrder != other.idOrder)
			return false;
		if (lastNum != other.lastNum)
			return false;
		if (photoPayment == null) {
			if (other.photoPayment != null)
				return false;
		} else if (!photoPayment.equals(other.photoPayment))
			return false;
		if (sellerBank == null) {
			if (other.sellerBank != null)
				return false;
		} else if (!sellerBank.equals(other.sellerBank))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (totalPayment != other.totalPayment)
			return false;
		if (userBank == null) {
			if (other.userBank != null)
				return false;
		} else if (!userBank.equals(other.userBank))
			return false;
		return true;
	}
	
}
