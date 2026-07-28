package com.sortingsearchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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
			insertionSort(a);
			System.out.println("After sorting array is: " + Arrays.toString(a));
	}

    static void insertionSort(int[] a) {
		int n=a.length;
		//outer loop starts with 2nd element.
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=a[i];
			//here current element is checks with previous elements up to zero.
			while(j>=0&&a[j]>temp) {
				//then a[j] to a[j+1] (to right one position)
				a[j+1]=a[j];
				j--;	
			}
			a[j+1]=temp;
		}
	}

}
