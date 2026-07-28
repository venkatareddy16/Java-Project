package com.logicalstatements.forloopst;
import java.util.*;
public class PrintNthPrimeNumber {
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
		System.out.println("Give the range that you want the prime numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the number(n) to get nth prime number between a and b");
		int n=sc.nextInt();
		int count=0;
		//loop
		for(int i=a;i<=b;i++) {
			if(isprime(i)) {
				count++;
				if(count==n) {
					System.out.println(i+" ");
					break;
				}
			}
		}
		System.out.println("*************************************");
	}

}
