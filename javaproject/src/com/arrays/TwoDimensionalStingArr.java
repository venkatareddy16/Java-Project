package com.arrays;

import java.util.Scanner;

public class TwoDimensionalStingArr {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter the size of the 2-d string array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String st[][] = new String[n][m]; // n=st.length and m=st[0].length
		// 1.a[0][0]=1; //one way
		// 2.take input through scanner for this 2-d array -> other way
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				st[i][j] = sc.nextLine();
			}
		}

		// Representation of the 2-d array
		// a.length represents no of rows in the 2-d array
		// a[0].length or a[1].length or a[2].length....a[n].length represents no of
		// columns for each row in 2-d array.
		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < st[i].length; j++) { // here a[0] or a[i] is same
				if(j==st[i].length-1) {
					System.out.print(st[i][j]);
				}
				else {
				   System.out.print(st[i][j] + " || ");
				}
			}
			System.out.println();
			System.out.println("**************************");
		}
		
		System.out.println(st);// [[Ljava.lang.String;@19469ea2 -> address of the 2-d string array variable.

	}

}
