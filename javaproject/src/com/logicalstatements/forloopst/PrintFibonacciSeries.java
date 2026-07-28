package com.logicalstatements.forloopst;
import java.util.*;
public class PrintFibonacciSeries {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("How many numbers you want to print:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		
		for(int i=1;i<=(n-2);i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		

	}

}
