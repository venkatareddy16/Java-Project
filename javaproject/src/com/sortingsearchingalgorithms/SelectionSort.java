package com.sortingsearchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	   System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		selectionSort(a);
		System.out.println("After sorting array is: " + Arrays.toString(a));
	}

	static void selectionSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			//inner loop is to find the min ele for every iteration
			//every iteration one element is sorted.
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(i!=min) {  //then we have to swap a[i] current ele with a[min] ele
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;		
			}
		}
	}

}
