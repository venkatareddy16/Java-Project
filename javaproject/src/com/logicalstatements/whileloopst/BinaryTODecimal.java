package com.logicalstatements.whileloopst;
import java.util.*;
public class BinaryTODecimal {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int res=binaryTODecimal(n);
		System.out.println(res);
	}

	static int binaryTODecimal(int n) {
		//convert int to string
		String s=Integer.toString(n);
		int num=s.length();
		int sum=0;//we want decimal number
		for(int i=num-1;i<=0;i++) {
		    int pos=(num-1)-i;
			if(s.charAt(i)=='1') {
				sum=(int) (sum+(Math.pow(2,pos)));
			}
		}
		return sum;
	}

}
