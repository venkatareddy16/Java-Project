package com.logicalstatements.whileloopst;
import java.util.*;
public class sumofdigits {
    static int sumofDigits(int n) {
    	int sum=0;
    	int rem=0;//If we want work with digits of the given number,we should take rem var.
    	while(n>0) {
    		rem=n%10;//234-> 234%10->4,23%10->3,2%10->2
    		n=n/10;//234-> 234/10->23,23/10->2,2/10->0
    		//left hand sum variable //right hand sum is value of variable.
    		sum=sum+rem; //sum=0+4 -> 4+3 -> 7+2 -> 9(sum)
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method satrted");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();//234
		int digitsum=sumofDigits(n);
		System.out.println("sum of the digits of given number is: "+digitsum);
	}

}
