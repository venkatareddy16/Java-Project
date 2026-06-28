package com.operators;

public class ArithmeticOperators {
    
	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a=10;
		int b=20;
		//calculation is done by:BODMAS RULE
		//Addition
		System.out.println("The Addition of a and b is: "+ a+b);  //1020 //string + anything is string
		System.out.println("The Addition of a and b is: "+(a+b)); //30
		
		//Subtraction
		//The operator - is undefined for the argument type(s) String, int
		//System.out.println("The Addition of a and b is: "+ a-b);  
		System.out.println("The Addition of a and b is: "+(a-b)); //-10
		
		//Multiplication
		System.out.println("The Mutiplication of a and b is: "+a*b);//200
		
		//Division
		System.out.println("The division of a and b is: "+a/b);//0.5 ->0
		
		//Modulus
		System.out.println("The Modulus of a and b is: "+a%b);//10
		

	}

}
