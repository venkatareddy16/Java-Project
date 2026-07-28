package com.logicalstatements.forloopst;

import java.util.Scanner;
//prime numbers are:2 3 5 7 11 13 17 ......
public class PrimeNumbers {
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
		System.out.println("main method started");
		System.out.println("How many numbers you want to print:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}

	}

}
