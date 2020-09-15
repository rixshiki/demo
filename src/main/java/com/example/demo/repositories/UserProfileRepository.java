package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.userprofile;

public interface UserProfileRepository extends JpaRepository<userprofile, Integer> {

	List<userprofile> findByemail(String email);
}
