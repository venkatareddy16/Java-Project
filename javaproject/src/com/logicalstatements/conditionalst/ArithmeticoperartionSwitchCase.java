package com.logicalstatements.conditionalst;

import java.util.*;

//WAP to perform Arithmetic operations by using two input numbers and operator symbol(+ or - or * or / or %).
public class ArithmeticoperartionSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		String s1;
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			char ch = sc.next().charAt(0);
			double res = 0.0;
			switch (ch) {
			case '+' -> res = a + b;
			case '-' -> res = a - b;
			case '*' -> res = a * b;
			case '/' -> res = a / b;
			case '%' -> res = a % b;
			default -> System.out.println("Invalid symbol");
			}

			System.out.println("The Resultant value is: " + res);
			System.out.println("Do you want to continue,if want then yes or no");
			s1 = sc.next();
		} while (s1.equalsIgnoreCase("yes"));
		
		System.out.println("Exit the switcase");
		System.out.println("main method ended");

	}

}
