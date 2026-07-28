package com.arrays;
import java.util.Scanner;
public class FreqofgivenNumfromArray {

	public static void main(String[] args) {
       System.out.println("main method started");	
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the given number:");
       int num=sc.nextInt();
       System.out.println("Enter the size of the array:");
       int n=sc.nextInt();
       int a[]=new int [n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       int count=freqofgivenNum(a,num);
       System.out.println("Freq of that given number "+num+" is: "+count);
	}

    static int freqofgivenNum(int[] a,int n) {
    	int totalcount=0;
    	for(int i=0;i<a.length;i++) {
//    		if(a[i]==n) {
//    			count++;
//    		}
    		int c=findc(a[i],n);
    		totalcount+=c;
    	}
    	if(totalcount>0) {
    		return totalcount;
    	}
		return -1;
	}

	static int findc(int n,int b) {
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==b) {
				count++;
			}
			n=n/10;
		}
		return count;
	}

}
