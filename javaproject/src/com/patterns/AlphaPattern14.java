package com.patterns;

import java.util.Scanner;

public class AlphaPattern14 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int x = 65;
		// logic
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)x);
			}
			x++;
			System.out.println();
		}
		// skip one row(top row) because it is overridded with before pattern
		for (int i = 1; i <= n - 1; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print((char)x);
			}
			x++;
			System.out.println();
		}

	}

}
