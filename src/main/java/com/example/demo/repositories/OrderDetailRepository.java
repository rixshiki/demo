package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.orderdetail;
import com.example.demo.entities.orderdetailid;

public interface OrderDetailRepository extends JpaRepository<orderdetail, orderdetailid> {
	
	@Query("from orderdetail d where d.idOrder = :idOrder")
	List<orderdetail> getByIdorder(@Param("idOrder")int idOrder);
}
