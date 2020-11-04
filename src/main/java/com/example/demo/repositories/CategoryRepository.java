package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.category;

public interface CategoryRepository extends JpaRepository<category, String> {

	@Query("select min(idCategory) from category")
	String getMinIdcategory();
	
	@Modifying
	@Transactional
	@Query (nativeQuery = true, value="DELETE FROM category WHERE id_category = :idCategory")
	void deleteByIdCategory(@Param("idCategory")int idCategory);
}
