package com.javaintroduction;
//static blocks are loading automatically when the class is loading and executed
//instace blocks are loading automatically when the object is created 
//static blocks are loaded or stored  into the method area
//instance blocks are loaded or stored into the heap area

//static blocks loads and executes first before the main method.
//but before loading static block,JVM checks whether the main method is available or not.
//if main method is available then only static block executes first and then main method executes.
//even though static blocks executes first,main method should be there in the java programs.
//without the main method,java programs will not execute


//when the object is created inside the class ,not in the main method or static method,then it is considered as instance variable.
//when we keep static before this object creation then it is considered as static object reference variable.

//if we have static variable & static block,it executes in order wise based on which comes first.

//we cannot use same object ref variable two times for object creation in same method.
//we can use same object ref variable for object creation in different methods.
public class Blocks {
	//Blocks b=new Blocks(); //it is considered as instance variable
	//static Blocks b2=new Blocks();//it is considered as static object refer variable.
	//here object ref variable  b2 is in static and it stored in method area.
	//here new Blocks() is a object creation and it is stored in heap area.
	
	static {
		System.out.println("static block loaded");
		Blocks b2=new Blocks();//instance block loaded
		//Blocks b2=new Blocks();
	}
	
	static Blocks b2=new Blocks();
	
	//to load and execute , we have to create an object before loading the instance block
	{
		//Blocks b1=new Blocks();
		System.out.println("instance block blocked");
		//Blocks b2=new Blocks();
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Blocks b2=new Blocks();//after object creation,instance block loaded
		
	}

}
 