package com.patterns;

import java.util.Scanner;

public class AlphaPattern12 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int x=65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)x+" ");
			}
			x++;
			System.out.println();
		}
		

	}

}
