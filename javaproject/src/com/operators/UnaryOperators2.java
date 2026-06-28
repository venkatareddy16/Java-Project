package com.operators;

public class UnaryOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0,c=0;
		
		a=a++;//a=10 only
		System.out.println(a);//10(o/p) 
		
		b=a++;  //b=10 and a=11
		System.out.println(b);//10(o/p) 
		System.out.println(a);
		
		//before below statement a=11;
		a=++a; //a=12  
		System.out.println(a);//12
		
		//before below statement a=12;
		c=++a; //c=13
		System.out.println(c);//13
		
		//before below statement a=13;
		b=++a; //b=14
		System.out.println(b);//14
		
		double d=0.5;
		System.out.println(d++);//0.5(o/p)  but 
		
		

	}

}
