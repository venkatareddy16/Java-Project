package com.langfunda.constructors;

public class Car {
	String brand;
	String model;
	int year;
	String color;
	double price;
    public Car(String brand,String model){
    	System.out.println("2-arg constructor called");
    	this.brand=brand;
    	this.model=model;
    }
    public Car(){
    	System.out.println("no arg constructor");
    	brand="unknown";
    	model="unknown";
    	year=2005;
    	color="red";
    	price=57.0;
    	
    }
    void carInfo() {
    	System.out.println("Brand of the car : "+brand);
    	System.out.println("model of the car : "+model);
    	System.out.println("year of the car : "+year);
    	System.out.println("color of the car : "+color);
    	System.out.println("price of the car : "+price);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Car c1=new Car("Kia","Sonet");
		c1.carInfo();
	
		//Q//Why we need No-arg constructor instead of java compiler provides default constructor.
		//2.Ans2:In this case or program,we created para-construtor then Complier generates an error that is Car() is undefined
		//because java complier does not creates a default constructor to our class,because already para-construcotr is there in our class.
		//That why we need a No-arg constructor instead of java compiler provides default constructor.
		Car c2=new Car();
		c2.carInfo();

	}

}
