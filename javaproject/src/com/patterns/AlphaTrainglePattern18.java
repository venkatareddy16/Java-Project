package com.patterns;

import java.util.Scanner;

public class AlphaTrainglePattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}

}
