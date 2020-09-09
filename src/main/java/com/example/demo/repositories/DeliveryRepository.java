package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.delivery;

public interface DeliveryRepository extends JpaRepository<delivery, String> {

}
