package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.productdetail;

public interface ProductDetailRepository extends JpaRepository<productdetail, Integer> {

}
