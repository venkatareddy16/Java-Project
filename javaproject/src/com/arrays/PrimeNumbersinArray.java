package com.arrays;
import java.util.*;
public class PrimeNumbersinArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		printprimeNumbers(a);
	
	}

	static void printprimeNumbers(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("*********************");
	}

	static boolean isPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
