package com.ph.ceu.oop.model.choices;

public class Buy {
	
	private String modeOfPayment;
	private int termsOfPayment;
	private double monthlySalary;
	
	public Buy() {}
	
	public Buy(String modeOfPayment, int termsOfPayment, double monthlySalary) {
		this.modeOfPayment = modeOfPayment;
		this.termsOfPayment = termsOfPayment;
		this.monthlySalary = monthlySalary;
	}

	public String getModeOfPayment() {
		return this.modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public int getTermsOfPayment() {
		return this.termsOfPayment;
	}

	public void setTermsOfPayment(int termsOfPayment) {
		this.termsOfPayment = termsOfPayment;
	}

	public double getMonthlySalary() {
		return this.monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User's monthly salary is ").append(this.monthlySalary).append("\n");
		sb.append("User's mode of payment is ").append(this.modeOfPayment).append("\n");
		sb.append("User's term of payment is ").append(this.termsOfPayment).append("\n");
		return sb.toString();
	}
}
