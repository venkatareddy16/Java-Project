package com.arrays;
import java.util.*;
public class MaxEleArray {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of the array");
	   int n=sc.nextInt();
	   int a[]=new int[n];
	   for(int i=0;i<n;i++) {
		   a[i]=sc.nextInt();
	   }
	   //logic
	   int max=a[0];
	   for(int i=1;i<n;i++) {
		   if(a[i]>max) {
			   max=a[i];
		   }
	   }
	   System.out.println(max);
	   
   }
}
