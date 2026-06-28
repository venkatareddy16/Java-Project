package com.operators;
//Instanceof operator
//It is used to check whether the obj ref variable is related to specific class object or parent class object.
public class InstanceofOperaotr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Integer i1=50;
		Integer i2=200; 
		Integer i3=null;
		String s=null;
		String s1="Venkata Reddy";
		InstanceofOperaotr a=new InstanceofOperaotr();
		System.out.println(i1 instanceof Integer);//true
		System.out.println(i1 instanceof Number);//true
		System.out.println(i1 instanceof Integer);//true
		System.out.println("***********************************");
		System.out.println(i2 instanceof Integer);//true
		System.out.println(i3 instanceof Integer);//false
		System.out.println("***********************************");
		System.out.println(s instanceof String);//false
		System.out.println(s1 instanceof String);//true
		 
		//CE:Incompatible conditional operand types InstanceofOperaotr and Integer
		//System.out.println(a instanceof Integer);// error
		
		//CE:Incompatible conditional operand types Integer and String
		//System.out.println(i1 instanceof String);
		
		//CE:Incompatible conditional operand types String and Integer
		//System.out.println(s1 instanceof Integer);
		

	}

}
