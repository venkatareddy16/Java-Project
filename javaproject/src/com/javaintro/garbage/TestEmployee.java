package com.javaintro.garbage;
//every class has object as a superclass.
//class object is the root  of the class hierarchy. 
//when we call gc method,internally finalize method will called by garbage collector.
//finalize method is a instance method from object class and it is protected.
//finalize method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
class Employee{
	int empid;
	String empName;
	
	Employee e;  //it is considered as instance variable.
	protected void finalize() {
		System.out.println("finalize method called");
	}
	
	void display() {
		Employee e5=new Employee();
		System.out.println("display method");
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		System.out.println(e1);  //object ref variable
		System.out.println(e2);
		System.out.println(e3);
		
		//1.nulifying the objects
		e1=null;
		
		//2.Re-assigning the objects
		Employee e4=new Employee();
		e4=e2;
			
		System.out.println(e2);
		System.out.println(e4);
		
		//3.Anonymous objects
		System.out.println(new Employee().empid);
		
		//4.object inside the method(object inside the scope)
		e2.display();
		
		//5.island of isolation
		Employee e6=new Employee();
		Employee e7=new Employee();
		Employee e8=new Employee();
		
		e6.e=e7;
		e7.e=e8;
		e8.e=e6;
		
		e6=null;
		e7=null;
		e8=null;
		
		//it purpose is to run the garbage collector in the java virtual machine.
		System.gc();
		
		System.out.println("main method ended");
 
	}

}
