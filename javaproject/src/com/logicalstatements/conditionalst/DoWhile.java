package com.logicalstatements.conditionalst;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		char ch1;
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
			System.out.println("Do you want to continue,if want then y or n");
			ch1 = sc.next().charAt(0);
		} while (ch1 == 'Y' || ch1 == 'y');

		System.out.println("Exit the switcase");
		System.out.println("main method ended");
	}

}
