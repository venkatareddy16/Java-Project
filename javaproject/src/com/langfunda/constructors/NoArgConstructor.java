package com.langfunda.constructors;

//IMP interview Question..
//Q1//Already Java Complier providing default constructor Then why we need no arg constructor ..?
//ANS1 :While creating an object if we want to load user defined data manually,instead of JVM GIVEN values

//ANS2 :

//Q2//Already we have a instance block,then why we need No-ARG constructor..?
//ANS:
public class NoArgConstructor {
    int id;
    String name;
    //instance block
//    {
//    	System.out.println("Instance block loaded");
//    	id=101;
//    	name="Venkata Reddy";
//    }
    
    //NO-Arg Constructor
    NoArgConstructor(){
    	System.out.println("No arg Constructor called");
    	
    	id=101;
    	name="Venkata Reddy";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		//Below object is created with the help of "No-Argument constructor".
		//Here Java compiler does not create default constructor because our class contains no arg constructor.
		NoArgConstructor n=new NoArgConstructor(); //object creation
        System.out.println(n.id);
        System.out.println(n.name);
	}

}
