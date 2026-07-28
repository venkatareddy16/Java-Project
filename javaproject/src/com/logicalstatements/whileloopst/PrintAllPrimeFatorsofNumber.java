package com.logicalstatements.whileloopst;
import java.util.*;
public class PrintAllPrimeFatorsofNumber {
//	static boolean isPrime(int n) {
//		if(n==0||n==1) {
//			return false;
//		}
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
    static void findAllPrimeFactors(int n) {
    	for(int i=2;i<=Math.sqrt(n);i++) {            // or <=n/2
    		//if(isPrime(i)) {
    			while(n%i==0) {
    				System.out.print(i+" ");
    				n=n/i;
    			}
    		//}
    	}
    	//still n>1,then it is a prime number
    	if(n>1) {
    		System.out.print(n+" ");
    	}
    }
	public static void main(String[] args) {
	     	Scanner sc=new Scanner(System.in);
	     	System.out.println("Main method started");
	     	System.out.println("Enter a number:");
	     	int n=sc.nextInt();
	     	findAllPrimeFactors(n);
	}

}
