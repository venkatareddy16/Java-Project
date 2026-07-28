package com.patterns;

import java.util.Scanner;

public class OrderedNumberPattern32 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int m=sc.nextInt();

		// logic
		int count = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= m; j++) {
					System.out.print(count + " ");
					count++;
				}
				count=count+m-1;
			}
			else if(i%2==0){
				for (int j = 1; j <= m; j++) {
					System.out.print(count + " ");
					count--;
				}
				count=count+m+1;
			}
			System.out.println();
		}
	}

}
