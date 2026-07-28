package com.logicalstatements.forloopst;
import java.util.*;
public class FactorialNumberRecursion {
    int findFact(int n) {
    	if(n==0||n==1) {
    		return 1;
    	}
    	return n*findFact(n-1);
    }
	void main() {
		System.out.println("main method started");
		System.out.println("Enter the given number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=findFact(n);
		System.out.println("Factorial of the given number is :"+fact);

	}

}
