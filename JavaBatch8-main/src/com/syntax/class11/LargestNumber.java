package com.syntax.class11;

public class LargestNumber {
	public static void main (String[] args) {
		
	
		int[] array = {10, 0, 20, 8, -1,77, 56};
		
		int largest = array[0];
//		System.out.println(array.length);
		
		for (int i = 1; i< array.length; i++) {
			
			if (array[i]>largest) {
				largest = array[i];
			}
			
			
			}
		
		System.out.println("largest number: " + largest);
		
		}
	}
	


