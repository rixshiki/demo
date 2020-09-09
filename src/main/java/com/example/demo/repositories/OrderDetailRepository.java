package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.orderdetail;
import com.example.demo.entities.orderdetailid;

public interface OrderDetailRepository extends JpaRepository<orderdetail, orderdetailid> {

}
