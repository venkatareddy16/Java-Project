package com.logicalstatements.forloopst;
import java.util.*;
public class SumOfFionacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Sum of fibonacci sereis up to given number");
		int n=sc.nextInt();
		int a=0,b=1;
		if(n==1) {
			System.out.println(a);  //if n==1 then sum=0->a
		}
		else if(n==2) {
			System.out.println(b);  //if n==2 then sum=0+1->1->b
		}
		else {
			int sum=a+b;
			for(int i=1;i<=(n-2);i++) {
				int c=a+b;
				sum+=c;
				a=b;
				b=c;
			}
			System.out.println(sum);
		}
	}

}
