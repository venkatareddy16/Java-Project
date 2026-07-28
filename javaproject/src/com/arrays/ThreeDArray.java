package com.arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		//declaration and creation
		int a[][][] = new int[3][2][3];  //[pos][row][col]

		//Initialization of 3-d array
		// 0th pos -> row and columns
		// 0th pos -> 1st row
		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;

		// 0th pos -> 2nd row
		a[0][1][0] = 40;
		a[0][1][1] = 50;
		a[0][1][2] = 60;

		// 1st pos -> row and columns
		// 1st pos -> 1st row
		a[1][0][0] = 10;
		a[1][0][1] = 20;
		a[1][0][2] = 30;

		// 1st pos -> 2nd row
		a[1][1][0] = 40;
		a[1][1][1] = 50;
		a[1][1][2] = 60;
		
		//representation of 3-d array
		for(int i=0;i<a.length;i++) {  //no of pos=a.length
			for(int j=0;j<a[i].length;j++) {  //no of rows=a[i].length->length of each pos.
				for(int k=0;k<a[i][j].length;k++) {  //no of columns=a[i][j].length->len of each row in every pos.
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();	
			}
			System.out.println();			
		}
		
		//for each loop
		for(int[][]ar2:a) {
			for(int[]ar1:ar2) {
				for(int ele:ar1) {
					System.out.print(ele+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
