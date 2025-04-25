package com.kamal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamal.entity.TransactionsEntity;


@Repository
public interface TransactionsRepositary extends JpaRepository<TransactionsEntity, Integer>{
	public List<TransactionsEntity> findBySourceId(int sourceId);
}

