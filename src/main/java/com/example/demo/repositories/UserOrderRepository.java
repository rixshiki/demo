package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.userorder;

public interface UserOrderRepository extends JpaRepository<userorder, Integer> {

}
