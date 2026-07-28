package com.patterns;
import java.util.*;
public class PascalTrianglePattern37 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//take the temp array
		int a[][]=new int[n][n];
		
		//logic
		for(int i=0;i<n;i++) {
			//for spaces printing
			for(int k=n-1;k>i;k--) {
				System.out.print(" ");
			}
			//for number or star or any thing printing
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
					a[i][j]=1;
				}
				else{      //j>1&&j<i condition
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
