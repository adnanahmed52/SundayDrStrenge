package com.upskill.java_1;

public class MethodType {
	
	/* A method is a block of code which only runs when it is called. You can pass data, 
	   known as parameters, into a method. Methods are used to perform certain actions, 
	   and they are also known as functions. 
	 */
	
	/* 	Types of Methods
	 
	1.Void Method- empty space, no data returns.
	2.Static Method- You can call it directly any time. No need to create any Object.
	3.Return Type Method- Must be Return some data. 
 */

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + monthlyIncomeReturn());
		
		System.out.println(name());
		
	
	}
	
	static int hourlyIncome = 65;
	
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);	
	}
	
	//static method 
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);	
	}
	
	//return type method
	public static int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	
	public static String name(){
		return "Adnan";
		
		
		
		
		
		
	}
	
	
	
	
	
	
}