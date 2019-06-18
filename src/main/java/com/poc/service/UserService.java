package com.poc.service;

import org.springframework.stereotype.Service;

import com.poc.model.User;


@Service
public interface UserService {

	User validate(String userName, String password);

}
