package com.arrays;
import java.util.*;
public class SumOfPrimaryAndSecondaryDiagonals {

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
		
		System.out.println("***************************");
		int psum=0;
		int ssum=0;
		//normal version -> o(n2)
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j) {
//					psum+=a[i][j];
//				}
//				if(j==n-i-1&&j!=i) {
//					ssum+=a[i][j];
//				}
//			}
//		}
		
	   //optimized version -> o(n)
		for(int i=0;i<n;i++) {
			//for(int j=0;j<n;j++) {
		     	psum+=a[i][i];    //adding the left diagonal elements
			//}
		}
		
		int i=0; 
		int j=m-1;
		while(i<n&&j>=0) { 
		  if(i!=j) {   //excluding i==j condition elements
			ssum=ssum+=a[i][j];//adding the right diagonal elements   
		  }
			i++;
			j--;
		}
		System.out.println("Primary sum is: "+psum);
		System.out.println("secondary sum is: "+ssum);
		
		System.out.println("sum of primary and secondary sum is:"+(psum+ssum));
	}

}
