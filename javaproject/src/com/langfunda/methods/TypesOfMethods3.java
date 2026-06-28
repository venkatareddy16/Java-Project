package com.langfunda.methods;
import java.util.Scanner;
//WAP To find the total salary + bonus + gst as different methods
public class TypesOfMethods3 {
    Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		TypesOfMethods3 t1=new TypesOfMethods3();
		double salary=t1.getSalaryInfo();
		double bonus=t1.getBonusInfo();
		double gst=t1.getGST();
 
		System.out.println("Total Salry is : "+(salary+bonus+gst));
	}
	//method with no arguments and with return type
	double getSalaryInfo() {
		System.out.println("Enter salary: ");
		double sal=sc.nextDouble();
		return sal;
	}
	
	double getBonusInfo() {
		System.out.println("Enter bonus: ");
		double bo=sc.nextDouble();
		return bo;
	}
	
	double getGST() {
		System.out.println("Enter gst: ");
		double gst=sc.nextDouble();
		return gst;
		
	}

}
