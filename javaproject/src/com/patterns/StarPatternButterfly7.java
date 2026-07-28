package com.patterns;

import java.util.*;

public class StarPatternButterfly7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// logic
		// upper part
		for (int i = 1; i <= n; i++) {
			// left stars are increasing
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// spaces are decreasing for left stars and right stars
			for (int k = 2*n; k > 2*i; k--) {
				System.out.print(" ");
			}
			// spaces are decreasing for right stars
//			for (int k = n; k > i; k--) {
//				System.out.print(" ");
//			}
			// right stars are increasing
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// lower part
		for (int i = 1; i <= n - 1; i++) {
			// left stars are decreasing
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			// spaces are increasing for left stars and right stars
			for (int k = 1; k <= 2*i; k++) {
				System.out.print(" ");
			}
			// spaces are increasing for right stars
//			for (int k = 1; k <= i; k++) {
//				System.out.print(" ");
//			}
			// right stars are decreasing
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
