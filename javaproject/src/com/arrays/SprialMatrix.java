package com.arrays;

import java.util.Scanner;

public class SprialMatrix {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of rows:");
		int n = sc.nextInt();
		System.out.println("Enter the size of the column:");
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		spiralMatrix(a);
	}

	static void spiralMatrix(int[][] a) {
		int n = a.length; // rows
		int m = a[0].length;// columns
		int tl = 0, br = n - 1; // tl,br->i->0,n-1
		int bl = 0, tr = m - 1; // bl,tr->j->0,m-1
		// loop
		while (tl <= br && bl <= tr) {
			// horizontal up most row
			for (int j = bl; j <= tr; j++) {
				System.out.print(a[tl][j] + " "); // tl=0
			}
			// move to next row
			tl = tl + 1;
			// vertical right most column
			for (int i = tl; i <= br; i++) {
				System.out.print(a[i][tr] + " "); // tr=m-1
			}
			// move to prev col only if vertical right most column is there,tl<=br is satisfied
			if (tl <= br) {
				tr = tr - 1;
			}
			else {   //then spiral elements are completed.
				break;
			}
			// horizontal bottom most row
			for (int j = tr; j >= bl; j--) {
				System.out.print(a[br][j] + " "); // br=n-1
			}
			// move to prev row
			br = br - 1;
			// vertical left most column
			for (int i = br; i >= tl; i--) {
				System.out.print(a[i][bl] + " "); // bl=0
			}
			// move to next col
			bl = bl + 1;
			System.out.println();
			System.out.println("*****************************");
		}
	}
}
