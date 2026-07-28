package com.logicalstatements.whileloopst;

import java.util.Scanner;

public class OctalToBinary {

	static int octaltoDecimal(int n) {
		//convert int to string
		String s=Integer.toString(n);
		int num=s.length();
		int sum=0;//we want decimal number
		for(int i=num-1;i>=0;i--) {
		    int pos=(num-1)-i;
		    char ch=s.charAt(i);
		    int ch1=ch-'0'; //convert char digit to int digit
		    //ch=ch1+'0';//convert int digit to char digit
			//if(ch1!=0) {
				sum=(int)(sum+(ch1*Math.pow(8,pos)));
			//}
		}
		return sum;
	}
	 static int decimaltoBinary(int n) {
		    int num=octaltoDecimal(n);
	    	String s1="";
	    	int rem=0;
	    	while(num>0) {
	    		rem=num%2; 
	    		num=num/2;   
	    		//s1=s1+rem;
	    		s1=rem+s1;
	    	}
	    	int res=Integer.parseInt(s1);
	    	return res;
	    }
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a octal number:");
		int n=sc.nextInt();
		int sum=octaltoDecimal(n);
		int sum1=decimaltoBinary(n); 
		System.out.println("The decimal numner is:"+sum);
		//finally octal to binary number is below:
		System.out.println("The binary numner is:"+sum1);
		
	}
}
