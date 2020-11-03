package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.account;

public interface AccountRepository extends JpaRepository<account, String> {

	@Modifying
	@Transactional
	@Query (nativeQuery = true, value="DELETE FROM account WHERE num_account = :numAccount")
	void deleteByNumAccount(@Param("numAccount")String numAccount);
}
