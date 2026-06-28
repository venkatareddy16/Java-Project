package com.operators;

public class UnaryOperators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=0.5;
		System.out.println(d++);//0.5(o/p) but d=1.5
		System.out.println(d);
		
		int a=10;
		a=a++; //a=10
		System.out.println(a);//10
		
		int b=20;
		int c=b++; //c=20 but b=21
		System.out.println(b);//21
		System.out.println(c);//20
		
		int e=a++; //e=10 but a=11
		System.out.println(e);//10
		System.out.println(a);//11
		
		
		b=++b; //b=22
		System.out.println(b);//22
		
		int f=++b; //f=23 and b=23
		System.out.println(f);//23
		System.out.println(b);//23
		

	}

}
