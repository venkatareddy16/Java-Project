package com.logicalstatements.whileloopst;
import java.util.*;
public class OctalToDecimal {

	public static void main(String[] args) {
			System.out.println("main method started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a octal number:");
			int n=sc.nextInt();
			int res=octaltoDecimal(n);
			char ch='A';
			int ch1=ch;  //'A' convert to int it gets 65(Ascii code)
			int ch2=66;
			char ch3=(char) ch2; //66 int convert to char it gets B(Ascii code)
			char ch4=66;         //66 int convert to char it gets B(Ascii code)
			char ch5='8';
			int ch6=ch5; //'8' convert to int it gets 56
			System.out.println(ch1);
			System.out.println(ch3);
			System.out.println(ch4);
			System.out.println(ch6);
			System.out.println("The decimal number is :"+res);
		}

		static int octaltoDecimal(int n) {
			//convert int to string
			String s=Integer.toString(n);
			int num=s.length();
			int sum=0;//we want decimal number
			for(int i=num-1;i>=0;i--) {
			    int pos=(num-1)-i;
			    char ch=s.charAt(i);
			    int ch1=ch-'0';//convert char digit to int digit as it is 
				if(ch1!=0) {
					sum=(int) (sum+(ch1*Math.pow(8,pos)));
				}
			}
			return sum;
		}
}
