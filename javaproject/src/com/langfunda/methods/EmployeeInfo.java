package com.langfunda.methods;
import java.util.Scanner;
//InputMismATCHeXCEPTION is from java.util package.
public class EmployeeInfo {
    //EmployeeInfo e1=new EmployeeInfo();  //it is considered as instance variable (e1) //e1 and new EmployeeInfo() stored in heap area.
   // static EmployeeInfo e2=new EmployeeInfo(); //it is considered as static object reference variable(e2)//e2 stored in method area and new EmployeeInfo() stored in heap area.
	public static void main(String[] args) {
		EmployeeInfo b =new EmployeeInfo();
		// TODO Auto-generated method stub
		System.out.println("Welcome to Vcube Organization");
        //System.out.println(b.e1);
        //System.out.println(e2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		b.getAge(age);
		
		System.out.println("Enter org name:");
		sc.nextLine(); //we write this after writing int,float,double,char inputs before nextLine() string name.
		String name=sc.nextLine();
		b.getOrgName(name);
		
		System.out.println("Enter your full name:");
		String fullname=sc.nextLine();
		b.getFullName(fullname);
		
		System.out.println("Enter your height");
		float height=sc.nextFloat();
		
		System.out.println("Enter your weight");
		double weight=sc.nextDouble();
		
		b.heightAndWeight(height,weight);
		
		System.out.println("Enter gender:");
		char c=sc.next().charAt(0);//method chaining
		b.getGender(c);
		
		System.out.println("Enter your sal:");
		double sal=sc.nextDouble();
		b.getEmpSalInfo(sal);
		
		System.out.println("Enter city");
		String city=sc.next();
		b.getEmpCurrentCity(city);
		
	}
	
	//method with arguments and no return type
	void getAge(int age) {
		System.out.println("Age is: "+age);
	}
	void getOrgName(String name) {
		System.out.println("Organization name is : "+name);
	}
	void getFullName(String fullname) {
		System.out.println("Full Name of the Employee: "+fullname);
	}
	void heightAndWeight(float h,double w) {
		System.out.println("Employee height is :"+h);
		System.out.println("Employee weight is :"+w);
		
	}
	void getGender(char c) {
		System.out.println("Gender is: "+c);
	}
	
	void getEmpSalInfo(double sal) {
		System.out.println("Employee Salary is: "+sal);
	}
	
	void getEmpCurrentCity(String city) {
		System.out.println("Current city is: "+city);
	}
	

}
