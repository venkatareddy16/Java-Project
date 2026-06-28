package com.langfunda.methods;
import java.util.Scanner;
public class AreaOfTypes {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		AreaOfTypes a=new AreaOfTypes();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		System.out.println("Area of Traiangle is: "+a.getAreaTriangle(b, h));
		
		double s=sc.nextDouble();
		System.out.println("Area of Square is: "+a.getAreaSquare(s));
		
		double l=sc.nextDouble();
		double br=sc.nextDouble();
		System.out.printf("Area of Rectangle is: %.2f\n",a.getAreaRectangle(l,br));//rounds up to two decimal places whether it is float or double value
		
		double r=sc.nextDouble();
		System.out.println("Area of circle is: "+a.getAreaCircle(r));
		
		System.out.println("main method ended");

	}
	double getAreaTriangle(double b,double h) {
		double area=0.5*b*h;
		return area;
	}
	double getAreaSquare(double s) {
		double area=s*s;
		return area;
	}
	double getAreaRectangle(double l,double b) {
		double area=l*b;
		return area;
	}
	double getAreaCircle(double r) {
		double area=Math.PI*r*r;  //Math is built-in java class from java.lang package
		//PI is a Static method in Math class.
		return area;
	}

}
