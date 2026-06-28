package com.operators;

//var++ ->var+1,but it increments after execution of var.
//++var ->var+1,but in increments before execution of var.
//var-- ->var-1,but it decrements after execution of var.
//--var ->var-1,but in decrements before execution of var.
public class UnaryOperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;

		// +var
		System.out.println(+a); // 10

		// -var
		System.out.println(-a);// -10

		// var++ ->post increment
		System.out.println(a++);// 10(o/p) -> after that a=11;
		System.out.println(a); // 11

		// ++var ->pre increment
		System.out.println(++a);// 11+1=12(o/p)
		System.out.println(a);// 12

		// +var
		System.out.println(+b); // 11

		// -var
		System.out.println(-b);// -11

		// var++ ->post increment
		System.out.println(b++);// 11(o/p) -> after that a=12;
		System.out.println(b); // 12

		// ++var ->pre increment
		System.out.println(++b);// 12+1=13(o/p)
		System.out.println(b);// 13

	}

}
