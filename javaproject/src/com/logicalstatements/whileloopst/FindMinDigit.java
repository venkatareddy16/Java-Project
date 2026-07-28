package com.logicalstatements.whileloopst;
import java.util.*;
public class FindMinDigit {
    static int minDigit(int n) {
    	int min=Integer.MAX_VALUE;
    	int rem=0;
    	while(n>0) {
    		rem=n%10;
    		if(min>rem) {
    			min=rem;
    		}
    		n=n/10;
    	}
    	return min;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		 int mind=minDigit(n);
		 System.out.println(mind);
	}

}
