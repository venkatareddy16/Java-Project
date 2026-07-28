package com.arrays;
import java.util.Scanner;
public class EvenCountOddCountArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ecount=0,ocount=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				ecount++;
			}
			else if(a[i]%2==1) {
				ocount++;
			}
		}
		System.out.println(ecount);
		System.out.println(ocount);
	}

}
