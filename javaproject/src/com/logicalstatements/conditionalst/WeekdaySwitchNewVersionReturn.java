package com.logicalstatements.conditionalst;

import java.util.Scanner;

public class WeekdaySwitchNewVersionReturn {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		String desp = getDayInfo(day);
        System.out.println("The main key description of the week day is :"+desp);
	}

	static String getDayInfo(String day) {
		switch(day) {
		case "monday" -> {
			System.out.println("Monday is Understanding day");
			return "lazy";
		}
		case "Tuesday,Wednesday" -> {
			System.out.println("Tuesday,Wednesday are active learning days");
			return "active"; // it returns to desp variable that is assigned to switch case
		}
		case "Thursday,Friday" -> {
			System.out.println("Thursday,Friday are pratice days");
			return "pratice";
		}
		case "Saturday,Sunday" -> {
			System.out.println("Saturday,Sunday are Cricket days");
			return "cricket";
		}
		default -> {
			System.out.println("Invalid day");
			return "Invalid";
		}
		}
		//return null; //unreachable code
		

	}

}
