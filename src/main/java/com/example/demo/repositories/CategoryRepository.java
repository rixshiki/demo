package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.category;

public interface CategoryRepository extends JpaRepository<category, String> {

}
