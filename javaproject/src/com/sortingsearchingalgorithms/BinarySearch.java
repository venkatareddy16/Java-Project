package com.sortingsearchingalgorithms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if(binarySearch(a,k)) {
			System.out.println("Elemnt found");
		}
		else {
			System.out.println("Element Not Found");
		}	
	}

	static boolean binarySearch(int[] a, int k) {
		int n=a.length;
		int low=0,high=n-1;
		//Tc:log(n)
		while(low<=high) {
			int mid=low+(high-low)/2;   //or (low+high)/2 
			if(a[mid]==k) {
				return true;
			}
			else if(a[mid]<k) {
				low=mid+1;
			}
			else {   //a[mid]>k	
				high=mid-1;
			}
		}
		return false;	
	}

}
