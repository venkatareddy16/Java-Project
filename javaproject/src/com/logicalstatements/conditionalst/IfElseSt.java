package com.logicalstatements.conditionalst;
import java.util.Scanner;
//WAP to print whether the number is positive or negative and number is odd or even.
public class IfElseSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//Wether the number is pos or neg
		
		//Here for if there is no {} then second statement is considered as betweeen if and else statement,
		//it produces an error because,for else statement there should be if before only.
		if(a>=0) {
			if(a%2==0) {
				System.out.println("number is pos and even");
			}
			else {
				System.out.println("number is pos and odd");
			}
		}
		else{
			if(a%2==0) {
				System.out.println("number is neg and even");
			}
			else {
				System.out.println("number is neg and odd");
			}
		}
		
		//Wether the number is odd or even
//		if(a%2==0) {
//			System.out.println("number is even");
//		}
//		else {
//			System.out.println("number is odd");
//		}
		
		
		
		System.out.println("main method ended");
		

	}

}
