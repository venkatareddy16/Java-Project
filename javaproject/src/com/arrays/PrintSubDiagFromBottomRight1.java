package com.arrays;

import java.util.Scanner;

public class PrintSubDiagFromBottomRight1 {

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
		
		System.out.println("************bottom right part***************");
		//main logic
		//1.down part including secondary diagonal(Main diagonal)
		//here we have n sub lines
		for(int k=0;k<n;k++) {   //n lines
			int j=n-1;//every row j starts with n-1.
			int i=n-1-k;//every row i starts decreasing from n-1 to 0 (row by row)
			System.out.println("Sub Diagonal of "+(k+1)+" from bottom right is:");
			while(i<=n-1&&j>=n-1-k) {
				System.out.print(a[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();
		}
		System.out.println("************top left part***************");
		//2.up part excluding the secondary diagonal(main diagonal)
		//here we have n-1 sub lines
		for(int k=0;k<n-1;k++) { //  n-1 lines remaining
			int i=0;//every row i starts with 0.
			int j=n-2-k;//every row j starts decreasing from n-2 to 0 (row by row)
			System.out.println("Sub Diagonal of "+(n+k+1)+" from bottom right is:");
			while(i<n-1-k&&j>=0) {
				System.out.print(a[i][j]+" ");
				i++;
				j--;
			}
			System.out.println();	
		}
		System.out.println("*************************************************");
		
	}

}
