package com.syntax.class06;
import java.util.*;
public class homeWork {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your country");
		String country = scan.nextLine().toLowerCase();
		
		String language;
		
		
		switch (country) {
		
		case "usa":
			language = "English";
			System.out.println("You from " + country + ". Your languare is " + language);
			break;
			
		case "belarus":
			language = "Belarusian";
			System.out.println("You from " + country + ". Your languare is " + language);
			break;
			
		case "poland":
			language = "Polish";
			System.out.println("You from " + country + ". Your languare is " + language);
			break;
		case "germany":
			language = "German";
			System.out.println("You from " + country + ". Your languare is " + language);
			break;
			
		default:
			System.out.println("where is it???");
			break;
		}
		
		
		
		double result;
		System.out.print("Please enter number 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Please enter number 2: ");
		double num2 = scan.nextInt();
		
		System.out.println("Please choose which operation to use: +, -, *, /");
		String operator = scan.next();
		
		switch (operator) {
		
		case "+":
			result = num1 + num2;
			System.out.println("Result of + operation is:" + result);
			break;
		
		case "-":
			result = num1 - num2;
			System.out.println("Result of - operation is:" + result);
			break;
			
		case "*":
			result = num1 * num2;
			System.out.println("Result of * operation is:" + result);
			break;
			
		case "/":
			result = num1 / num2;
			System.out.println("Result of / operation is:" + result);
			break;
			
		
		}
		
	
			
		
		
		
		
	}
	
	
}
