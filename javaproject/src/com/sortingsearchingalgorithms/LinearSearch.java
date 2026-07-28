package com.sortingsearchingalgorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		boolean flag=linearSearch(a,k);
		if(flag==true) {
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
	}

	static boolean linearSearch(int[] a,int k) {
	   int n=a.length;
	   //o(n)
	   for(int i=0;i<n;i++) {
		   if(a[i]==k) {
			   return true;
		   }
	   }
	   return false;
	}

}
