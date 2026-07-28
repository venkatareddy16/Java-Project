package com.arrays;
import java.util.*;
public class MostFreqNuminArr {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Main method started");
        int n=sc.nextInt();
        int a[]=new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 findfreqwithIndexes(a);
		

	}
	
    static void findfreqwithIndexes(int[] a) {
		int n=a.length;
		//o(n2) 
		int maxfreqele=0;
		int maxfreq=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(maxfreq<count) {
				maxfreq=count;
				maxfreqele=a[i];
			}
		}
		System.out.println("maxfreq element is :"+maxfreqele);
		System.out.println("maxfreq is :"+maxfreq);
		System.out.println("Indexes are :");
		//to get most freq ele indexes
		for(int i=0;i<n;i++) {
			if(a[i]==maxfreqele) {
				System.out.print(i+" ");
			}
		}
	}

}
