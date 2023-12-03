package com.upskill.assignment_2;

import java.util.Scanner;

public class Assignment_2_10 {

	public static void main(String[] args) {
		
		
		// Write a Java program to convert temperature from Fahrenheit to Celcius degree. 
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();

        double celsius = FahrenheitToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius + " °C");
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    
    }
		
		
		
	}


