package com.example.demo.entities;

import java.io.Serializable;

public class orderdetailid implements Serializable{
	
	private static final long serialVersionUID = -1584319743232923697L;
	private int idOrder;
	private int noOrder;
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idOrder;
		result = prime * result + noOrder;
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
		orderdetailid other = (orderdetailid) obj;
		if (idOrder != other.idOrder)
			return false;
		if (noOrder != other.noOrder)
			return false;
		return true;
	}
	
}
