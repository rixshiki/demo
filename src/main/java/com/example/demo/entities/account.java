package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class account {
	
	@Id
	private String numAccount;
	private String nameBank;
	private String nameAccount;
	
	public String getNameBank() {
		return nameBank;
	}
	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}
	public String getNumAccount() {
		return numAccount;
	}
	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}
	public String getNameAccount() {
		return nameAccount;
	}
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAccount == null) ? 0 : nameAccount.hashCode());
		result = prime * result + ((nameBank == null) ? 0 : nameBank.hashCode());
		result = prime * result + ((numAccount == null) ? 0 : numAccount.hashCode());
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
		account other = (account) obj;
		if (nameAccount == null) {
			if (other.nameAccount != null)
				return false;
		} else if (!nameAccount.equals(other.nameAccount))
			return false;
		if (nameBank == null) {
			if (other.nameBank != null)
				return false;
		} else if (!nameBank.equals(other.nameBank))
			return false;
		if (numAccount == null) {
			if (other.numAccount != null)
				return false;
		} else if (!numAccount.equals(other.numAccount))
			return false;
		return true;
	}
	
	
}
