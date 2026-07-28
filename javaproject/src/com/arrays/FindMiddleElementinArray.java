package com.arrays;
import java.util.*;
public class FindMiddleElementinArray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 int find=findMiddleElement(a);
		 System.out.println(find);
	}

	static int findMiddleElement(int[] a) {
		//for odd case
	       if(a.length%2!=0) {
	    	   return a[a.length/2];
	       }
	       //for even case
	       return a[(a.length/2)-1];  //for middle first element
	       //return a[a.length/2];    //for middle second element
		
	}

}
