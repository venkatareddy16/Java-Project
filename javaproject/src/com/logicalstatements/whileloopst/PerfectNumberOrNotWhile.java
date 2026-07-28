package com.logicalstatements.whileloopst;
import java.util.*;
public class PerfectNumberOrNotWhile {
    static boolean isperfect(int n) {
    	int sum=0;
//    	for(int i=1;i<=n/2;i++) {  //up to half of number(after that we get directly given number) 
//    	  if(n%i==0) {
//    		sum+=i;
//    	  }
//    	}
    	int i=1;
    	while(i<=(n/2)) {  //up to half of number(after that we get directly given number,we should exclude the given number)
    		if(n%i==0) {
    			sum+=i;
    		}
    		i++;
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
		if(isperfect(n)) {
			System.out.println("Given number is perfect number");
		}
		else {
			System.out.println("Given number is not perfect number");
		}
      
	}

}
