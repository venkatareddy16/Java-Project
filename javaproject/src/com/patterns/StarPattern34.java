package com.patterns;

import java.util.Scanner;

public class StarPattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//for spaces are decreasing
			for(int k=2*n;k>2*i;k--) {
				System.out.print(" ");
			}
			//for stars are increasing
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			//for spaces are increasing
			for(int k=1;k<=2*i;k++) {
				System.out.print(" ");
			}
			//for stars are decreasing
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
