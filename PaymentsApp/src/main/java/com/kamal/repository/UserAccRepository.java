package com.kamal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamal.entity.UserAccEntity;



@Repository
public interface UserAccRepository extends JpaRepository<UserAccEntity, Integer>{

}

