package com.upskill.java_1;

public class IfElseStatements {
	
	/*if (condition1) {
  		// block of code to be executed if condition1 is true
		} else if (condition2) {
  		// block of code to be executed if the condition1 is false and condition2 is true
		} else {
  		// block of code to be executed if the condition1 is false and condition2 is false
		}
	  
	 */
	
	
	
	
	

	public static void main(String[] args) {
		
		int age = 100;
		if (age<13 ){
		System.out.println("You are a Children");
		}
		
		else if (age>13 && age<18){
			System.out.println("You are a Teenager");
		}
		
		else if (age>=60){
			System.out.println("You are a Senior");
			if(age<100){
			}
			else {
				System.out.println("You are a Champion");
			}	
		}
		
		else {
		System.out.println("You are a Adult");	
			
		
		}
		

	}

}
