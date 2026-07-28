package com.logicalstatements.whileloopst;
import java.util.*;
public class DecimalToBinary {
    static int findDecimaltoBinary(int n) {
    	String s1="";
    	int rem=0;
    	//If we want rem values only 0's and 1's then we should / and % the  number by 2.
    	//If we want rem values only 0 to 9 then we should / and % the  number by 10.
    	//If we want rem values only 0 to 7 then we should / and % the  number by 8.
    	
    	while(n>0) {
    		rem=n%2; //n=8 ->8%2=0,4%2=0,2%2=0,1%2=1.
    		n=n/2;   //n=8 -> 8/2=4,4/2=2,2/2=1,1/2=0.
    		//s1=s1+rem;
    		s1=rem+s1;
    	}
    	int res=Integer.parseInt(s1);
    	return res;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=sc.nextInt();
        int res=findDecimaltoBinary(n);
        System.out.println(res);
        

	}

}
