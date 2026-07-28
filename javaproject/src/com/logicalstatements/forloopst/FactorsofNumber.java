package com.logicalstatements.forloopst;
import java.util.*;
//Factors means the numbers that are proper divisors of the given number
//input:6
//output:1 2 3 6
//************************************************
//input:12
//output:1 2 3 6 12
public class FactorsofNumber {
    static void findFactors(int n) {
    	for(int i=1;i<=n/2;i++) {
    		if(n%i==0) {
    			System.out.print(i+" ");
    		}
    	}
    	System.out.println(n);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();
		findFactors(n);
        
	}

}
