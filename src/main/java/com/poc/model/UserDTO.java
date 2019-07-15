package com.poc.model;

import javax.persistence.Column;

public class UserDTO {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String driverLicenseNumber;
	
	private String trilliumNumber;
	
	private String postalCode;
	
	private String dob;
	
	

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public String getTrilliumNumber() {
		return trilliumNumber;
	}

	public void setTrilliumNumber(String trilliumNumber) {
		this.trilliumNumber = trilliumNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	
	
	

}
