package com.ph.ceu.oop.model;

import com.ph.ceu.oop.impl.Vehicle;

public class TransactionHistory {
	
	private UserDetails userDetails;
	private Vehicle vehicleBrand;
	private String process;

	public void setVehicleBrand(Vehicle vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	
	public Vehicle getVehicleBrand() {
		return this.vehicleBrand;
	}
	
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	public UserDetails getUserDetails() {
		return this.userDetails;
	}
	
	public void setProcess(String process) {
		this.process = process;
	}
	
	public String getProcess() {
		return this.process;
	}

}
