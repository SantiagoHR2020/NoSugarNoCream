package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		List<Animal> animalList = new ArrayList<>();
		String animalName;
		int animalSpeed = 0;
		int counter = 0;
		Animal storage = new Animal();
		
		
		while(counter != 5)
		{
			Animal temp = new Animal();
			String placeholder;
			System.out.println("Enter an animal name:");
			temp.setName(myScanner.next());
			System.out.println("Enter an animal speed:");
			if(myScanner.hasNextInt())
			{
				temp.setSpeed(myScanner.nextInt());
				animalList.add(temp);
				counter++;
			}
			else
			{
				System.out.println("Please input a valid number");
				placeholder = myScanner.next();
			}
		}
		
		System.out.println("Give us a name to search:");
		animalName = myScanner.next();
		storage = SearchUtil.search(animalName, animalList);
		if(storage != null)
		{
			System.out.println(storage.toString());
		}
		
		myScanner.close();
	}
}
