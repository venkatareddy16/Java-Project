package com.logicalstatements.conditionalst;
import java.util.*;
public class MarksSwitchReturnNewVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the student:");
		int marks1=sc.nextInt();
		
		//calculate the grade based on the given marks and return that grade from getGrade(m) method and 
		//store it in grade variable.
		String grade=getGrade(marks1);
		System.out.println("Grade of the student based on the given marks is : "+grade);
	}

	static String getGrade(int marks) {
		//we can assign switch case to variable from java 11 version and we can return that variable.
		String grade=switch(marks/10) {
		case 10 -> "A+";
		case 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		case 4,5 -> "Just Passed(E)";    //we can pass multiple values in case inside switch
		default -> "F";
		};
		return grade;
	}

}
