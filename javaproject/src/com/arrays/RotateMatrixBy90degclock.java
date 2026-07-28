package com.arrays;

import java.util.Scanner;

public class RotateMatrixBy90degclock {

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
		System.out.println("Orginal matrix is:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//rotate matrix by 90 degree by clock-wise (turn right)
		//first we have to transpose the matrix.
		int res[][]=transpose(a);
		System.out.println("Transposed matrix is:");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		//And then for resultant matrix we have to reverse the rows.
		for(int i=0;i<res.length;i++) {  
			reverse(res[i]);//each row is considered as 1-d array.
		}
		//now print the resultant matrix
		System.out.println("After 90 degrees rotation matrix is:");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

	static void reverse(int[] a) {
		int i=0,j=a.length-1;  //->row pos from 0 to n-1
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}	
	}
	static int[][] transpose(int[][] mat) {
		//temp variable swapping is not for different row and col sizes
		int r=mat.length;
		int c=mat[0].length;
		int res[][]=new int[c][r];//swapped dimensions
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				res[j][i]=mat[i][j];//assigning
			}
		}
		return res;
	}

}
