package com.syntax.class05;
import java.util.Scanner;

public class tasktwo {
	
	public static void main (String[] args) {
		
		
		Scanner in = new Scanner(System.in);

//		System.out.println("enter height");
//		int height = in.nextInt();
//
//		if (height > 0 && height < 60) {
//			System.out.println("short");
//		} else if (height >= 60 && height <= 72) {
//			System.out.println("medium");
//		} else if (height > 72) {
//			System.out.println("tall");
//		}
//		
//		
//
//		System.out.println("please enter the number");
//		int day = in.nextInt();
//
//		if (day >= 1 && day <= 5) {
//			System.out.println("weekday");
//		} else if (day >= 6 && day <= 7) {
//			System.out.println("it is a weekend");
//		} else {
//			System.out.println("invalid entry");
//		}
//		
		System.out.println("enter grades 3x quiz, mid term, final:  ");
		int quiz = in.nextInt();
		int midTerm = in.nextInt();
		int fin = in.nextInt();
		
		double average = (quiz + midTerm + fin) / 3;
		
		
		if (average >= 90) {
			System.out.println("grade A");
		}else if (average >=70 && average < 90) {
			System.out.println("grade B");
		}else if (average >=50 && average < 70) {
			System.out.println("grade C");
		}else if (average < 50) {
	
		System.out.println("grade F");
		
		
			System.out.println("enter birth month");
 
		String month = in.nextLine();
		
		
		if (month == "january" || month == "february" || month == "december" ) {
			System.out.println("you was born in winter");
	//	}else if (month.equalsIgnoreCase("") == "march" || month == "april" || month == "may" ) {
			System.out.println("you was born in sprint");
		}else if (month == "june" || month == "july" || month == "august" ) {
			System.out.println("you was born in summer");
		}else if (month == "september" || month == "october" || month == "november" ) {
			System.out.println("you was born in autumn");
		}else {
			System.out.println("wrong entry");
		}
		
		
		
	}
	

}
}
