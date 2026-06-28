package com.logicalstatements.conditionalst;
import java.util.*;
public class AgeValidationElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age<=0) {
			System.out.println("Invalid Age");
		}
		else if(age>60) {
			System.out.println("senoir citizens or old people");
		}
		else if(age>35) {
			System.out.println("middle age people");
		}
		else if(age>19) {
			System.out.println("Young People");
		}
		else if(age>12&&age<=19) {
			System.out.println("Teen Age people");
		}
		else if(age>5&&age<=12) {
			System.out.println("childrens");
		}
		else if(age>0&&age<=5) {
			System.out.println("kids");
		}
	}

}
