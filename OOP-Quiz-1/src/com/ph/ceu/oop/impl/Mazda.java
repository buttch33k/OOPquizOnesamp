package com.ph.ceu.oop.impl;

public class Mazda extends Vehicle {
	
	@Override
	public void setModel(String model) {
		super.setModel(model);
	}
	
	@Override
	public void printModel() {
		System.out.println("Mazda model is " + super.getModel());
	}
	
	@Override
	public void printBrand() {
		System.out.println("My vehicle brand is Mazda..");
	}

}
