package com.logicalstatements.whileloopst;
import java.util.*;
//Strong Number or peterson number :It is a Number where sum of factorial of its digits is equal to original number.
public class StrongNumberWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a given number:");
		int n=sc.nextInt();
		boolean strong=strongNum(n);
		if(strong){
			System.out.println("Given Number is strong number");
		}
		else {
			System.out.println("Given Number is not strong number");	
		}
	}

    static boolean strongNum(int n) {
    	int temp=n;
    	int rem=0;
    	int sumfactdigit=0;
    	if(n==0) {
    		int find=findfact(n); //1
    		if(find!=n) {
    			return false;
    		}
    	}
    	while(n>0) {
    		rem=n%10;
    		int fact=findfact(rem);
    		sumfactdigit=sumfactdigit+fact;
    		n=n/10;
    	}
    	if(temp==sumfactdigit) {
    		return true;
    	}
		return false;
	}

	static int findfact(int n) {
		int fact=1;  //for n==0 -> fact=1
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
