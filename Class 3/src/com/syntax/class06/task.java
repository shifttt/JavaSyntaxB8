package com.syntax.class06;
import java.util.Scanner;


public class task {
	
	
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
//	        System.out.println("Please enter a day number");
//	        int day = scan.nextInt();
//	        String myDay;
//	        if (day == 1) {
//	            myDay = "Monday";
//	        } else if (day == 2) {
//	            myDay = "Tuesday";
//	        } else if (day == 3) {
//	            myDay = "Wednesday";
//	        } else if (day == 4) {
//	            myDay = "Thursday";
//	        } else if (day == 5) {
//	            myDay = "Friday";
//	        } else if (day == 6) {
//	            myDay = "Saturday";
//	        } else if (day == 7) {
//	            myDay = "Sunday";
//	        } else {
//	            myDay = "Invalid Day";
//	        }
//	        
//	        
//	        System.out.println("Today is "+myDay);
//	        
//	        System.out.println("---- SAME EXAMPLE USING SWITCH CASE ----");
//	        String today;
//	        switch (day) {// datatype of variable must match with datatype of cases
//	        case 1:
//	            today = "Monday";
//	            break;
//	        case 2:
//	            today = "Tuesday";
//	            break;
//	        case 3:
//	            today = "Wednesday";
//	            break;
//	        case 4:
//	            today = "Thursday";
//	            break;
//	        case 5:
//	            today = "Friday";
//	            break;
//	        case 6:
//	            today = "Saturday";
//	            break;
//	        case 7:
//	            today = "Sunday";
//	            break;
//	        default:
//	            today = "Invalid Day";
//	            break;
//	        }
//	        System.out.println("Today is "+today);
	        
	        
	        
	        /*Allow user to enter grade and then provide explanation:
	         *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
	         *  Not Acceptable. At the end your program should print which grade
	         *   was entered by a user with explanation.
	         */
	        
	        System.out.println("please enter the grade");
	        char grade = scan.nextLine().toUpperCase().charAt(0);
	        
	        
	        String score;
	        
	        
	        switch (grade) {
	        
	        case 'A':
	        	System.out.println("Excellent");
	        	score = "exellent";
	        	break;
	        case 'B':	
	        	System.out.println("Good");
	        	score = "good";
	        	break;
	        case 'C':
	        	System.out.println("Average");
	        	score = "average";
	        	break;
	        case 'D':
	        	System.out.println("Bad");
	        	score = "bad";
	        	break;
	        default:
	        	System.out.println("Not Acceptable");
	        	score ="nothing entered or wrong entry";
	        	break;
	       
	
	        }
	        System.out.println("Grade " + grade + " was entered " + "("+ score +")" );
	        
	        
	        
	        
	    }
	}

