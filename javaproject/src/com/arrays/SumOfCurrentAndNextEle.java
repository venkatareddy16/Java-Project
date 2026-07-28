package com.arrays;

import java.util.*;

public class SumOfCurrentAndNextEle {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
        int res[]=findsumofcurrandnextele(a);
        System.out.println(Arrays.toString(res));
	}

	static int[] findsumofcurrandnextele(int[] a) {
		int n = a.length;
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				res[i] = a[i] + a[i - 1];
			} else if(i==0){
				res[i] = a[i]+a[i+1];
			}
			else {
				res[i]=2*a[i];
			}
		}
		return res;
	}

}
