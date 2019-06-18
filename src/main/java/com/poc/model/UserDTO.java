package com.poc.model;

import javax.persistence.Column;

public class UserDTO {
	
	private String driverLicenceNumber;
	
	private String triulliumNumber;
	
	private String postalCode;
	
	private String dateOfBirth;

	public String getDriverLicenceNumber() {
		return driverLicenceNumber;
	}

	public void setDriverLicenceNumber(String driverLicenceNumber) {
		this.driverLicenceNumber = driverLicenceNumber;
	}

	
	public String getTriulliumNumber() {
		return triulliumNumber;
	}

	public void setTriulliumNumber(String triulliumNumber) {
		this.triulliumNumber = triulliumNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
