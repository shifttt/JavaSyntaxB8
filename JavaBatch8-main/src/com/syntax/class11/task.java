package com.syntax.class11;

public class task {
	public static void main (String[] args) {
		
		String[][] titleName = new String[2][4];
		
		titleName[0][0] = "Mr";
		titleName[0][1] = "Mrs";
		titleName[0][2] = "Ms";
		titleName[0][3] = "Miss";
		
		titleName[1][0] = "Smith";
		titleName[1][1] = "Jordan";
		titleName[1][2] = "Jackson";
		titleName[1][3] = "Obama";
				
		System.out.println(titleName[0][1] + " " + titleName[1][0]);
		System.out.println(titleName[0][0] + " " + titleName[1][3]);
		System.out.println(titleName[0][2] + " " + titleName[1][2]);
		System.out.println(titleName[0][3] + " " + titleName[1][1]);

		
		
		
	}
	

}
