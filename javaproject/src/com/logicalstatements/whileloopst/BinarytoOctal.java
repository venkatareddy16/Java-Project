package com.logicalstatements.whileloopst;
import java.util.Scanner;
public class BinarytoOctal {
	static int binaryTODecimal(int n) {
		//convert int to string
		String s=Integer.toString(n);
		int num=s.length();
		int sum=0;//we want decimal number
		for(int i=num-1;i>=0;i--) {
		    int pos=(num-1)-i;
			if(s.charAt(i)=='1') {
				sum=(int) (sum+(Math.pow(2,pos)));
			}
		}
		return sum;
	}
	 static int DecimaltoOctal(int n) {
		    int num=binaryTODecimal(n);
	    	String s1="";
	    	int rem=0;
	    	while(num>0) {
	    		rem=num%8; //n=8 ->8%8=0,1%8=1.
	    		num=num/8;   //n=8 -> 8/8=1,1/8=0.
	    		//s1=s1+rem;
	    		s1=rem+s1;
	    	}
	    	int res=Integer.parseInt(s1);
	    	return res;
	    }
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number:");
		int n=sc.nextInt();
		int sum=binaryTODecimal(n);
		int sum1=DecimaltoOctal(n); 
		System.out.println("The decimal numner is:"+sum);
		//finally binary to octal number is below:
		System.out.println("The octal numner is:"+sum1);
		
	}

}
