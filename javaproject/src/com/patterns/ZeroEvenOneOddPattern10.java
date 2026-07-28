package com.patterns;

import java.util.Scanner;

public class ZeroEvenOneOddPattern10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		// logic
		for (int i = 1; i <= n; i++) {
			int x=-1;
			if (i % 2 != 0) { // odd row
				x = 1;
			} else if (i % 2 == 0) { // even row
				x = 0;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				// changing the x value to opposite 1 and 0 for every cell
				if (x == 1) {
					x = 0;
				} else if (x == 0) {
					x = 1;
				}
			}
			System.out.println();
		}

	}

}
