package com.poc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poc.model.User;

public interface UserRepository extends JpaRepository<User, Serializable> {
	
	
	public User findByUserNameAndPassword(String userName, String password);

}
