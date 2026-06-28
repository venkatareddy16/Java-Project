package com.langfunda.constructors;
//parent or super or class
class Product{
	int id;
	String name;
	String model;
	double price=10000.0;
	
	public Product(int id, String name, String model, double price) {
		//super();
		System.out.println("super class 4 arg constructor called");
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public Product() {
		System.out.println("super class no-arg construtor called");
	}
	public Product(int id, String name) {
		
		System.out.println("super class 2-arg constructor called");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started1");

	}
}

//child or sub or derived
public class Mobiles1super extends Product {
	int id;
	String name;
	String model;
	double price=50.0;
	
   public Mobiles1super(int id, String name, String model, double price) { // TODO
	  //calling parent class no-arg construtor in sub class 4-arg construtor.
	  super();
	  System.out.println("sub 4-arg constructor called"); 
	  this.id=id; 
	  this.name=name;
	  this.model=model; 
	  this.price=price; 
   }
	 

	public Mobiles1super() {
		//calling sub class 2-arg constructor in current class no-arg constructor
		this(1,"readme");  //or by default super() is there.
		System.out.println("sub No arg constructor called");
	
	}
	
	
	public Mobiles1super(int id, String name) {
		//calling super class 4-arg construtor in 2-arg sub constructor.
		super(id, name,"oneplus",30000.0);
		System.out.println("sub 2-arg constructor called");
	
	}


	public Mobiles1super(int id, String name, String model) {
		//calling 2-arg parent class constructor in 3-arg sub class constructor.
		super(id,name);
		System.out.println("sub 3-arg construtor called");
		//this.id = id;
		//this.name = name;
		this.model = model;
	}

	//this & super keyword we can use in inside instance area only like instance methods or instance blocks or constructors.
	//we cannot use in static area like static methods or static blocks.
	void mobileInfo() {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.model);
		System.out.println(super.price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Mobiles1super m=new Mobiles1super();
		m.mobileInfo();
		System.out.println("*******************************");
		Mobiles1super m1=new Mobiles1super(2,"realme","narzo");
		m1.mobileInfo();
		System.out.println("*******************************");
		Mobiles1super m2=new Mobiles1super(1,"samsung","mol",50000.0);
		m2.mobileInfo();
//		
	}

}
