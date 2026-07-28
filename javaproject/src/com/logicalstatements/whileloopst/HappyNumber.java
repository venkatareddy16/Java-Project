package com.logicalstatements.whileloopst;
import java.util.*;
public class HappyNumber {

	static boolean HappyNumber(int n) {
		//int rem = 0;
		do {
			int sum=0;
			while (n > 0) {
				int rem = n % 10;// 12345 //15
				n = n / 10;
				sum = (int) (sum + Math.pow(rem,2));// 1+2+3+4+5=15 //1+5=6
			}
			n = sum; // n=15 //n=6
		} while (n > 9); // 15>9 //6>9->false
//		while(true){ 
//			int sum=0;
//			while(n>0) {    //1234
//				rem=n%10; 
//				n=n/10;
//				sum=sum+rem; //1+2+3+4=10 //1+0=1
//			}
//			n=sum; //n=10 //n=1
//			if(n<10) {
//				break;
//			}
//		}
		if (n == 1) {
			return true; // magic number
		}
	    return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		boolean ishappy = HappyNumber(n);
		if (ishappy) {
			System.out.println("Given number is happpy number");
		} else {
			System.out.println("Given number is not happy number");
		}
	}

}
