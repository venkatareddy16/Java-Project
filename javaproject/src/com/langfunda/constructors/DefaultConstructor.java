package com.langfunda.constructors;

public class DefaultConstructor {
    int id;
    String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//Note 1:The below object is created with the help of "default constructor" that is created by the compiler by default if our class have no other constructors.
		//LHS=Class name with obj ref variable(local variable)
		//RHS=Constructor calling with the help of new keyword will consider as object
		DefaultConstructor d=new DefaultConstructor();  //object creation
		System.out.println(d.id);
		System.out.println(d.name);		

	}

}
