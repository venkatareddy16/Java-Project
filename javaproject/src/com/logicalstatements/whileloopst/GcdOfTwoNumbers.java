package com.logicalstatements.whileloopst;
import java.util.*;
public class GcdOfTwoNumbers {
//Normal Method
//    static int gcdMethod(int a,int b) {
//    	int rem=0;
//    	while(b>0) {
//    		rem=a%b;
//    		a=b;
//    		b=rem;
//    	}
//    	return a;
//    }
//Using Recursion
	static int gcdMethod(int a,int b) {
		if(b==0) {
			return a; 
		}
		return gcdMethod(b,a%b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=gcdMethod(a,b);
        System.out.println("The gcd of two numbers is: "+gcd);
	}

}
