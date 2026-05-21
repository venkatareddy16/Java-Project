package com.javaintroduction;
//here when we call the static methods or instance methods,execution of these methods are in stack area.
//these methods are excecuted in the stack area in  lifo(last in first out) order.

//we can call static methods inside the static area directly or by using the class name.
//we can call static methods inside the instance area directly.

//we can call instance methods inside the instance area directly
//we cannot call instance methods inside the static area directly,for this we need to create an object
//then we can call instance methods inside the static area by using the object reference variable.

//when we need to keep method as static and when we need to keep method as instance.
//whenever the behavior or function is same for all the objects then we can choose methods as static.
//whenever the behavior or function is not same or specific to the objects then we can choose those methods as instance.

//ex:Student
//behaviors : static :read() write() listen()
//             instance:singing() dance() playCricket()
public class StackAreaMethods {
    void welcome() {
    	System.out.println("welcome is called");
    	display();
    }
    static void hello() {
    	show();
    	System.out.println("hello is called");
    }
    void display() {
    	//hello();
    	//show();
    	System.out.println("display is called");
    	print();
    }
    static void print() {
    	System.out.println("print method is called");
    }
    static void show() {
    	StackAreaMethods m=new StackAreaMethods();
    	m.welcome();
    	System.out.println("show is called");
    }
	public static void main(String[] args) {
		System.out.println("main method started");
		//main method using one thread for execution process.
		//In stack area,the light weight execution process is considered as thread.
		//For every thread,there is a counter.The counter is considered as PC Register.PC stands for program counter.
		//In stack area, when we call the methods, methods are executed in lifo order.
		//Execution is done one after the other then it is called synchronous.
		//In multi-threading,we use mutiple threads for execution process.
		//But in Multi-threading,execution is done in parallel not in one after the other.
		System.out.println(Thread.currentThread());  
		hello(); //or by using StackAreaMethods.hello();
		System.out.println("main method ended");
		

	}

}
