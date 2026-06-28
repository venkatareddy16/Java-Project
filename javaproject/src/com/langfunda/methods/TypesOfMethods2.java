package com.langfunda.methods;
import java.util.Scanner;
public class TypesOfMethods2 {
    void getName(String s) {
    	System.out.println("Name of the Empolyee: "+s);
    }
    void getAge(int a) {
    	System.out.println("Age of Employee: "+a);
    }
    void getSalary(float b) {
    	System.out.println("Salary of Employee: "+b);
    }
    void getIncome(double d) {
    	System.out.println("Total Income of Employee: "+d);
    }
    void isSatisfied(boolean boo) {
    	System.out.println("Satisfaction of Employee: "+boo);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//TypesOfMethods3 m=new TypesOfMethods3();
		Scanner sc=new Scanner(System.in);
		//String using scanner
		String s=sc.next();
		TypesOfMethods2 m=new TypesOfMethods2();
		m.getName(s);
		
		//int using scanner
		int a=sc.nextInt();
		m.getAge(a);
		
		//float using scanner
		float b=sc.nextFloat();
		m.getSalary(b);
		
		//double using scanner
		double d=sc.nextDouble();
		m.getIncome(d);
	
		//boolean using scanner
		boolean boo=sc.nextBoolean();
		m.isSatisfied(boo);
		
		//char using scanner
		char ch=sc.next().charAt(0);
		System.out.println("character is :"+ch);
		
		//byte using scanner
		byte by=sc.nextByte();
		System.out.println("Byte is :"+by);
		
		
		//short using scanner
		short sh=sc.nextShort();
		System.out.println("short is :"+sh);
		

	}

}
