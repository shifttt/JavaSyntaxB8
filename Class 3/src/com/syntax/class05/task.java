package com.syntax.class05;
import java.util.Scanner;

public class task {
	public static void main(String[] args) {
		Scanner scanerok = new Scanner(System.in);

		System.out.println("enter number of years worked");
		int years = scanerok.nextInt();
		System.out.println("annual salary");
		int salary = scanerok.nextInt();

		if (years >= 5) {
			System.out.println("eligible for bonus");
			if (salary > 50000) {
				System.out.println("bonus 5000");
			} else {
				System.out.println("bonus 3000");
			}
		} else {
			System.out.println("work more");
		}
		
		
		

	}

}
