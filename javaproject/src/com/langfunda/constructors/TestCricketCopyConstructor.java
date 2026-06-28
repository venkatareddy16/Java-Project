package com.langfunda.constructors;
//This program involves copy constructor and constructor chaining
//here we are using constructor chaining in copy constructor.
public class TestCricketCopyConstructor {
    int jno;
    String name;
    double salary;
    int age;
    
    //no arg
    public TestCricketCopyConstructor() {
    	//calling 1-arg constructor in no-arg constructor
 	   System.out.println("no arg construtor called");
    }
    
    public TestCricketCopyConstructor(TestCricketCopyConstructor t1) {
		System.out.println("copy constructor called");
	}
  
   //1-arg
    public TestCricketCopyConstructor(int jno) {
		System.out.println("1-arg construtor called");
		this.jno=jno;
	}
	
    //3 arg
	public TestCricketCopyConstructor(TestCricketCopyConstructor t, String name) {
	  // TODO Auto-generated constructor stub
		System.out.println("2-arg construtor called");
	    this.jno=t.jno;
	    this.name=name;
		
}
	//4-arg
	public TestCricketCopyConstructor(TestCricketCopyConstructor t,double salary) {
		  // TODO Auto-generated constructor stub
			System.out.println("3-arg construtor called");
		    this.jno=t.jno;
		    this.name=t.name;
		    this.salary=salary;
	}
	
	public TestCricketCopyConstructor(TestCricketCopyConstructor t,int age) {
		  // TODO Auto-generated constructor stub
			System.out.println("4-arg construtor called");
		    this.jno=t.jno;
		    this.name=t.name;
		    this.salary=t.salary;
		    this.age=age;
	}

	

	void testcricketInfo() {
    	System.out.println("jersey number is :"+jno);
    	System.out.println("cricketer name is :"+name);
    	System.out.println("cricketer salary is :"+salary);
    	System.out.println("Age is :"+age);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//no arg
		TestCricketCopyConstructor t1=new TestCricketCopyConstructor();
		t1.testcricketInfo();
		System.out.println("****************************");
		
		TestCricketCopyConstructor t=new TestCricketCopyConstructor(t1);  //copying t1 obj ref variable to new object as an argument.
		t.testcricketInfo();
		System.out.println("****************************");
		
		//1-arg
		TestCricketCopyConstructor t2=new TestCricketCopyConstructor(30);
		t2.testcricketInfo();
		
		System.out.println("****************************");
		

		TestCricketCopyConstructor t3=new TestCricketCopyConstructor(t2,"pat cummins");
		t3.testcricketInfo();
		
		System.out.println("****************************");

		TestCricketCopyConstructor t4=new TestCricketCopyConstructor(t3,100000.0);
		t4.testcricketInfo();
		
		System.out.println("********************************");
		
		TestCricketCopyConstructor t5=new TestCricketCopyConstructor(t4,32);
		t5.testcricketInfo();
		
		
		

	}

}
