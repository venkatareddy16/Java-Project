package com.arrays;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		System.out.println("main method Started");
		 //int b[]=new int[2147483647]; //Runtime error : java.lang.OutOfMemoryError:Requested array size exceeds VM limit
		// int c[]=new int[-10];// Runtime Exception:java.lang.NegativeArraySizeException: -10
		// declaration&creation and initialization at once.
		int ar[] = {};
		System.out.println(ar);// address of the array a -> [I@27716f4. ->I means Integer
		System.out.println(ar.hashCode());// 41359092
		int n = 0X27716f4;
		System.out.println(n);// 41359092
		// declaration
		int a[];
		// crating the array
		a = new int[5];
		// Intialization of array values
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		a[3] = 13;
		// Representation of the array
		// using for forloop
		for (int i = 0; i < a.length; i++) {
			a[i]*=2;
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(a[0]);
		System.out.println("*****************************");
		// using for-each loop
		for (int i : a) {
			i=i*2;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print(a[0]);
		System.out.println();
		System.out.println("*********************");
		// using Arrays.toString() predefined method in Arrays class -> convert to
		// String Array
		
		
		System.out.println(Arrays.toString(a));
	}

}
