package com.logicalstatements.forloopst;
import java.util.*;
public class PrimeOrNot {
     boolean isprime(int n) {
    	 if(n==0||n==1) {
    		 return false;
    	 }
    	 for(int i=2;i<n;i++) {
    		 if(n%i==0) {
                return false;
    		 }
    	 }
    	 return true;
     }
     void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();
		if(isprime(n)) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}

	}

}
