package com.logicalstatements.whileloopst;
import java.util.*;
public class CountofDigits {
    static int countofDigits(int n) {
        	int sum=0;
        	int count=0;
        	int rem=0;//If we want work with digits of the given number,we should take rem var.
        	while(n>0) {
        		rem=n%10;//234-> 234%10->4,23%10->3,2%10->2
        		n=n/10;//234-> 234/10->23,23/10->2,2/10->0
        		//left hand sum variable //right hand sum is value of variable.
        		sum=sum+rem; //sum=0+4 -> 4+3 -> 7+2 -> 9(sum)
        		count++; //no of digits in given number
        	}
        	System.out.println("sum of digits is :"+sum);
        	return count;
    }
	public static void main(String[] args) {
		System.out.println("main method satrted");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();//234
		int digitcount=countofDigits(n);
		System.out.println("count of the digits of given number is: "+digitcount);
	}

}
