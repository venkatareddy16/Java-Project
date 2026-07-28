package com.oops.encapsulation;
//fully encapsulated class
public class Student {
    //1.private data members
    private int stno;w
    private String sname;
    private int age;
    
    //2.public setters and getters
	public int getStno() {
		return stno;
	}
	public void setStno(int stno) {
		this.stno = stno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//3.toString() method override from object class
	@Override
	public String toString() {
		
       return "Student Info:[Student No: "+stno+", Student Name: "+sname+", Student Age: "+age+" ] ";
	}
	
	//4.no-arg constructor
	public Student() {
		System.out.println("No arg Student constructor called");
	}
	
	//5.all-arg constructor
	public Student(int stno, String sname, int age) {
		//super();
		this.stno = stno;
		this.sname = sname;
		this.age = age;
	}
	

}
