package com.syntax.class10;

public class classTask {
	
	public static void main(String[] args) {
		
		
		char grades[] = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println("grade " + grades[1]);
		
		char grade[] = new char[6];
		
		String[] teamNames = {"german", "pasha", "arthur" , "stephan", "kevin", "johnathan"};
		
		System.out.println("my name " + teamNames[3]);
		
		String[] arrayOfWords = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(arrayOfWords[1] + " " + arrayOfWords[4] + " "
				+ arrayOfWords[0] + " " + arrayOfWords[3] + " " + arrayOfWords[2]);
		
		int sum = 0; 
		int num[] = {1, 2, 3, 4, 5, 6};
		
		for(int i = 0; i < num.length; i++) {
			
			sum+=  num[i];
			
		}
		System.out.println(sum);
		
		
		
	}

}
