package com.logicalstatements.forloopst;

import java.util.*;

public class PrimeNumPrimePos {
	static boolean isprime(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of numbers you enter:");
		int n = sc.nextInt();
		int pos = 0;
		for (int i = 0; i <= n; i++) {
			if (isprime(i)) {
				pos++;
				if (isprime(pos)) {
					System.out.println("Number is prime and its pos is also prime " + i);
				}
//				else {
//					System.out.println("Number is prime and its pos is not prime "+i);
//				}
			}
//			else {
//				System.out.println("Number is not prime and its pos is not prime "+i);
//			}
		}

	}

}
