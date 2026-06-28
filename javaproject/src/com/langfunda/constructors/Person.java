package com.langfunda.constructors;
        //by default  super class no arg construtor called for every construtor in sub-class.
		//If we are calling any super class other construtor, super() does not called.
        //case 1:
		/*If we are not calling any other constructor from parent,
		 * by default every constructor in sub class calls super class no arg constructor(super()),
		 * if that no-arg constructor is not there in parent class and other constructor in parent class is there,
	     * then we cannot create this sub class no arg constructor and in sub class other para constructor is there or created.
		 * error:Implicit super constructor Human() is undefined. Must explicitly invoke another constructor
		 */

        //case2:
        /*In parent class there is only para constructor,then in child there is no other explicit constructor created,
         * then here java compiler does not creates default constructor implicitly because in parent class there is no no-arg or 
         * default to call super() in sub class,then the compiler generates an error for sub class because there is no explicit or
         * implicit constructor,every class should contains atleast one constructor(directly or indirectly)
         * error:Implicit super constructor Human() is undefined for default constructor. Must define an explicit constructor. 
         */
class Human {
    String name;
    String city;
    public Human() {
    	System.out.println("human class no arg constructor called");
    }
    public Human(String name, String city) {
    	//super();
    	System.out.println("human class 2-arg constructor called");
    	this.name = name;
    	this.city = city;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("human class main method started");

	}
}

public class Person extends Human {
	String name;
	String city;
	public Person() {
		//super();  //implictly it is called when we dont call any other constructor from parent class.
		System.out.println("person class no arg constructor called");
	}
    public Person(String name, String city) { 
     //calling 2-arg parent class constructor in child class 2-arg constructor.
	  super(name,city);
      System.out.println("person class 2-arg construtor called");
    }
	
    void personInfo() {
    	System.out.println(super.name);
		System.out.println(super.city);
    }
	
	public static void main(String[] args) {
		System.out.println("person class main called");
		
		Person p=new Person();
		p.personInfo();
		
		System.out.println("**************************");
		
		Person p1=new Person("Venkata Reddy","hyd");
		p1.personInfo();
		
		
	}

  
} 
