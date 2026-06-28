package com.langfunda.constructors;

public class ConstructorChainingCustomer {
   int id;
   String name;
   int age;
   String product;
   double price;
   String brand;
   public ConstructorChainingCustomer(){
	   //2-arg constructor called in no-arg constructor.
	   this(1,"venkata reddy");
	   System.out.println("no arg constructor called");
   }
   public ConstructorChainingCustomer(int id, String name) {
	this(id,name,25,"laptop");
	System.out.println("2-arg constructor called");
//	this.id = id;
//	this.name = name;
}
   
   public ConstructorChainingCustomer(int id, String name, int age, String product) {
	this(id,name,age,product,49000.0);
	System.out.println("4-arg constructor called");
//	this.id = id;
//	this.name = name;
//	this.age = age;
//	this.product = product;
}
   public ConstructorChainingCustomer(int id, String name, int age, String product,double price) {
	   this(id,name,age,product,price,"hp");
	   System.out.println("5-arg constructor called");
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.product = product;
//		this.price=price;
	}
   public ConstructorChainingCustomer(int id, String name, int age, String product,double price,String brand) {
	   
		System.out.println("6-arg constructor called");
		this.id = id;
		this.name = name;
		this.age = age;
		this.product = product;
		this.price=price;
		this.brand=brand;
	}
   void cusInfo() {
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(age);
	   System.out.println(product);
	   System.out.println(price);
	   System.out.println(brand);
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		ConstructorChainingCustomer c1=new ConstructorChainingCustomer();  //no arg constructor
		c1.cusInfo();
        System.out.println("**************************************");
		ConstructorChainingCustomer c2=new ConstructorChainingCustomer(2,"Rakesh");  //2-arg constructor
		c2.cusInfo();
		System.out.println("***************************************");
		ConstructorChainingCustomer c3=new ConstructorChainingCustomer(3,"Ramesh",26,"dell");  //4-arg constructor
		c3.cusInfo();
		System.out.println("******************************************");
		ConstructorChainingCustomer c4=new ConstructorChainingCustomer(4,"Rajesh",27,"lenovo",56000.0);  //5-arg constructor
		c4.cusInfo();
		System.out.println("*******************************************");
		ConstructorChainingCustomer c5=new ConstructorChainingCustomer(5,"Bhargav",28,"apple",70000.0);  //6-arg constructor
		c5.cusInfo();
		
	}

}
