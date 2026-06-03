package com.langfunda;

public class TestUserDefinedTypeStudent {
	public static void main(String[] args) {
		System.out.println("main method started");
		Student s=new Student();
		s.id=16;
		s.name="Venkata Reddy";
		System.out.println(s.id);
		System.out.println(s.name);
	}

}
