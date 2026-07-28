package com.logicalstatements.forloopst;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number you want to print:");
		int n=sc.nextInt();
		System.out.println("Enter number up to which number we want to print");
		int b=sc.nextInt();
		for(int i=1;i<=b;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}

	}

}
