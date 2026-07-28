package com.arrays;

import java.util.*;

public class MatrixoddandevenRows {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// rows
		int m = sc.nextInt();// columns
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("main logic");
		// loop
//		for (int i = 0; i < a.length; i++) {
//			if (i % 2 == 0) {  //even row
//				for (int j = a[i].length - 1; j >= 0; j--) {
//					System.out.print(a[i][j] + " ");
//				}
//			} else {          //odd row
//				for (int j = 0; j < a[i].length; j++) {
//					System.out.print((int)(Math.pow(a[i][j], 2)) + " ");
//				}
//			}
//			System.out.println();
//		}
		System.out.println("*****************************");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) { // even row
				// reverse the row by swapping
				reverse(a[i]); // here row is consider as array
			} 
			for (int j = 0; j < m; j++) {
				//odd row
				if (i % 2 != 0) {
					a[i][j] = a[i][j] * 2;// assign
				}
				if (i == j) {
					a[i][j] *= a[i][j];
				}
			}
		}
		// printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void reverse(int[] a) {
		int low = 0, high = a.length - 1;
		while (low < high) {
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}

	}

}
