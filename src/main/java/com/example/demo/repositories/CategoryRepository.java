package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.category;

public interface CategoryRepository extends JpaRepository<category, String> {

	@Query("select min(idCategory) from category")
	String getMinIdcategory();
}
