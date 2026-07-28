package com.arrays;

import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Before transpose:");
		for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }

		transposeMatrix(a);
		System.out.println("After transpose:");
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		System.out.print(a[i][j]+" ");            //or using by direct a[j][i] without swap function
        	} 
        	System.out.println();
        }

	}

	static void transposeMatrix(int[][] a) {
        for(int i=0;i<a.length;i++) {
        	for(int j=i;j<a[i].length;j++) {            //j=i or i+1 to avoid again swapping 
        		//swap the row to col side elements.
        		int temp=a[i][j];
        		a[i][j]=a[j][i];
        		a[j][i]=temp;
        	}
        }
	}

}
