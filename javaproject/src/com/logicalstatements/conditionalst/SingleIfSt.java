package com.logicalstatements.conditionalst;
import java.util.*;
//WAP to check wether the person is eligible for vote or not
public class SingleIfSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		//for if statement,there is no {} then only first statement is considered in the if block to execute,
		//if the condition is true in the if block.
		//Remaining statements are always executes when the program runs and then they are internally consider as outside the if block. 
		if(a>=18) 
			System.out.println("welcome to world");
			System.out.println("you are eligible for vote");
		
		
	    System.out.println("main method ended");
	}

}
