package com.syntax.class04;

public class task {
	public static void main (String args[]) {
		//first task
		
				int mounth = 10;
				if (mounth == 1) {
					System.out.println("January");
				}else if (mounth == 2) {
					System.out.println("February");
				}else if (mounth == 3) {
					System.out.println("March");
				}else if (mounth == 4) {
					System.out.println("April");
				}else if (mounth == 5) {
					System.out.println("May");
				}else if (mounth == 6) {
					System.out.println("June");
				}else if (mounth == 7) {
					System.out.println("July");
				}else if (mounth == 8) {
					System.out.println("August");
				}else if (mounth == 9) {
					System.out.println("September");
				}else if (mounth == 10) {
					System.out.println("Oktober");
				}else if (mounth == 11) {
					System.out.println("November");
				}else if (mounth == 12) {
					System.out.println("December");
				}else {
						System.out.println("Wrong number entered");
				}
				
				//second task
				
				int numb = -5;
				
				if (numb > 0){
					System.out.println("Number is positive");
				} else {
					System.out.println("Number is negative");
				}
				
				//third task
				int num = 5;
				int d = num % 2;
				
				if (d == 0) {
					System.out.println("The number is even");
				} else {
					System.out.println("The number is odd");
				}
				
				System.out.println("***************************************");
				//task 4 
				
				boolean diplomaStatus = true;
				double gpa = 3.7;
				if (diplomaStatus) {
					System.out.println("congrats!");
					if (gpa >= 3.5) {
						System.out.println("eligible for sholarship");
						
					}else {
						System.out.println("you should have studied harder");
				}
					
					}else {
						System.out.println("you should get a degree");
				} 
				
				//task 5
				
				double mortgageRate = 3.5;
				int mortgagePrice = 150000;
				
				if (mortgageRate > 4.5) {
					System.out.println("scam");
				} else {
					System.out.println("good deal");
					if (mortgagePrice > 200000) {
						System.out.println("take a loan and get the house");
					}else {
						System.out.println("pay cash");
					}
						
				}
			}
			
	}


