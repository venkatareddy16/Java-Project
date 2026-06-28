package com.operators;
//Ternery Operators
//We use this operator for two or three variables or values comparision for reducing the lines of code and then for more values comparision we use (conditional statements)if else statements.
public class TerneryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		int a=10;
		int b=20;
		int c=40;
	
		//To find the max of two numbers
		int max=(a>b)?a:b;
		System.out.println("max of a and b is :"+max);
		
		//To find the max of three numbers
		int m=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max of a and b and c :"+m);

	}

}
