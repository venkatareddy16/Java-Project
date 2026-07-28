package com.patterns;

import java.util.Scanner;

public class StarHallowTrianglePattern31 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//for spaces are decreasing
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			//for stars are increasing
			for(int j=1;j<=i;j++) {
			   if(j==1||j==i||i==n) {
				System.out.print("* ");
			   }
			   else {
				   System.out.print("  "); //two spaces required
			   }
			}
			System.out.println();
		}
		
		//or
		for(int i=1;i<=n;i++) {
			//for spaces are decreasing
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			//for star print are increasing by 2
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1||i==n) {
				   System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
