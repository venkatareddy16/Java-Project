package com.logicalstatements.whileloopst;
import java.util.*;
//note=lcm of a and b is (a*b/gcd(a,b))
public class LcmOfTwoNumbers {
    static int lcmMethod(int a,int b) {
    	int max=(a>b)?a:b;
    	while(true) {
    		if(max%a==0&&max%b==0) {
    			return max;
    		}
    		max++;
    	}
    }
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the two numbers a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=lcmMethod(a,b);    
        System.out.println("The lcm of two numbers is: "+lcm);

	}

}
