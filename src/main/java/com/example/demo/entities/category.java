package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class category {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idCategory;
	private String nameCat;
	private String detailCat;
	private String photoCat;
	
	public String getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}
	public String getNameCat() {
		return nameCat;
	}
	public void setNameCat(String nameCat) {
		this.nameCat = nameCat;
	}
	public String getDetailCat() {
		return detailCat;
	}
	public void setDetailCat(String detailCat) {
		this.detailCat = detailCat;
	}
	public String getPhotoCat() {
		return photoCat;
	}
	public void setPhotoCat(String photoCat) {
		this.photoCat = photoCat;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detailCat == null) ? 0 : detailCat.hashCode());
		result = prime * result + ((idCategory == null) ? 0 : idCategory.hashCode());
		result = prime * result + ((nameCat == null) ? 0 : nameCat.hashCode());
		result = prime * result + ((photoCat == null) ? 0 : photoCat.hashCode());
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
		category other = (category) obj;
		if (detailCat == null) {
			if (other.detailCat != null)
				return false;
		} else if (!detailCat.equals(other.detailCat))
			return false;
		if (idCategory == null) {
			if (other.idCategory != null)
				return false;
		} else if (!idCategory.equals(other.idCategory))
			return false;
		if (nameCat == null) {
			if (other.nameCat != null)
				return false;
		} else if (!nameCat.equals(other.nameCat))
			return false;
		if (photoCat == null) {
			if (other.photoCat != null)
				return false;
		} else if (!photoCat.equals(other.photoCat))
			return false;
		return true;
	}
	
}
