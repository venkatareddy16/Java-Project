package com.arrays;

import java.util.Scanner;

public class PrintSubDiagUpLeft1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the size of the column:");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("************UP Left part including secondary diagonal(main)***************");
		//main logic
		//1.up part including secondary diagonal(Main diagonal)
		//here we have n sub lines
		for(int k=0;k<n;k++) {   //n lines
			int i=0;//every row i starts with 0.
			int j=k;//every row j starts increasing from 0 to n-1 -> k -> (row by row)
			System.out.println("Sub Diagonal of "+(k+1)+" from top left is:");
			while(i<=k&&j>=0) {
				System.out.print(a[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}
		System.out.println("************Bottom Right part(remaining part after secondary)***************");
		//2.down part excluding the secondary diagonal(main diagonal)
		//here we have n-1 sub lines
		for(int k=0;k<n-1;k++) { //  n-1 lines remaining
			int j=n-1;//every row j starts with n-1.
			int i=k+1;//every row i starts increasing from 1 to 3 -> k+1 ->  (row by row)
			System.out.println("Sub Diagonal of "+(n+k+1)+" from top left is:");
			while(i<=n-1&&j>k) {
				System.out.print(a[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();	
		}
		System.out.println("*************************************************");
		
	}

}
