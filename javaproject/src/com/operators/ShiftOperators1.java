package com.operators;
//shift operators
//left, right, (right with signed shift)
//>>> is used to handle negative values but >> is does not handle negative values.
public class ShiftOperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		// left shift (<<)
		int a=10;
		int b=5;
		
		// left shift (<<)
		System.out.println("*****************<<*********************");
		System.out.println(a<<b); //80
		System.out.println(34<<3);//272
		System.out.println(46<<3);//368
		
		//right shift(>>)
		System.out.println("*************>>**************************");
		System.out.println(a>>b); //0(o/p) -> 0.32
		System.out.println(34>>3);//4
		System.out.println((-7>>2));//-2   ~(7>>2) -> ~1 -> -2 //here (-7>>2) and -7>>2 is same.
		System.out.println(-7>>1);//-4
		System.out.println(-7>>3);//-1
		
		//signed right shift(>>>) 
		System.out.println("******************>>>**********************");
		System.out.println(a>>>b);//0
		System.out.println(34>>>3);//4
		System.out.println(46>>>3);//5
		System.out.println(-7>>>2);//1073741822 (here negative number is handled)
	}

}
