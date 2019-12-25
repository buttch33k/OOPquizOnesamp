package com.ph.ceu.oop.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ph.ceu.oop.impl.BMW;
import com.ph.ceu.oop.impl.Chevrolet;
import com.ph.ceu.oop.impl.Mazda;
import com.ph.ceu.oop.impl.Subaru;
import com.ph.ceu.oop.impl.Suzuki;
import com.ph.ceu.oop.impl.Toyota;
import com.ph.ceu.oop.impl.Vehicle;
import com.ph.ceu.oop.model.TransactionHistory;
import com.ph.ceu.oop.model.UserDetails;
import com.ph.ceu.oop.model.choices.Buy;
import com.ph.ceu.oop.model.choices.Decorate;
import com.ph.ceu.oop.model.choices.Repair;

public class MainClazz {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		boolean isInvalid = true;
		int count = 0;
		TransactionHistory history = new TransactionHistory();
		
		String a$a;
		String $a;
		String _a;
		String a__;
		String a333;
		String $aaa;
		
		do {
			
			if(count > 0) {
				System.out.println("=========Please input again your details below=========");
			} else {
				System.out.println("=========Please input your details below=========");
			}
			
			try {
				
				UserDetails userDetails = new UserDetails();

				System.out.print("Last Name: ");
				userDetails.setLastName(scan.nextLine());
				
				System.out.print("First Name: ");
				userDetails.setFirstName(scan.nextLine());
				
				System.out.print("Middle Name: ");
				userDetails.setMiddleName(scan.nextLine());
				
				System.out.print("Address: ");
				userDetails.setAddress(scan.nextLine());
				
				System.out.print("Age: ");
				userDetails.setAge(Integer.parseInt(scan.nextLine()));
				
				isInvalid = false;
				history.setUserDetails(userDetails);
			} catch(NumberFormatException ex) {
				isInvalid = true;
			}
			
			count++;
		} while(isInvalid);
		
		boolean isNotValidVehicleBrand = false;
		Vehicle car = null;
		
		do {
			
			System.out.println("Choose what brand of vehicle you prefer: (BMW, Toyota, Suzuki, Subaru, Mazda, Chevrolet)");
			String vehicleBrand = scan.nextLine().toLowerCase();
			isNotValidVehicleBrand = false;
			
			switch(vehicleBrand) {
				case "bmw":
					car = new BMW();
					break;
				case "toyota":
					car = new Toyota();
					break;
				case "suzuki":
					car = new Suzuki();
					break;
				case "subaru":
					car = new Subaru();
					break;
				case "mazda":
					car = new Mazda();
					break;
				case "chevrolet":
					car = new Chevrolet();
					break;
				default:
					System.out.println("Invalid vehicle brand.. please try again");
					isNotValidVehicleBrand = true;
					break;
			}
			
		} while(isNotValidVehicleBrand);
		
		history.setVehicleBrand(car);
		boolean isNotValidChoice = false;
		
		do {
			
			System.out.println("Choose what to do? (buy, repair, decorate)");
			String choice = scan.nextLine().toLowerCase();
			isNotValidChoice = false;
			
			switch(choice) {
				case "buy":
					history.setProcess("buy");
					break;
				case "repair":
					history.setProcess("repair");
					break;
				case "decorate":
					history.setProcess("decorate");
					break;
				default:
					System.out.println("Invalid transaction.. please try again");
					isNotValidChoice = true;
					break;
			}
			
		} while(isNotValidChoice);
		
		System.out.println("What model you want?");
		history.getVehicleBrand().setModel(scan.nextLine().toLowerCase());
		
		Buy buy = new Buy();
		Decorate decorate = new Decorate();
		Repair repair = new Repair();
		
		if(history.getProcess().equals("buy")) {
			
			boolean isNotValidInput = false;
			
			do {
				
				try {
					
					System.out.println("Enter your monthly salary: ");
					buy.setMonthlySalary(Double.valueOf(scan.nextLine()));
					
					System.out.println("Preferred payment (cash or installment):");
					buy.setModeOfPayment(scan.nextLine().toLowerCase());
					
					if(buy.getModeOfPayment().equals("cash") || buy.getModeOfPayment().equals("installment")) {
						isNotValidInput = false;
					} else {
						isNotValidInput = true;
						continue;
					}
					
					System.out.println("Terms of payment (3yrs, 5yrs, 10yrs):");
					buy.setTermsOfPayment(Integer.parseInt(scan.nextLine()));
					
					double defaultPrice = 2_000_000;
					
					if(buy.getModeOfPayment().equals("cash")) {
						double lastPrice = defaultPrice - (defaultPrice * 0.15);
						System.out.println("You need to pay " + lastPrice);
					} else {
						int termOfPaymentInMonths = buy.getTermsOfPayment() * 12;
						double payablePerMonth = defaultPrice / Double.valueOf(termOfPaymentInMonths);
						double lastPricePerMonth = payablePerMonth + (payablePerMonth * 0.05);
						System.out.println("You need to pay " + lastPricePerMonth + " per month within " 
								+ termOfPaymentInMonths + " months");
					}
					
				} catch(NumberFormatException ex) {
					isNotValidInput = true;
				}
				
			} while(isNotValidInput);
		} else if(history.getProcess().equals("decorate")) {
			
			System.out.println("What color do you want for the mugs?");
			decorate.setColorOfMugs(scan.nextLine());
			
			System.out.println("What color do you want for the hood?");
			decorate.setColorOfHood(scan.nextLine());
			
			System.out.println("What color do you want for the bumper?");
			decorate.setColorOfBumper(scan.nextLine());
		} else {
			
			boolean isNotValidInput = false;
			
			do {
				
				System.out.println("Do you want to repair all or not? (Yes/No/Y/N)");
				String ans = scan.nextLine().toLowerCase();
				
				if(ans.equals("yes") || ans.equals("y")) {
					repair.setRepairAll(true);
				}
				
				if(repair.isRepairAll()) {
					break;
				} else {
					
					List<String> parts = new ArrayList<>();
					boolean inputMore = false;
					
					do {
						
						System.out.println("Enter the part you want to be repaired: ");
						parts.add(scan.nextLine());
						
						System.out.println("Do you want to add more parts? (Yes/No/Y/N)");
						String moreParts = scan.nextLine().toLowerCase();
						
						if(moreParts.equals("yes") || moreParts.equals("y")) {
							inputMore = true;
						} else {
							inputMore = false;
						}
						
					} while(inputMore);
					
					repair.setParts(parts);
				}
				
			} while(isNotValidInput);
		}
		
		System.out.println("Do you have a driver's license? (Yes/No/Y/N)");
		String userAnswer = scan.nextLine().toLowerCase();
		
		if(userAnswer.equals("yes") || userAnswer.equals("y")) {
			
			System.out.println(history.getUserDetails());
			history.getVehicleBrand().printBrand();
			history.getVehicleBrand().printModel();
			System.out.println("I selected " + history.getProcess());
			
			if(history.getProcess().equals("buy")) {
				System.out.println(buy);
			} else if(history.getProcess().equals("decorate")) {
				System.out.println(decorate);
			} else {
				System.out.println(repair);
			}
		} else {
			main(args);
		}
		
	}
}
