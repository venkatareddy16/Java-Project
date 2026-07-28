package com.logicalstatements.whileloopst;
import java.util.*;
public class ReverseOfNumber {
    static int findRev(int n) {
    	int rev=0;
    	int rem=0;//If we want work with digits of the given number,we should take rem var.
    	while(n>0) {//236
    		rem=n%10;//6,3,2
    		n=n/10;//23,2,0
    		rev=rev*10+rem; //->rev=0*10+6=6,6*10+3=63,63*10+2=632
    	}
    	return rev;
    }
    static boolean ispal(int pal) {
    	int rev=findRev(pal);
    	 System.out.println("Reverse of the number: "+rev);
    	if(pal==rev) {
    		return true;	
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();
		//int reverse=findRev(n);
		boolean pal=ispal(n);
		if(pal) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not a palindrome");
		}
        
	}

}
