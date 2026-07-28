package com.arrays;
import java.util.*;
public class OneDimensionalIntArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n=sc.nextInt();
		
		//Declaration
		int a[];
		//creation
		a=new int[n];
		
		//Intialization of arr values from scanner
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//presentation of array
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

}
