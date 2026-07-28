package com.arrays;

public class ThirdDArrayCurly {

	public static void main(String[] args) {

		int a[][][] = { { { 10, 20, 30 }, { 40 }, { 70, 80, 90 } }, { { 100, 200 }, { 400, 500 } },
				{ { 600, 700 }, { 800, 900 } } };
		// 3pos -> for every pos->oth pos->3 rows
		// 1st pos->2 rows
		// 2nd pos->2 rows

		// representation of 3-d array
		for (int i = 0; i < a.length; i++) { // no of pos=a.length
			for (int j = 0; j < a[i].length; j++) { // no of rows=a[i].length->length of each pos.
				for (int k = 0; k < a[i][j].length; k++) { // no of columns=a[i][j].length->len of each row in every
															// pos.
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
        System.out.println("******************************************");
		// for each loop
		for (int[][] ar2 : a) {
			for (int[] ar1 : ar2) {
				for (int ele : ar1) {
					System.out.print(ele + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
