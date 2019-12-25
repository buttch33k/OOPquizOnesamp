package com.ph.ceu.oop.model.choices;

public class Decorate {
	
	private String colorOfHood;
	private String colorOfBumper;
	private String colorOfMugs;
	
	public Decorate() {}
	
	public Decorate(String colorOfHood, String colorOfBumper, String colorOfMugs) {
		this.colorOfHood = colorOfHood;
		this.colorOfBumper = colorOfBumper;
		this.colorOfMugs = colorOfMugs;
	}
	
	public String getColorOfHood() {
		return this.colorOfHood;
	}
	
	public void setColorOfHood(String colorOfHood) {
		this.colorOfHood = colorOfHood;
	}
	
	public String getColorOfBumper() {
		return this.colorOfBumper;
	}
	
	public void setColorOfBumper(String colorOfBumper) {
		this.colorOfBumper = colorOfBumper;
	}
	
	public String getColorOfMugs() {
		return this.colorOfMugs;
	}
	
	public void setColorOfMugs(String colorOfMugs) {
		this.colorOfMugs = colorOfMugs;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Mug's color is ").append(this.colorOfMugs).append("\n");
		sb.append("Hood's color is ").append(this.colorOfHood).append("\n");
		sb.append("Bumper's color is ").append(this.colorOfBumper).append("\n");
		return sb.toString();
	}
}
