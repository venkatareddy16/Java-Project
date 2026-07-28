package com.patterns;

import java.util.Scanner;

public class AlphaDiamondPattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		//up part
		int x=65;
		for(int i=1;i<=n;i++) {
			//for spaces are decreasing
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			//for star print are increasing by 2
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)x);
			}
			x++;
			System.out.println();
		}
		//down part
		for(int i=1;i<=n-1;i++) {
			//for spaces are increasing
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			//for star print are decreasing by 2
			for(int j=2*(n-1);j>=2*i;j--) {
				System.out.print((char)x);
			}
			x++;
			System.out.println();
		}

	}

}
