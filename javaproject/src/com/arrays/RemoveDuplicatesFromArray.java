package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main method started");
		 System.out.println("Enter the size of the array");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 int res[]=removeDuplicates(a);
		 System.out.println(Arrays.toString(res));

	}
	static int[] removeDuplicates(int[] a) {
		int n=a.length;
		int res[]=new int[n];
		int k=0;
		Arrays.sort(a);
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				res[k++]=a[i];	
			}
		}
		res[k++]=a[n-1]; //add the last element
		return Arrays.copyOf(res,k);
	}

}
