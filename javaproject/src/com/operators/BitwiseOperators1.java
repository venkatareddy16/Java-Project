package com.operators;

//Bitwise operators
//It works for both variables or numbers and conditions.
//If the first condition is true or false,then it deos not ignore or dead the second condition unlike logical end and logical or.
//But Logical operators works for only conditions
public class BitwiseOperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		// &
		System.out.println("****************&*****************");
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false

		System.out.println(1 & 1);// 1
		System.out.println(1 & 0);// 0
		System.out.println(0 & 1);// 0
		System.out.println(0 & 0);// 0
		System.out.println("************************");
		System.out.println(84 & 36);// 4
		System.out.println(72 & 22);// 0
		System.out.println(66 & 18);// 2

		// |
		System.out.println("****************|*****************");
		System.out.println(true | true);// true
		System.out.println(true | false);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false

		System.out.println(1 | 1);// 1
		System.out.println(1 | 0);// 1
		System.out.println(0 | 1);// 1
		System.out.println(0 | 0);// 0
		System.out.println("************************");
		System.out.println(84 | 36);// 116
		System.out.println(72 | 22);// 94
		System.out.println(66 | 18);// 82

		// ^(bitwise xor)
		System.out.println("****************^*****************");
		System.out.println(true ^ true);// false
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false

		System.out.println(1 ^ 1);// 0
		System.out.println(1 ^ 0);// 1
		System.out.println(0 ^ 1);// 1
		System.out.println(0 ^ 0);// 0
		System.out.println("************************");
		System.out.println(84 ^ 36);// 112
		System.out.println(72 ^ 22);// 94
		System.out.println(66 ^ 18);// 80
		
		//~(bitwise tlt)
		//~n is -(n+1)
		//~21 is -(21+1) -> -22
		System.out.println("*************~************************");
		System.out.println(~21);
		System.out.println(~0);

	}

}
