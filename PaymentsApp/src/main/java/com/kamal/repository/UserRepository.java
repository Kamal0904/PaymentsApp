package com.kamal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamal.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	public Optional<UserEntity> findByUserNameAndPassword(String userName,String password);
}
