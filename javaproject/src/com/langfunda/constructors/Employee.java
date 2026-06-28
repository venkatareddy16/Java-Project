package com.langfunda.constructors;

public class Employee {

	int eid;
	String name;
	double salary;
	Employee(){
		System.out.println("no arg construtor called");
		eid=100;
		name="Venkata Reddy";
		salary=10000.00;
		
	}
	void show() {
		System.out.println("************************");
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method stared");
		
		Employee e1=new Employee();
		e1.show();
		
		Employee e2=new Employee();
		e2.show();
		
		Employee e3=new Employee();
		e3.show();
		
		
		System.out.println("main method ended");

	}

}
