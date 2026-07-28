package com.sortingsearchingalgorithms;

import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		divide(a);
		System.out.println("After sorting array is: "+Arrays.toString(a));
	}

	static void divide(int[] a) {
		if(a.length==1) {
			return;
		}
		// now take two temp arrays to make halves of the original array
		int l[] = new int[a.length / 2]; // if n=8 then l[4] size array and if n=5 then l[2] size array
		int r[] = new int[a.length - l.length];// remaining half array -> if n=8 then l[4] size array and if n=5 then l[3] size
										// array.

		int i = 0;// for tracking index of the a array
		// now copy the first half elements of a into l array.
		for (int j = 0; j < l.length; j++) {
			l[j] = a[i];
			i++;
		}
		// now copy the second half elements of a into r array.
		for (int k = 0; k < r.length; k++) {
			r[k] = a[i];
			i++;
		}
		
		divide(l);
		System.out.println("Left part Values are: "+Arrays.toString(l));
		
		divide(r);
		System.out.println("Right part Values are: "+Arrays.toString(r));
        merge(a,l,r);
	}

    static void merge(int[] a, int[] l, int[] r) {
    	int i=0,j=0,k=0;
		while(i<l.length&&j<r.length) {
			if(l[i]<r[j]) {
				a[k++]=l[i++];
			}
			else {   //l[i]>=r[i]
				a[k++]=r[j++];
			}
		}
		//for remaining elements in l array
		while(i<l.length) {
			a[k++]=l[i++];
		}
		//for remaining elements in r array
		while(j<r.length) {
			a[k++]=r[j++];
		}
	}

}
