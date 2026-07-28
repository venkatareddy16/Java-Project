package com.arrays;
import java.util.*;
public class RevOfEleinArr {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int res[]=revofEleinArr(a);
		System.out.println(Arrays.toString(res));
	}

	static int[] revofEleinArr(int[] a) {
		int n=a.length;
		int res[]=new int[n];
		for(int i=0;i<n;i++) {
			res[i]=reverse(a[i]);
		}
		
		return res;
	}

	static int reverse(int n) {
		int rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

}
