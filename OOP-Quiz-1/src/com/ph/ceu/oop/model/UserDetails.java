package com.ph.ceu.oop.model;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private String address;
	
	public UserDetails() {}
	
	public UserDetails(String firstName, String middleName, String lastName, 
			int age, String address) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("First Name: ").append(this.firstName).append("\n");
		sb.append("Middle Name: ").append(this.middleName).append("\n");
		sb.append("Last Name: ").append(this.lastName).append("\n");
		sb.append("Address: ").append(this.address).append("\n");
		sb.append("Age: ").append(this.age).append("\n");
		return sb.toString();
	}
}
