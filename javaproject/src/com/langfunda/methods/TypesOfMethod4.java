package com.langfunda.methods;
import java.util.*;
class Student{
	int id;
	String name;
	double marks;
	String college;
	String dept;
}
public class TypesOfMethod4 {
	Scanner sc=new Scanner(System.in);
	//this method is called factory method
	//A method which return object is called factory method
    Student getStudentInfo() {
    	Student st=new Student();
    	st.id=sc.nextInt();
    	sc.nextLine();
    	st.name=sc.nextLine();
    	st.marks=sc.nextDouble();
    	sc.nextLine();
    	st.college=sc.nextLine();
    	st.dept=sc.nextLine();
    	return st;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main method started");
        TypesOfMethod4 t1=new TypesOfMethod4();
        Student s=t1.getStudentInfo();
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println(s.college);
        System.out.println(s.dept);
	}

}
