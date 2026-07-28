package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindLeadersonLeftofele {
	static int[] findLeadersinleft(int[] a) {
		int n = a.length;
		int res[]=new int[n];
//		res[0]=a[0]; //first element is always a leader
//		for(int i=1;i<n;i++) {
//			for(int j=i-1;j>=0;j--) {
//				if(a[i]<a[j]&&res[i]<a[j]) {
//					res[i]=a[j];
//				}
//			}
//			if(res[i]==0) { //if in left side greater or equal element is not there. 
//				res[i]=-1;
//			}
//		}
		// o(n)
		int max = a[0]; // first element is always a leader
		res[0] = max;
		for (int i = 1; i <n; i++) {
			if (a[i] >= max) {
				max = a[i];
				res[i] = -1;
			} else if (a[i] < max) {
				res[i] = max;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int res[] = findLeadersinleft(a);
		System.out.println(Arrays.toString(res));
		int r[] = findonlyLeaders(a);
		System.out.println(Arrays.toString(r));

	}

	static int[] findonlyLeaders(int[] a) {
		int n = a.length;
		int res[] = new int[n];
		// o(n2)
		int k=0;
		res[k++]=a[0];
		for(int i=1;i<n;i++) {
			boolean flag=true;
			for(int j=i-1;j>=0;j--) {
				if(a[i]<=a[j]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				res[k++]=a[i]; //copying the all leaders into the res array and last element is always a leader.
			}
		}

		// o(n)
//		int max = a[0];
//		int k = 0;
//		res[k++] = max;
//		for (int i = 1; i < n; i++) {
//			if (a[i] > max) {
//				max = a[i];
//				res[k++] = max;
//			}
//		}
		return Arrays.copyOf(res, k);
	}

}
