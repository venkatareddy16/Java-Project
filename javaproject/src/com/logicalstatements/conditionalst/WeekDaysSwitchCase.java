package com.logicalstatements.conditionalst;

import java.util.*;

//WAP to print week days based on the numbers given
public class WeekDaysSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Invalid week day");
		}

	}

}
