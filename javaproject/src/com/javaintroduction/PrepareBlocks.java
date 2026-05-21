package com.javaintroduction;
//prepare example program and it is a part of class loader subsystem
//prepare is helping to load static related data or varibles and load the  static block info.
//it is helping to intialize with default values for static data.
public class PrepareBlocks {
    static String o_name;  //prepare provide default values for this. 
    static  { 
    	System.out.println("static block loaded1 "+o_name);
    }
    static String org_name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		org_name="vcube"; //Intialization example
		System.out.println(org_name);
		System.out.println("main method ended");
	}
	static {
    	System.out.println("static block loaded2 " +org_name);
    }

}
