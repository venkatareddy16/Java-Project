package com.arrays;

import java.util.Scanner;

public class AdditionOfTwoMatrices {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of mat1:");
		int n=sc.nextInt();
		System.out.println("Enter the cols of mat1:");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the rows of mat2:");
		int p=sc.nextInt();
		System.out.println("Enter the cols of mat2:");
		int q=sc.nextInt();
		int b[][]=new int[p][q];
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		//Addition of a and b we have to take two equal matrices of equal rows and columns.
		//for this,I want another matrix to store this value into another matrix.
		int c[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		//print the c matrix
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
