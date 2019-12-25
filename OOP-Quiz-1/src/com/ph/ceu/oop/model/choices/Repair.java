package com.ph.ceu.oop.model.choices;

import java.util.List;

public class Repair {
	
	private boolean isRepairAll;
	private List<String> parts;
	
	public Repair() {}
	
	public Repair(boolean isRepairAll, List<String> parts) {
		this.isRepairAll = isRepairAll;
		this.parts = parts;
	}

	public boolean isRepairAll() {
		return this.isRepairAll;
	}

	public void setRepairAll(boolean isRepairAll) {
		this.isRepairAll = isRepairAll;
	}

	public List<String> getParts() {
		return this.parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		if(this.isRepairAll) {
			sb.append("User wants to repair all parts..").append("\n");
		} else {
			for(String part : this.parts) {
				sb.append("User wants to repair ").append(part).append("\n");
			}
		}
		
		return sb.toString();
	}
}
