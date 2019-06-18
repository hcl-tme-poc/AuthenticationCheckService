package com.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.User;
import com.poc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User validate(String userName, String password) {
		
		User user= userRepository.findByUserNameAndPassword(userName, password);
		return user;
		
	}

	

}
