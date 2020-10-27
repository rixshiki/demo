package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.userorder;

public interface UserOrderRepository extends JpaRepository<userorder, Integer> {
	
	@Query("from userorder o where o.status = :status order by o.payTime asc")
	List<userorder> getByStatus(@Param("status")String status);

	@Query("from userorder o where o.status = :status order by o.payTime asc, o.sellerBank asc")
	List<userorder> getByStatusorderbySellerBank(@Param("status")String status);
}
