package com.arrays;
import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter the size of the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int ssmall=findSecondSmallest(a);
		System.out.println("Seocnd Smallest Element is "+ssmall);
	}

	static int findSecondSmallest(int[] a) {
		int n=a.length;
		int small=a[0];
		int ssmall=Integer.MAX_VALUE; //if the data is in ascending order
		for(int i=1;i<n;i++) {   
			if(a[i]<small) {     
				ssmall=small;                                          
				small=a[i];                                              
			}
//			else if(a[i]<ssmall) {			                                                                              
//				ssmall=a[i];                                             
//			}
			
			//or
			
			if(a[i]<ssmall&&a[i]!=small) {
				ssmall=a[i];
			}
		}
		return ssmall;
	}

}
