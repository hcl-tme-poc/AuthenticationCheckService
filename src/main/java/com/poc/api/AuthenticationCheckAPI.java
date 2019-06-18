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
	@RequestMapping(value = "/USER", method = RequestMethod.GET)
	public ResponseEntity<UserDTO> authenticateUser(
			@RequestParam(name = "userName", required = false) String userName,
			@RequestParam(name = "password", required = false) String password) {
		
		UserDTO userData = new UserDTO();
		if(userName != null && userName.equals("Nataraj") && password.equals("12345")) {
			userData.setDriverLicenceNumber("A1234-12345-53421");
			userData.setTriulliumNumber("12345");
			userData.setPostalCode("560040");
			userData.setDateOfBirth("01-01-1998");
			return new ResponseEntity<UserDTO>(userData, HttpStatus.OK);
		}
		else if (userName != null && userName.equals("Dipankar") && password.equals("44444")) {
			userData.setDriverLicenceNumber("A1234-12345-12345");
			userData.setTriulliumNumber("55555");
			userData.setPostalCode("560080");
			userData.setDateOfBirth("01-01-1999");
			return new ResponseEntity<UserDTO>(userData, HttpStatus.OK);
		}else {
			return new ResponseEntity<UserDTO>(HttpStatus.UNAUTHORIZED);
		}
			
		
		/*User user = userService.validate(emailId, password);
		if(user !=null && user.getEmail().equals(emailId) && user.getPassword().equals(password) ) {
			 return new ResponseEntity<>("Valid User", HttpStatus.OK);
		}
		else {
			 return new ResponseEntity<>("Invalid User", HttpStatus.UNAUTHORIZED);
		}*/
		
		
	}
	
	
	

}
