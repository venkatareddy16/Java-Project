package com.arrays;
import java.util.Scanner;
public class MergeTwoArraysIntoOneArray {
    int[] mergeTwoArrays(int []a,int []b) {
    	int c[]=new int[a.length+b.length];
    	//put all elements from a to c (front elements)
    	for(int i=0;i<a.length;i++) {
    		c[i]=a[i];//assigning the a elements to c array from starting position
    	}
    	//put all elements from b to c (back elements)(after a elements added)
    	for(int i=0;i<b.length;i++) {
    		//in c array,0 to a.length-1 is filled,now from a.length pos start to add b elements to c array.
    		c[a.length+i]=b[i];//assigning the b elements to c array from array a length position.
    	}
    	return c;
    }
	void main() {
      	System.out.println("Main method started");
      	Scanner sc=new Scanner(System.in);
      	System.out.println("Enter the size of the Array 1:");
      	int n=sc.nextInt();
      	System.out.println("Enter the size of the Array 2:");
      	int m=sc.nextInt();
      	int a[]=new int[n];
      	System.out.println("Enter the elements for the array1:");
      	for(int i=0;i<n;i++) {
      		a[i]=sc.nextInt();
      	}
      	int b[]=new int[m];
      	System.out.println("Enter the elements for the array2:");
      	for(int i=0;i<m;i++) {
      		b[i]=sc.nextInt();
      	}
      	int res[]=mergeTwoArrays(a,b);
      	//print the res[] array
      	for(int i=0;i<res.length;i++) {
      		System.out.print(res[i]+" ");
      	}
      	System.out.println();
      	System.out.println("***************************");
      	

	}

}
