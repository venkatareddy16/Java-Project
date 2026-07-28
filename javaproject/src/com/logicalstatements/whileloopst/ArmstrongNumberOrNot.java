package com.logicalstatements.whileloopst;
import java.util.*;
public class ArmstrongNumberOrNot {
	static int findpow(int rem,int count) {
		int res=1;
		for(int i=1;i<=count;i++) {
			res=res*rem;             
		}
		return res;
	}
    static boolean isArm(int n) {
    	boolean flag=false;
    	int sump=0;
    	int countd=0;
    	int rem=0;
    	int n1=n; //for sum cal using pow(rem,countd)
    	int temp=n; //for checking the given number with calculated sum.
    	String s=Integer.toString(n);//convert Integer to string
    	countd=s.length(); //length of string is count of digits of the given number.
//    	while(n>0) {
//    		rem=n%10;
//    		n=n/10;
//    		countd++;
//    	}
    	while(n1>0) {
    		rem=n1%10;
    		n1=n1/10;
    		sump=(int) (sump+findpow(rem, countd));  //or using built-in function:Math.pow(a,b)
    	}
    	if(temp==sump) {
    		flag=true;
    	}
    	
    	return flag;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=sc.nextInt();
		boolean status=isArm(n);
		if(status) {
			System.out.println("Given number is Armstrong number");
		}
		else {
			System.out.println("Given number is not armstrong number");
		}

	}

}
