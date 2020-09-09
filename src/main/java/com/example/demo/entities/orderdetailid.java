package com.example.demo.entities;

import java.io.Serializable;

public class orderdetailid implements Serializable{
	
	private static final long serialVersionUID = -1584319743232923697L;
	private int idorder;
	private int noorder;
	
	public int getIdorder() {
		return idorder;
	}
	public void setIdorder(int idorder) {
		this.idorder = idorder;
	}
	public int getNoorder() {
		return noorder;
	}
	public void setNoorder(int noorder) {
		this.noorder = noorder;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idorder;
		result = prime * result + noorder;
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
		if (idorder != other.idorder)
			return false;
		if (noorder != other.noorder)
			return false;
		return true;
	}
	
	
}
