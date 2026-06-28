package com.langfunda.constructors;
//Note:In parent class there is only para constructors and in child class there is no explicit constructors
//here,java compiler does not implicitly creates default constructor for child class,
//because in parent class there is no default or no-arg constructor for calling super() in sub class by default.
//then gets an error under the child class name
//c error:Implicit super constructor Vehicle() is undefined for default constructor. 
//c error:Must define an explicit constructor.
class Vehicle1{
	public Vehicle1() {
		System.out.println("vehicle1 class no arg called");
	}
	
}
public class Vehicle extends Vehicle1{
	String brand;
	String model;
    
	public Vehicle() {
		//super();
		System.out.println("vehicle class no arg called");
	}
	public Vehicle(String brand, String model) {
		super(); //this belongs to object class no-arg constructor,in that there nothing to print. 
		this.brand = brand;
		this.model = model;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Vehicle main started");
	}

}

class Car1 extends Vehicle{
	String brand;
	String model;
	public Car1(){
		//super();
		System.out.println("car1 class no arg called");
	}
	void carInfo() {
		System.out.println(model);
		System.out.println(brand);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("car1 main started");
		Car1 c1=new Car1();
		c1.carInfo();
		

	}
	
}
