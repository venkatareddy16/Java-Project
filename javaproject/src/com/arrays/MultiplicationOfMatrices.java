package com.arrays;

import java.util.Scanner;

public class MultiplicationOfMatrices {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of mat1:");
		int n=sc.nextInt();
		System.out.println("Enter the cols of mat1:");
		int m=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
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
		//Multiplication of two matrices
		//3*3 * 3*4 ->3*4(res) 
		//multiplication is possible when n equal to p (n==p) 
		int c[][]=new int[m][q];  //here a is multiplied by b and store in a matrix c.
		//logic
		if(n==p) {
			for(int i=0;i<m;i++) {  //every row of matrix a
				//here every row of a is multiplied by all the columns in b
				for(int j=0;j<q;j++) {  //every column of matrix b
					int sum=0;
					//here columns of a is equal to rows of b(n==p)
					for(int k=0;k<n;k++) {
						sum+=(a[i][k]*b[k][j]);
					}
					c[i][j]=sum;
				}	
			}
			//print the matrix 
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {   //n!=p 
			System.out.println("multiplication is not possible");
		}
		
		
		
	}

}
