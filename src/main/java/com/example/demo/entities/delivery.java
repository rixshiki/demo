package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")

public class delivery {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDelivery;
	private String nameDelivery;
	private int maxWeight;
	private int priceDelivery;
	
	public int getIdDelivery() {
		return idDelivery;
	}
	public void setIdDelivery(int idDelivery) {
		this.idDelivery = idDelivery;
	}
	public String getNameDelivery() {
		return nameDelivery;
	}
	public void setNameDelivery(String nameDelivery) {
		this.nameDelivery = nameDelivery;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	public int getPriceDelivery() {
		return priceDelivery;
	}
	public void setPriceDelivery(int priceDelivery) {
		this.priceDelivery = priceDelivery;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDelivery;
		result = prime * result + maxWeight;
		result = prime * result + ((nameDelivery == null) ? 0 : nameDelivery.hashCode());
		result = prime * result + priceDelivery;
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
		delivery other = (delivery) obj;
		if (idDelivery != other.idDelivery)
			return false;
		if (maxWeight != other.maxWeight)
			return false;
		if (nameDelivery == null) {
			if (other.nameDelivery != null)
				return false;
		} else if (!nameDelivery.equals(other.nameDelivery))
			return false;
		if (priceDelivery != other.priceDelivery)
			return false;
		return true;
	}
	
}
