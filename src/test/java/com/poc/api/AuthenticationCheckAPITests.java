package com.poc.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.poc.model.User;
import com.poc.model.UserDTO;
import com.poc.service.UserService;

@RunWith(SpringRunner.class)
public class AuthenticationCheckAPITests {
	
	
	@InjectMocks
	private AuthenticationCheckAPI checkAPI = new AuthenticationCheckAPI();
	
	@Mock
	UserService userService;
	
	
	@Test
	public void authenticateUser() {
		
		String userName="alex@gmail.com";
		String password ="12345";
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setId(1l);
		user.setDateOfBirth("01/01/1990");
		user.setFirstName("alex");
		user.setDriverLicenceNumber("A1234-12345-12345");
		user.setEmail("alex@gmail.com");
		user.setLastName("carry");
		user.setPostalCode("560040");
		user.setTriulliumNumber("1234567");
		
		when(userService.validate(userName, password)).thenReturn(user);
		ResponseEntity<UserDTO> check = checkAPI.authenticateUser(userName, password);
		assertEquals(HttpStatus.OK, check.getStatusCode());
	}
	
	@Test
	public void invalidUser() {
		
		String userName="alex@gmail.com";
		String password ="12345";
		
		User user = null;
		
		
		when(userService.validate(userName, password)).thenReturn(user);
		ResponseEntity<UserDTO> check = checkAPI.authenticateUser(userName, password);
		assertEquals(HttpStatus.UNAUTHORIZED, check.getStatusCode());
	}

}
