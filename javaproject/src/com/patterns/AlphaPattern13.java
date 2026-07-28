package com.patterns;

import java.util.Scanner;

public class AlphaPattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print((char) x + " ");
				x++;
			}
			System.out.println();
		}

	}

}
