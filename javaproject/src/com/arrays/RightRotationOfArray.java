package com.arrays;
import java.util.*;
public class RightRotationOfArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the size the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter how any times you want to rotate right ");
		int r=sc.nextInt();
		//before rotation array is:
		System.out.println("Before Rotation:");
		System.out.println(Arrays.toString(a));
		
		a=rotateArray(a,r);
		System.out.println("After rotation:");
		System.out.println(Arrays.toString(a));

	}

	static int[] rotateArray(int[] a, int r) {
		//int st=0;
		//int en=a.length-1;
		r=r%a.length;  //if r>=a.length then remainder r%a.length is rotation times.
		//reverseArray(a,st,en);//reverse total array
		//reverseArray(a,st,r-1);//reverse from st(0) to r-1 elements for right rotation
		//reverseArray(a,r,en);//reverse from r elements to en elements for right rotation
		
		//another logic
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[(i+r)%a.length]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			a[i]=b[i];
		}
		return a;
	}

//	static void reverseArray(int[] a, int st, int en) {
//		while(st<en) {
//			int temp=a[st];
//			a[st]=a[en];
//			a[en]=temp;
//			st++;
//			en--;
//		}
//	}

}
