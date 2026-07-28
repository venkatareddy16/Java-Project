package com.patterns;

import java.util.Scanner;

public class RectangleStarPattern22 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();//rows
		int m=sc.nextInt();//col
		
		//logic
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
