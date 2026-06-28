package com.logicalstatements.conditionalst;

import java.util.*;

public class WeekdaySwitchNewVersionYeild {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		String desp = getDayInfo(day);
        System.out.println("The main key description of the week day is :"+desp);
	}

	static String getDayInfo(String day) {
		String desp = switch (day) {
		case "monday" -> {
			System.out.println("Monday is Understanding day");
			yield "lazy";
		}
		case "Tuesday,Wednesday" -> {
			System.out.println("Tuesday,Wednesday are active learning days");
			yield "active";
		}
		case "Thursday,Friday" -> {
			System.out.println("Thursday,Friday are pratice days");
			yield "pratice";
		}
		case "Saturday,Sunday" -> {
			System.out.println("Saturday,Sunday are Cricket days");
			yield "cricket";
		}
		default -> {
			System.out.println("Invalid day");
			yield "Invalid";
		}
		};
		return desp;
	}
}
