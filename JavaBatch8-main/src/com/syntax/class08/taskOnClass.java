package com.syntax.class08;
import java.util.Scanner;

public class taskOnClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		System.out.println("enter start point");
//		int startPoint = scan.nextInt();
//
//		System.out.println("enter end point");
//		int endPoint = scan.nextInt();
//
//		int oddNumSum = 0;
//		int evenNumSum = 0;
//
//		for (int i = startPoint; i <= endPoint; i++) {
//
//			if (i % 2 == 0) {
//				evenNumSum += i;
//			} else if (i % 2 == 1) {
//				oddNumSum += i;
//			}
//		}
//		System.out.println(evenNumSum);
//		System.out.println(oddNumSum);
		
		int itemPrice = 100;
		int payment = 0;

		

		for (int i = 0; i <= itemPrice; i++) {
			
			System.out.println("please enter the item that you want to buy: ");
			String item = scan.nextLine();

			System.out.println("here is the payment");
			payment = scan.nextInt();
			
			if (payment < itemPrice) { 
				System.out.println("payment received: " + payment);
				
				int change = itemPrice - payment;
				System.out.println("entered payment is not enough,"
						+ " have to pay additional: " + change);
				
				} else if (payment == itemPrice) {
				System.out.println("payment went though");
				System.out.println("Thank you for shopping");
				
				} else if (payment > itemPrice) {
				 int change = payment - itemPrice;
				 
				System.out.println("here is your change " + change);
				System.out.println("Thank you for shopping");
			}
			
		}
	}
		
		
		
}


