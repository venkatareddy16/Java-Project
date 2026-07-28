package com.arrays;

import java.util.Scanner;

public class MaxMinEle {
	//using method
    static int[] maxmin(int[] a) {
    	int max=a[0];
    	int min=a[0];
    	for(int i:a) {
    		if(i<min) {  //i<min then it should not be i>max
    			min=i;
    		}
    		else if(i>max) {  //i>max thern it should not be i<min
    			max=i;
    		}
    	}   
    	//1.int b[]; //1.model
    	//1.b=new int[] {min,max}; //1.model
    	//2.int b[]={min,max};//2.model
    	int b[]=new int[2]; //3.model
    	b[0]=min;  //3.model
    	b[1]=max;  //3.model
    	return b;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n of elements:");
		int m=sc.nextInt();
		
		//declaration and create of array
		int a[]=new int[m];
		
		//Intialization of array using the scanner input
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		
		int [] result=maxmin(a);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		//Normal method
//		int max=a[0];   //0 or Integer.MIN_VALUE if there is negative elements.
//		int min=a[0];   //Integer.MAX_VALUE;
//		//System.out.println(Integer.MIN_VALUE);
//		for(int i=1;i<m;i++) {
//			if(min>a[i]) {
//				min=a[i];
//			}
//			if(max<a[i]) {
//				max=a[i];
//			}
//		}
//		System.out.println("Max value is : "+max);
//		System.out.println("Min value is : "+min);

	}

}
