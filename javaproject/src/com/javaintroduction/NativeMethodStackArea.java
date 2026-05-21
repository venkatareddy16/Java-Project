package com.javaintroduction;

public class NativeMethodStackArea { 
	//we cannot execute native methods in java directly.
	//we can  access the c or c++ functionalities in java by using the native methods with the help of loading java native interfaces and java native method libraries.
	//native methods are executed in the native method stack area.
    //Native methods do not specify a body
	//native static void welcome();  
	native void welcome();
	
	static void hello() {
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main method started");
        hello();
        NativeMethodStackArea n=new  NativeMethodStackArea();
        n.welcome();     // for static it is welcome();
	}

}
