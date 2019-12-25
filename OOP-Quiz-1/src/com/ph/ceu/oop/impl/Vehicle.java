package com.ph.ceu.oop.impl;

public class Vehicle {
	
	private String model;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void printModel() {
		System.out.println("Generic model is " + this.model);
	}
	
	public void printBrand() {
		System.out.println("My vehicle brand is generic");
	}
	
	public void startEngine() {
		System.out.println("starting engine..");
	}
	
	public void stopEngine() {
		System.out.println("stopping engine..");
	}
	
	public void forward() {
		System.out.println("moving forward..");
	}
	
	public void reverse() {
		System.out.println("moving reverse..");
	}
	
	public void stop() {
		System.out.println("break..");
	}

}
