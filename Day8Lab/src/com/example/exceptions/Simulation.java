package com.example.exceptions;

import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) {
		getInput();
	}
	
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in a number and press enter...");
		String line = in.nextLine();
		System.out.println("you have typed in " + line);
		
		if (isEven(line)) {
			try {
				throw new EvenNumberException();
			} catch (EvenNumberException e){
				e.printStackTrace();
			} finally {
				in.close();
			}
		}
		
		in.close();
	}
	
	public static boolean isEven(String num) {
		int value = Integer.parseInt(num);
		return (value % 2 == 0);
	}
}
