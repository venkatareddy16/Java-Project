package com.logicalstatements.forloopst;
import java.util.*;
public class SumOfNNumbersRecursion {
	static int sumofNatural(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return n+sumofNatural(n-1);
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(sumofNatural(n));
	}

}
