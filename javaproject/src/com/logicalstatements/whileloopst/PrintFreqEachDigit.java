package com.logicalstatements.whileloopst;
import java.util.*;
public class PrintFreqEachDigit {
    static int[] freqofEachDigit(int n) {
    	//int rem=0;
    	//int temp=n;
//    	while(n>0) {
//    		int count=1;
//    		int rem1=n%10;
//    		n=n/10;
//    		int temp=n;
//    		while(temp>0) {
//    			int rem2=temp%10;
//    			if(rem2==rem1) {
//    				count++;
//    			}
//    			temp=temp/10;
//    		}
//    		System.out.print(count+" ");
//    	}
    	//convert integer to string
    	//o(n2)
    	String s=Integer.toString(n);
    	int res[]=new int[s.length()];
    	int max=0;
    	for(int i=0;i<s.length();i++) {
    		int count=0;
    		char ch=s.charAt(i);
    		for(int j=0;j<s.length();j++) {
    			char ch1=s.charAt(j);
    			if(ch==ch1) {
    				count++;
    			}
    		}
    		if(count>max) {
    			max=count;
    		}
    		res[i]=count;
    	}
    	System.out.println(max);
        return res;
    }
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int res[]=freqofEachDigit(n);
		System.out.println(Arrays.toString(res));
		

	}

}
