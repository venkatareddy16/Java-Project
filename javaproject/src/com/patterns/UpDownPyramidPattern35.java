package com.patterns;

import java.util.Scanner;

public class UpDownPyramidPattern35 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		//up part as down
		for(int i=1;i<=n;i++) {
			//for spaces are increasing
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			//for star print are decreasing by 2
			for(int j=2*n;j>=2*i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//down part as up
		for(int i=2;i<=n;i++) {
			//for spaces are decreasing
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			//for star print are increasing by 2
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("******************************");
		
		for(int i=1;i<=n;i++) {
			//for spaces are increasing
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			//for stars are decreasing
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			//for spaces are decreasing
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			//for stars are increasing
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
