package com.logicalstatements.forloopst;
import java.util.*;
//perfect number 
//It means given number is equals to sum of proper divisors(factors) of that number,excluding the given number from sum of factors.
//Check whether the given number is perfect or not
//input:6
//output:sum=(1+2+3)->6==6 -> true
//input:12
//output:sum=(1+2+3+4+6)->16!=12 -> false
//input:10
//output:sum=(1+2+5)->8!=10 -> false
//input:28
//output:sum=(1+2+4+7+14)->28==28 -> true
public class PerfectNumber {
	  static boolean findFactors(int n) {
		   //boolean flag=false;
		    int sum=0;
	    	for(int i=1;i<=n/2;i++) {
	    		if(n%i==0) {
	    			sum+=i;
	    		}
	    	}
	    	if(sum==n) {
	    		return true;
	    	}
	    	return false;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();
		boolean flag=findFactors(n);
	    if(flag) {
	    	System.out.println("given number is perfect number");
	    }
	    else {
	    	System.out.println("given number is not perfect number");	
	    }
		System.out.println("end");

	}

}
