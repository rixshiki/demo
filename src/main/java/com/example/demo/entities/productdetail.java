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
	private Integer s;
	private Integer m;
	private Integer l;
	private Integer xl;
	private int price;
	private Integer numberStock;
	private String photoProduct;
	private int weight;
	private String category;
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Integer getS() {
		return s;
	}
	public void setS(Integer s) {
		this.s = s;
	}
	public Integer getM() {
		return m;
	}
	public void setM(Integer m) {
		this.m = m;
	}
	public Integer getL() {
		return l;
	}
	public void setL(Integer l) {
		this.l = l;
	}
	public Integer getXl() {
		return xl;
	}
	public void setXl(Integer xl) {
		this.xl = xl;
	}
	public Integer getNumberStock() {
		return numberStock;
	}
	public void setNumberStock(Integer numberStock) {
		this.numberStock = numberStock;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + idProduct;
		result = prime * result + ((l == null) ? 0 : l.hashCode());
		result = prime * result + ((m == null) ? 0 : m.hashCode());
		result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
		result = prime * result + ((numberStock == null) ? 0 : numberStock.hashCode());
		result = prime * result + ((photoProduct == null) ? 0 : photoProduct.hashCode());
		result = prime * result + price;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		result = prime * result + weight;
		result = prime * result + ((xl == null) ? 0 : xl.hashCode());
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
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (l == null) {
			if (other.l != null)
				return false;
		} else if (!l.equals(other.l))
			return false;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		if (nameProduct == null) {
			if (other.nameProduct != null)
				return false;
		} else if (!nameProduct.equals(other.nameProduct))
			return false;
		if (numberStock == null) {
			if (other.numberStock != null)
				return false;
		} else if (!numberStock.equals(other.numberStock))
			return false;
		if (photoProduct == null) {
			if (other.photoProduct != null)
				return false;
		} else if (!photoProduct.equals(other.photoProduct))
			return false;
		if (price != other.price)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		if (weight != other.weight)
			return false;
		if (xl == null) {
			if (other.xl != null)
				return false;
		} else if (!xl.equals(other.xl))
			return false;
		return true;
	}
	
}
