package com.poc.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.config.ApplicationConfigurationLoader;
import com.poc.model.User;
import com.poc.model.UserDTO;
import com.poc.service.UserService;

@RestController
@RequestMapping("/AUTHENTICATION-CHECK/V1.0")
// Swagger Specific Annotations
@Api(value = "USER AUTHENTICATION-CHECK", description = "USER AUTHENTICATION-CHECK")
public class AuthenticationCheckAPI {

	private static final Logger logger = Logger.getLogger(AuthenticationCheckAPI.class.getName());

	@Autowired
	ApplicationConfigurationLoader CONFIG;

	@Autowired
	UserService userService;

			
	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "USER AUTHENTICATION")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Valid User", response = Void.class),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE",response = Void.class),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN",response = Void.class),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND",response = Void.class) })
	@RequestMapping(value = "/USER", method = RequestMethod.POST)
	public ResponseEntity<UserDTO> authenticateUser(
			@RequestParam(name = "userName", required = false) String userName,
			@RequestParam(name = "password", required = false) String password) {
		UserDTO userData = new UserDTO();
		User user = userService.validate(userName, password);
		if(user !=null && user.getUserName().equals(userName) && user.getPassword().equals(password) ) {
			userData.setDriverLicenceNumber(user.getDriverLicenceNumber());
			userData.setTriulliumNumber(user.getTriulliumNumber());
			userData.setPostalCode(user.getPostalCode());
			userData.setDateOfBirth(user.getDateOfBirth());
			return new ResponseEntity<UserDTO>(userData, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<UserDTO>(userData, HttpStatus.UNAUTHORIZED);
		}
		
		
	}
	
	
	

}
