package com.logicalstatements.conditionalst;

import java.util.*;

public class SuperMarketNestedSwitchCase {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Super market");
		Scanner sc = new Scanner(System.in);
		String y1; // for giving the items again in veg menu option.
		String y2; // for giving the items again in fruit menu option.
		String y; // for giving the menu option again to choose the veg or fruit,
		do {
			System.out.println("Choose the given menu:");
			String cag = sc.next(); // menu->veg option,fruit option
			switch (cag) {
			case "veg" -> {
				do {
					System.out.println("Enter the item value:");
					String s1 = sc.next();
					double res = 0.0;
					switch (s1) {
					case "tmt" -> {
						System.out.println("Item is Tomato and price is 60 per kg");
						res = 60 * 2; // IF we want 2kgs tomatoes
					}
					case "ptt" -> {
						System.out.println("Item is Potato and price is 50 per kg");
						res = 50 * 1; // IF we want 1kg potatoes
					}
					case "ladyfing" -> {
						System.out.println("Item is ladyfinger and price is 30 per kg");
						res = 30 * 1; // IF we want 1kg lady finger
					}
					case "carrot" -> {
						System.out.println("Item is carrot and price is 40 per kg");
						res = 40 * 2; // IF we want 2kg carrot
					}
					default -> System.out.println("Invalid Item in the veg menu option");
					}
					System.out.println("The Resultant price in the veg menu option :" + res);
					System.out.println("Do you want to continue !!");
					y1 = sc.next();
				} while (y1.equalsIgnoreCase("yes"));
			}
			case "fruit" -> {
				do {
					System.out.println("Enter the item value:");
					String s2 = sc.next();
					double res1 = 0.0;
					switch (s2) {
					case "man" -> {
						System.out.println("Item is mango and price is 60 per kg");
						res1 = 60 * 2; // IF we want 2kgs tomatoes
					}
					case "bana" -> {
						System.out.println("Item is banana and price is 30 per kg");
						res1 = 30 * 2; // IF we want 1kg potatoes
					}
					case "apple" -> {
						System.out.println("Item is apple and price is 30 per kg");
						res1 = 30 * 2; // IF we want 1kg lady finger
					}
					case "sapota" -> {
						System.out.println("Item is sapota and price is 40 per kg");
						res1 = 40 * 1; // IF we want 2kg carrot
					}
					default -> System.out.println("Invalid Item in the fruit menu option");
					}
					System.out.println("The Resultant price in the fruit menu option :" + res1);
					System.out.println("Do you want to continue !!");
					y2 = sc.next();
				} while (y2.equalsIgnoreCase("yes"));

			}
			default -> System.out.println("Invalid menu option");
			}
			System.out.println("Do you want to enter the menu option again!");
			y = sc.next();
		} while (y.equalsIgnoreCase("yes"));
		System.out.println("Exit");
	}
}
