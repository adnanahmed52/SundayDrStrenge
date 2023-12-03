package com.upskill.java_1;

public class SwitchStatement {
	
	
	/*The switch case in java executes one statement from multiple ones.
	  Basically, it is used to perform different actions based on different conditions(cases).
	  The break (Optional) keyword is used for the next case execution.
	*/
	
	
	public static void main(String[]args){
		
		int day = 4;		// Outputs "Thursday" (day 4)
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		
		
		
		
		
	}
	
	

}
