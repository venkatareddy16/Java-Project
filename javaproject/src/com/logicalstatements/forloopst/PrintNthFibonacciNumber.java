package com.logicalstatements.forloopst;
import java.util.*;
public class PrintNthFibonacciNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		if(n==1) {
			System.out.println(a);
		}
		else if(n==2) {
			System.out.println(b);
		}
		else {
			int c=0;
			for(int i=1;i<=(n-2);i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
		
		
	}

}
