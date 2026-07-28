package com.arrays;
import java.util.*;
public class SumAvgArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of marks:");
		int m=sc.nextInt();
		
		//declaration and create of array
		int a[]=new int[m];
		
		//Intialization of array using the scanner input
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		//for calulation of sum
		int sum=0;
		for(int i=0;i<m;i++) {
			sum+=a[i];
		}
		double avg=sum/m;
		double percent=avg*100;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(percent);
	
	}

}
