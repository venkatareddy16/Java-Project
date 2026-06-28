package com.logicalstatements.conditionalst;

import java.util.Scanner;

public class NaukriJobValidationNestedIfst {

	public static void main(String[] args) {

		System.out.println("Welcome To Naukari Platform ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me your name: ");
		String name = sc.nextLine();
		System.out.println("which year are you passed out :");
		int year = sc.nextInt();
		if (year >= 2025 && year < 2027) {
			System.out.println("oke that's fine..continue to next");
			System.out.println("Are you from which Branch:");
			String branch = sc.next();
			if (branch.equals("CSE") || branch.equals("ECE")) {
				System.out.println("oke then, your eligible to apply");

				System.out.println("which programming languages have you know:");
				String lang = sc.next();
				if (lang.equals("Java") || lang.equals("Cpp")) {
					System.out.println("oke then proceed to next steps");

					System.out.println("Have you know any Database:");
					String db = sc.next();
					if (db.equals("Mysql") || db.equals("Oracle") || db.equals("mongodb") || db.equals("couchdb")) {
						System.out.println("ok,proceed to next steps");
						System.out.println("Have you know any frontend technologies:");
						String fr = sc.next();
						if ((fr.equals("html") && fr.equals("css") && fr.equals("bs"))
								|| ((fr.equals("js") && fr.equals("react")))) {
							System.out.println("ok,you are eligible for technical rounds!");
							System.out.println("Have you done any projects related to above skills:");
							sc.nextLine();
							String pr = sc.nextLine();
							if (pr.equals("console based atm working using java")
									|| pr.equals("basic calculator using html and css")) {
								System.out.println("ok,proceed to next steps!");
								System.out.println("Have you done any certifications related to above skills:");
								String cer = sc.nextLine();
								if (cer.equals("Java Programmming-NPtel") || cer.equals("DSA Training Certificate")) {
									System.out.println("ok almost done,proceed to next step!");
									System.out.println("What are your Strengths!");
									String st = sc.nextLine();
									if (st.equals("Consistency") || st.equals("Patience")) {
										System.out.println("ok almost done,proceed to next step!");
										System.out.println("Are you willing to relocate");
										boolean bool = sc.nextBoolean();
										if (bool == true) {
											System.out.println("yeah i'm willing to relocate");
										} else {
											System.out.println("if dont want to relocate we are sorry to hire you");
										}
									} else {
										System.out.println("we are sorry,you dont have expected strengths!");
									}
								} else {
									System.out.println("sorry,you dont have expected certifications!!");
								}
							} else {
								System.out.println("sorry,dont have expected projects");
							}
						} else {
							System.out.println("sorry,dont have expected frontend technologies");
						}
					} else {
						System.out.println("sorry,dont have Knowlegde on expected databases");
					}
				} else {
					System.out.println("sorry,dont have Knowlegde on expected programming languages");
				}
			} else {
				System.out.println("sorry,dont have expected year of pass out");
			}
		} else {
			System.out.println("I'M Sorry.We will try later");
		}
	}

}