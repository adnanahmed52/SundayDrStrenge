package com.upskill.assignment_1;

public class Assignment_1_4 {
	
	/* A function returns 30, another function returns 50. 
	 * Write a java program which will display subtraction value from bigger 
	 * number to smaller.
	 */
	
	public static int InputReturn30(){
		
		return 30;
		
	}
	
	public static int InputReturn50(){
		
		return 50;
		
	}
	
	public static void main(String[] args) {
		
		
		
		int result = InputReturn50()-InputReturn30();
		
		System.out.println("The subtractionn value from bigger to smallar is:" +result );
		
		
		
		
		
		
		
		
		
	}

}
