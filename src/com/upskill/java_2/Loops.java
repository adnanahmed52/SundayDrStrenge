package com.upskill.java_2;

public class Loops {
	
	//Loops in Java is a feature used to execute a particular part of the program repeatedly 
	//if a given condition evaluates to be true.
	
	
	/* For loop- in Java iterates a given set of statements multiple times. 
	 * The Java while loop- executes a set of instructions until a boolean condition is met.
	 * The do-while loop- executes a set of statements at least once, even if the condition is not met. 
	 */
	

	public static void main(String[] args) {
	
		
		int i;  //Initialization
		for (i = 1; i <= 100; i = i+2){   //Condition, Increment-Decrement.
			
			System.out.println(i +" I born in Bangladesh");  //Statement/Body
			
		}
		
		int i1=2;  //Initialization
		
		while (i<=100){  //Condition
			System.out.println(i+" I love Bangladesh");   //Body
			i=i+2;  //Increment/Decrement
		}

		
		int i2=2;   //Initialization
		do{        //Statement/Body
			
		System.out.println(i+" Bangladesh");
		i=i+2;   //Increment/Decrement
		} 
		
		while (i<=100);  //Condition
			
		
		
		
	}

}
