package com.user.onBoarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel {

	@Id
	@GeneratedValue
	@Column(name= "nticid")
	private Integer nticId;
	@Column(name= "fullname")
	private String fullName;
	@Column(name= "firstname")
	private String firstName;
	@Column(name= "lastname")
	private String lastName;
	@Column(name= "shortname")
	private String shortName;
	@Column(name= "startdate")
	private String startDate;
	@Column(name= "workertype")
	private String workerType;
	@Column(name= "responsibilty")
	private String responsibility;
	@Column(name= "vendor")
	private String vendor;
	@Column(name= "location")
	private String location;
	@Column(name= "department")
	private String department;
	@Column(name= "division")
	private String division;
	@Column(name= "email")
	private String email;

	public Integer getNticId() {
		return nticId;
	}

	public void setNticId(Integer nticId) {
		this.nticId = nticId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getWorkerType() {
		return workerType;
	}

	public void setWorkerType(String workerType) {
		this.workerType = workerType;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserModel [nticid=" + nticId + ", fullName=" + fullName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", shortName=" + shortName + ", startDate=" + startDate + ", workerType=" + workerType
				+ ", responsibility=" + responsibility + ", vendor=" + vendor + ", location=" + location
				+ ", department=" + department + ", division=" + division + ", email=" + email + "]";
	}

}
