package com.javaintroduction;
//static methods and instance methods example
public class Methods {
	//static method
    static void display() {
    	System.out.println("static method called");
    }
    
    //instance method
    void hello() {
    	System.out.println("instance method called");
    }
    //method name and args should not be same for two methods in a single class.
    //that means method signature should not be same  for two methods in a single class.
//    void hello() {
//    	
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//display();//static method can be call directly or by using the class name.
		Methods.display();
		
		//instance method cannot be called directly or by using the class name.
		//for this we need to create an object.
		//it can be called by using the object reference variable
		Methods m=new Methods();
		m.hello();
		

	}

}
