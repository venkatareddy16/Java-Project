package com.patterns;

import java.util.Scanner;

public class StarDownPyramidPattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//for spaces are increasing
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			//for star print are decreasing by 2
			for(int j=2*n;j>=2*i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
