package com.kamal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamal.entity.BankAccEntity;
import com.kamal.entity.UserEntity;


@Repository
public interface BankAccRepository extends JpaRepository<BankAccEntity, Integer>{
	
	public List<BankAccEntity> findByUser(UserEntity user);
	
	public Optional<BankAccEntity> findByAccountNumber(String accountNumber);
	
}
