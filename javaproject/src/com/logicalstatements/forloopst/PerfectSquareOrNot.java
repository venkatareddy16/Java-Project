package com.logicalstatements.forloopst;
import java.util.*;
public class PerfectSquareOrNot {
   static boolean isPsquare(int n) {
	   for(int i=1;i<=Math.sqrt(n);i++) {         //i*i<=n
		   if(i*i==n) {
			   return true;
		   }
	   }
	   return false;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean isPerfectSqaure=isPsquare(n);
		if(isPerfectSqaure) {
			System.out.println("Given number is perfect sqaure number");
		}
		else {
			System.out.println("Given number is not a perfect sqauare number");
		}
	}

}
