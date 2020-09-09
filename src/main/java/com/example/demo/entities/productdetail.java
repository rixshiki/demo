package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productdetail")

public class productdetail {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	private String nameProduct;
	private int price;
	private int numberStock;
	private String photoProduct;
	private int weight;
	
	@OneToMany
	private Set<orderdetail> orderdetails = new HashSet<orderdetail>();
	
	public Set<orderdetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(Set<orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
		for(orderdetail orderdetail :orderdetails) {
			orderdetail.setProductdetail(this);
		}
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberStock() {
		return numberStock;
	}
	public void setNumberStock(int numberStock) {
		this.numberStock = numberStock;
	}
	public String getPhotoProduct() {
		return photoProduct;
	}
	public void setPhotoProduct(String photoProduct) {
		this.photoProduct = photoProduct;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProduct;
		result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
		result = prime * result + numberStock;
		result = prime * result + ((photoProduct == null) ? 0 : photoProduct.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
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
		productdetail other = (productdetail) obj;
		if (idProduct != other.idProduct)
			return false;
		if (nameProduct == null) {
			if (other.nameProduct != null)
				return false;
		} else if (!nameProduct.equals(other.nameProduct))
			return false;
		if (numberStock != other.numberStock)
			return false;
		if (photoProduct == null) {
			if (other.photoProduct != null)
				return false;
		} else if (!photoProduct.equals(other.photoProduct))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
}
