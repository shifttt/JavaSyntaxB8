package com.syntax.class04;

import java.util.Scanner;

//shortcut to import for windows Ctr+shift+o
//shortcut to import for mac command+shift+o

public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);//enable input to the console
		//i am adding some message to the user
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();//waits for your input and once you provided input --> hit ENTER button
		System.out.println("I captured String value = "+value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);

	}
}
