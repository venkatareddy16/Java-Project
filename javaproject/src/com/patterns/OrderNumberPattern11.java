package com.patterns;

import java.util.Scanner;

public class OrderNumberPattern11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		//logic
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
