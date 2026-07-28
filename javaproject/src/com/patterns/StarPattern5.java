package com.patterns;

import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//for spaces are increasing
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			//for stars are decreasing
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
