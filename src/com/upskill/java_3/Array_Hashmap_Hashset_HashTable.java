package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index.
	
		int age = 30;
		int[] ageDrStrange = new int[]{25, 21, 28, 35,18};
		
		
		//Array index				   [0] [1] [2] [3] [4]
		
		
		System.out.println(age);
		System.out.println(ageDrStrange[2]);
		System.out.println(ageDrStrange.length);
		
		
		
		String[] nameDrStrange = new String[]{"Tareq", "Jisan", "Vlad", "Adnan"};
		
		System.out.println(nameDrStrange[3]);
		System.out.println(nameDrStrange.length);
		
		
		
		//Multi-Dimentional Array. Multidimensional arrays are useful when you want to store data 
		//as a tabular form, like a table with rows and columns.
		int[][] ageDrStrange2D = {{25, 21, 30, 35, 28},      //[0][0] [0][1] [0][2] [0][3] [0][4]
								  {31, 32, 25}};             //[1][0] [1][1] [1][2] 
		
		
		System.out.println(ageDrStrange2D[0][4]);
		
		
		
		//Hashmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap <String, Integer>();
		
		
		Student.put("Jisan", 25);
		Student.put("Adnan", 26);
		Student.put("Vlad", 28);
		Student.put("Tareq", 30);
		Student.put("Mahdi", 25);
		Student.put("Ishaq", 25);
		
		
		
		HashMap<String, String> Capital = new HashMap <String, String>();
		
		
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City:" +Capital.get("Bangladesh"));
		
		
		
		//Hashset store unordered collection containing unique value, Implementation of set interface
		
		
		HashSet <String> car = new HashSet <String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Tesla");
		
		System.out.println(car);
		
		
		//HashTable store multiple data using key-value piar, No duplicate,
		//also is synchronized (only one thread can be modified) 
		
		Hashtable<String, String> Region = new Hashtable <String, String>();
		
		Region.put("Bangladesh", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region:" +Region.get("Bangladesh"));
		
		
		
	}

}
