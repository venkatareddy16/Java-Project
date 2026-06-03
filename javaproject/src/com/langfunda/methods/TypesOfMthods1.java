package com.langfunda.methods;

public class TypesOfMthods1 {
	void hello() {
		System.out.println("Good Morning");
	}
	
	public static void welcome() {
		System.out.println("welcome to welcome method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		TypesOfMthods1 t1=new TypesOfMthods1();
        t1.hello();
        welcome();
        
        System.out.println("main method ended");
        
        
	}

}
