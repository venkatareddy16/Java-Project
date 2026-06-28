package com.langfunda.constructors;

// What is Constructor Overloading?
//Constructor with Different arguments like no arg,1-arg,2-arg,4-arg in one class will consider as Constructor Overloading.
public class BikeParaConstructor {
	
	String model;
	String brand;
	double price;
	int milage;
	
	//No Arg Constructor
	BikeParaConstructor(){
		System.out.println("No arg construtor called");
		model="unknown";
		brand="unknown";
		price=10000.0;
		milage=50;
	}
	
	//use of this keyword : this is a keyword to invoke current class object data members.
	//why this keyword:we need to keep this keyword for better Readability, Maintenance & Flexibility.
	//4-arg parameterized constructor
	BikeParaConstructor(String model,String brand,double price,int milage){
		System.out.println("4-Parametermized construtor called");
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.milage=milage;
	}
	
	//2-arg parameterized constructor
	BikeParaConstructor(String model,String brand){
		System.out.println("2-Parametermized construtor called");
		this.model=model;
		this.brand=brand;
	}
    //Even though if we keep,different names for arguments,it works but its not better way of coding.
	//We should follow coding ethics.Thats why arguments &instance variable names must be same and we need to call instance variables with "this" keyword.
//	BikeParaConstructor(String m1,String b1){
//		System.out.println("2-Parametermized construtor called");
//		model=m1;
//		brand=b1;
//	}
	
   void bikeInfo() {
	   System.out.println("model of bike: "+model);
	   System.out.println("Brand of bike: "+brand);
	   System.out.println("Price of bike: "+price);
	   System.out.println("Milage of bike: "+milage);
	   System.out.println("-------------------------");
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		BikeParaConstructor b1=new BikeParaConstructor();
		b1.bikeInfo();
		
		BikeParaConstructor b2=new BikeParaConstructor();
		b2.bikeInfo();
		
		BikeParaConstructor b3=new BikeParaConstructor("Classic","RE",300000.00,70);
		b3.bikeInfo();
		
		BikeParaConstructor b4=new BikeParaConstructor("FZ-s","Yamaha");
		b4.bikeInfo();
		
		
		

	}

}
