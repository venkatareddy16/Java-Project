package com.logicalstatements.conditionalst;

import java.util.*;

public class MarksSwitchReturnOldVersion {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student:");
		int marks1 = sc.nextInt();

		// calculate the grade based on the given marks and return that grade from
		// getGrade(m) method and
		// store it in grade variable.
		String grade = getGrade(marks1);
		System.out.println("Grade of the student based on the given marks is : " + grade);
	}

	static String getGrade(int marks) {
		// we can't assign switch case to variable from java before 11 versions.
		// So,In this we can take grade variable separetly declared and switch case
		// seperatly.
		// String grade;
		switch (marks / 10) {
		case 10:
			// grade="A+";
			// break;
			System.out.println("First Rank");
			return "A+";
		case 9:
			System.out.println("second Rank");
			return "A";
		case 8:
			System.out.println("third Rank");
			return "B";
		case 7:
			System.out.println("fourth Rank");
			return "C";
		case 6:
			System.out.println("Fifth Rank");
			return "D";
		case 4, 5: // we can pass multiple values in case inside switch
			System.out.println("sixth Rank");
			return "Just Passed(E)";
		default:
			System.out.println("last Rank");
			return "F";
		}
		//return null; ->Unreachable code
	}
}
