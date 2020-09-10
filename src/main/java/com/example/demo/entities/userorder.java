package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userorder")

public class userorder {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrder;
	private int totalOrder;
	private String track;
	private String status;
	private int idUser;
	private int totalWeight;
	private int cratedOrder;

	@OneToMany
	private Set<orderdetail> orderdetails = new HashSet<orderdetail>();
	
	@OneToMany
	private Set<payment> payments = new HashSet<payment>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", insertable = false, updatable = false)
	private userprofile userprofile;
	
	public Set<orderdetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(Set<orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
		for(orderdetail orderdetail :orderdetails) {
			orderdetail.setUserorder(this);
		}
	}
	public Set<payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<payment> payments) {
		this.payments = payments;
		for(payment payment :payments) {
			payment.setUserorder(this);
		}
	}
	
	public userprofile getUserprofile() {
		return userprofile;
	}
	public void setUserprofile(userprofile userprofile) {
		this.userprofile = userprofile;
		this.userprofile.getUserorders().add(this);
	}
	
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	public int getCratedOrder() {
		return cratedOrder;
	}
	public void setCratedOrder(int cratedOrder) {
		this.cratedOrder = cratedOrder;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cratedOrder;
		result = prime * result + idOrder;
		result = prime * result + idUser;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + totalOrder;
		result = prime * result + totalWeight;
		result = prime * result + ((track == null) ? 0 : track.hashCode());
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
		userorder other = (userorder) obj;
		if (cratedOrder != other.cratedOrder)
			return false;
		if (idOrder != other.idOrder)
			return false;
		if (idUser != other.idUser)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalOrder != other.totalOrder)
			return false;
		if (totalWeight != other.totalWeight)
			return false;
		if (track == null) {
			if (other.track != null)
				return false;
		} else if (!track.equals(other.track))
			return false;
		return true;
	}
	
}
