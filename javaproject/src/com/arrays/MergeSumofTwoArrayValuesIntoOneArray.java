package com.arrays;

import java.util.Scanner;

//WAP to print the sum of two array same index values into third array
public class MergeSumofTwoArrayValuesIntoOneArray {
	int[] mergeTwoArrays(int[] a, int[] b) {
		//take the maxlen from the fiven array for c variable.
		int maxlen=Math.max(a.length,b.length);
		int c[] = new int[maxlen];
		// find the max size from the tow arrays
		int minlen = Math.min(a.length, b.length); // for adding the common index positions
		int i = 0;
		while (i < minlen) {
			c[i] = a[i] + b[i]; // adding the sam index pos of a and b values to c array
			i++;
		}
		// add the remaining elements from the max length array
		// if maxlen==minlen it will not executes below
		if(maxlen==minlen) {  //stop the execution
			return c;
		}
		//any one from below executes
		//here i at minlen position
		while (i < maxlen&&maxlen==a.length) {
			c[i] = a[i];
			i++;
		}
		while (i < maxlen&&maxlen==b.length) {
			c[i] = b[i];
			i++;
		}
		return c;
	}

	void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array 1:");
		int n = sc.nextInt();
		System.out.println("Enter the size of the Array 2:");
		int m = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements for the array1:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[m];
		System.out.println("Enter the elements for the array2:");
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		int res[] = mergeTwoArrays(a, b);
		// print the res[] array
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
		System.out.println("***********END****************");

	}

}
