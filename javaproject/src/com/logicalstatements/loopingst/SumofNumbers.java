package com.logicalstatements.loopingst;
import java.util.*;
public class SumofNumbers {
    static int findSum(int a,int b) {
    	int sum=0;
    	for(int i=a;i<=b;i++) {
    		sum+=i;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int end=sc.nextInt();
		
		int sum=findSum(st,end);
		System.out.println("The sum of numbers is :"+sum);
	}

}
