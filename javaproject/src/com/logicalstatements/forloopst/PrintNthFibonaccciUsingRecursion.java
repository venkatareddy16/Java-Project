package com.logicalstatements.forloopst;
import java.util.*;
public class PrintNthFibonaccciUsingRecursion {
	static int nthfibnacci(int n) {
		if(n==0||n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return nthfibnacci(n-1)+nthfibnacci(n-2);
	}
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("main method started");
         System.out.println("Enter the number:");
         int n=sc.nextInt();
         int nth=nthfibnacci(n);
         System.out.println("The nth fibnacci number is :"+nth);

	}

}
