package com.logicalstatements.whileloopst;

import java.util.Scanner;

public class MaxDigit {
	static int maxDigit(int n) {
    	int max=Integer.MIN_VALUE;
    	int rem=0;
    	while(n>0) {
    		rem=n%10;
    		if(max<rem) {
    			max=rem;
    		}
    		n=n/10;
    	}
    	return max;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		 int maxd=maxDigit(n);
		 System.out.println(maxd);
	}

}
