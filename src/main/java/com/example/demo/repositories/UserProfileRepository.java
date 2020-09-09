package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.userprofile;

public interface UserProfileRepository extends JpaRepository<userprofile, Integer> {

}
