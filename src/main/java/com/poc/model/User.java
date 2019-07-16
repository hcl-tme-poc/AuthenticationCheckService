package com.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	 
    @Column(name="USER_ID")
	private Long id;
	
	@Column(name="FIRST_NAME")
	private String first_Name;
	
	@Column(name="LAST_NAME")
	private String last_Name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="DRIVER_LICENSE_NO")
	private String driverLicenceNumber;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="DRIVER_LICENSE_TRILLIUM_NO")
	private String triulliumNumber;
	
	@Column(name="DRIVER_POSTALCODE")
	private String postalCode;
	
	@Column(name="DRIVER_DOB")
	private String dateOfBirth;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getFirstName() {
		return first_Name;
	}

	public void setFirstName(String firstName) {
		this.first_Name = firstName;
	}

	public String getLastName() {
		return last_Name;
	}

	public void setLastName(String lastName) {
		this.last_Name = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
