package com.arrays;

import java.util.Scanner;

public class PrintSubDiagFromTopRight {

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
		System.out.println("***************************************");
		System.out.println("***************************");
		//logic
		//up part part diagonals + left main diagnol
		//we have n sub-lines including main diagonal
		for(int k=0;k<n;k++) {
			int i=0;//for every row starting i value is 0
			int j=n-1-k;//starting j value decreasing from n-1 to 0(from row to row)
			System.out.println("Sub Diagonal of "+(k+1)+" from top right is:");
			while(i<=k&&j<=n-1) {
				System.out.print(a[i][j]+" ");
				i++;
				j++;
			}
			System.out.println();
		}
		//down part sub-diagonals excluding main diagonal after the main diagonal continuation.
		//here we have n-1 sub lines without main diagonal
		for(int k=0;k<n-1;k++) {
			int j=0;//for every row starting j value is 0
			int i=k+1;//starting i value increasing from 1 to n-1(from row to row)
			System.out.println("Sub Diagonal of "+(n+k+1)+" from top right is:");
			while(i<=n-1&&j<n-1-k) {
				System.out.print(a[i][j]+" ");
				i++;
				j++;  
			}
			System.out.println();
		}

	}

}
