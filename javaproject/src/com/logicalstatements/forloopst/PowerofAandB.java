package com.logicalstatements.forloopst;
import java.util.*;
public class PowerofAandB {
	//normal function
//    static int findPow(int a,int b) {
//    	int p=1;
//    	for(int i=1;i<=b;i++) {
//    		p=p*a;
//    	}
//    	return p;
//    }
	//using recursion 
	static int findPow(int a,int b) {
		if(b==0) {
			return 1;
		}
		if(b==1) {
			return a;
		}
		return a*findPow(a,b-1);
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int power=findPow(a,b);
        System.out.println("The power of a and b is: "+power);
	}

}
