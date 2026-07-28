package com.sortingsearchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		bubbleSort(a);
		System.out.println("After sorting array is: " + Arrays.toString(a));
	}

	static void bubbleSort(int[] a) {
		int n = a.length;
		int c1=0;
		int c2=0;
		//boolean swap=false;
		// n-1 iterations
		for (int i = 0; i < n - 1; i++) {
			// for each iteration n-1-i comparison because in every iteration,one element is
			// sorted.
			c1++;
			//for sorted array it is o(n) beacuse we using the boolean swap variable to check is it req swaps for every iteration.
			boolean swap=false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap=true; //if atleast one swap possible
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				c2++;
			}
			if(!swap) {   //swap is false
				break;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	}

}
