package com.arrays;
import java.util.*;
public class PlaceZeroesatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main method started");
        System.out.println("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        //input scanner
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        int res[]=placezeroesAtEnd(a);
     
        //print
        System.out.println(Arrays.toString(res));
	}

	static int[] placezeroesAtEnd(int[] a) {
		 int n=a.length;
		 int b[]=new int[n];
	        int k=0;
	        //logic
	        for(int i=0;i<n;i++) {
	        	if(a[i]!=0) {
	        		b[k++]=a[i];
	        	}
	        }
	        
	        //assigning the b to a
	        for(int i=0;i<n;i++) {
	        	a[i]=b[i];
	        }
		return a;
	}
	

}
