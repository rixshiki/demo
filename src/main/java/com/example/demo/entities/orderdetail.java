package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetail")

public class orderdetail {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrder;
	private int noOrder;
	private int number;
	private int idProduct;
	private int realPrice;
	
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getNoOrder() {
		return noOrder;
	}
	public void setNoOrder(int noOrder) {
		this.noOrder = noOrder;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getRealPrice() {
		return realPrice;
	}
	public void setRealPrice(int realPrice) {
		this.realPrice = realPrice;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idOrder;
		result = prime * result + idProduct;
		result = prime * result + noOrder;
		result = prime * result + number;
		result = prime * result + realPrice;
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
		orderdetail other = (orderdetail) obj;
		if (idOrder != other.idOrder)
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (noOrder != other.noOrder)
			return false;
		if (number != other.number)
			return false;
		if (realPrice != other.realPrice)
			return false;
		return true;
	}
	
	
}
