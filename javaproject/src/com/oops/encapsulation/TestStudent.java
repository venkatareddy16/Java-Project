package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		//current class object creation
		TestStudent t=new TestStudent();
		//current class object ref returning the toString() method of object class
		System.out.println(t);  //or t.toString()
		
		//Encapsulated class object creation
		Student s=new Student();
		//modifying or reassigning the data using setters.
		s.setStno(16);
		s.setSname("Venkata Reddy");
		s.setAge(21);
		//retrieve the data using getters.
		System.out.println(s.getStno());
		System.out.println(s.getSname());
		System.out.println(s.getAge());
		
		//encapsulated class object ref returning the toString() method that is overidden from the object class.
		System.out.println(s);
		System.out.println("*************************************");
		Student s1=new Student(1,"Venkata Reddy",21);
		System.out.println(s1);

		
	}

}
