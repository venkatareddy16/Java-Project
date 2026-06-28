package com.operators;
//Logical Operators
//It is used for checking multiple conditions and will get resulted values like boolean expressions.
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		int a = 10;
		int b = 20;
		int c = 15;
		// &&
		System.out.println("***************&&****************");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		// It is used for checking multiple conditions and will get resulted values like
		// boolean expressions.
		// If the first condition is false,then it ignore the second condition that will
		// consider as dead code.
		// dead code means the code that does not exceutes whenever the program is
		// exceutes.
		System.out.println(a > b && a != c);// false
		System.out.println(a < b && a != c);// true
		System.out.println(b > a && a == c);// false
		System.out.println(b < a && a == c);// false

		// a=10
		System.out.println(a > b && ++a != c);// false
		System.out.println(a);// a

		// ||
		System.out.println("***************||****************");
		System.out.println(true || true);// true
		System.out.println(true || false);// false
		System.out.println(false || true);// false
		System.out.println(false || false);// false

		// If the first condition is true,then it ignore the second condition that will
		// consider as dead code.
		// dead code means the code that does not exceutes whenever the program is
		// exceutes.
		System.out.println(a > b || a != c);// true
		System.out.println(a < b || a != c);// true
		System.out.println(b > a || a == c);// true
		System.out.println(b < a || a == c);// false

		// a=10
		System.out.println(a < b || ++a != c);// true
		System.out.println(a);// 10

		// !(Logical Not)
	 	System.out.println("*******************!*******************");
	    System.out.println(!true);	//false
	    System.out.println(!false); //true
	    
	    System.out.println(!(a<b));//false
	    System.out.println(!(a++<c));//false  //here a=11 updated
	    System.out.println(a); //11
	
	}

}
