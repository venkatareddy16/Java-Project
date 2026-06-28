package com.logicalstatements.loopingst;
import java.math.BigInteger;
import java.util.*;
//we can use int type for fact when the input number is 0 to 33
//we can use long type for fact when the input number is 34 to 65
//we can use biginteger (normal object)object data type for fact when the input number is 66 to so on numbers.
public class Factorial1 {
	static BigInteger factNum(int a) {
		if(a==0) {
			return BigInteger.ONE;
		}
	    BigInteger fact=BigInteger.ONE;
	    
	   //covert primit(a type) to normal object data type
	   //it does not have auto boxing
	   // BigInteger val=BigInteger.valueOf(a);
	    
	  //covert normal object data type to  primit(a type) 
	  // int a=val.intValue();
	    
	    for(int i=a;i>=1;i--) {
	    	fact=fact.multiply(BigInteger.valueOf(i));  
	    }
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		BigInteger fact=factNum(a);
		System.out.println("The factorial of number is "+fact);

	}
}
