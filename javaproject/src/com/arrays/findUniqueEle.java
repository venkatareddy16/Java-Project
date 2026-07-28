package com.arrays;

import java.util.*;

public class findUniqueEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method Started");
		System.out.println("Enter the size of the array:");
		// Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int res[] = findUnique(a);
		System.out.println(Arrays.toString(res));

	}

	static int[] findUnique(int[] a) {
		int n = a.length;
		int res[] = new int[n];
		int k = 0;
		// o(n2)
//		for(int i=0;i<n;i++) {
//			int count=0;
//			for(int j=0;j<n;j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
//			if(count==1) {   //unique element
//				res[k++]=a[i];	
//			}
//		}

		// o(nlogn)
		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (a[i] != a[i + 1]) {
					res[k++] = a[i];
				}
			}
			else if(i==n-1) {
				if(a[i]!=a[i-1]) {
					res[k++]=a[i];
				}
			}
			else if(a[i] != a[i - 1] && a[i] != a[i + 1]) {
				res[k++] = a[i];
			}
		}
		return Arrays.copyOf(res, k);
	}

}
