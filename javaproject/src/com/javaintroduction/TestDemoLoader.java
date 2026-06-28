package com.javaintroduction;
//Example program for class loader subsystem of jvm
//(i)->bootstrap class loader
//->it is the first class loader in java and it responsible for loading core java classes required to run java applications.
//-> here in the below class three classes are there
//-> String , System are predefined core java classes from java.lang package and TestDemoLoader is orginal class
//->java.lang is the default package,we no need to import the classes from java.lang package
//-> These predefined classes are loading with the help of bootstrap class loader
//-> bootstrap class loader is loading the classes from root folder.
//-> here root folder found  from (c-drive->program files->java->jdk-25)or(JAVA_HOME)->lib in our system.
//-> root folder found from JAVA_HOME->lib
//->bootstrap class loader is loading the classes from JAVA_HOME->lib.
//-> it also loads core java packages like:java.lang.*;
//java.uitl.*;
//java.io.*;
//java.sql.*;
//it also load java classes explictly other than core java classes from javahome->lib folder into the current class.
//but it only load java classes or classes that are in java

//(ii)-> Extension class Loader
//->it is the second class loader in java and it responsible for loading additional core java classes required to run java applications in older versions of java
//->it is loading the classes from JAVA_HOME->lib->ext in older versions of java
//-> In present new versions of java, doesnot have ext folder in lib folder
//->In present new versions of java, all corejava classes are load from JAVA_HOME->lib root folder 

//(iii)->Application class Loader
//-> it is the third class loader in java and it responsible for loading the classes from class path environment.
//-> it load the classes that are not in java or outside the java by using the class path environment..

public class TestDemoLoader {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//example for bootstrap class loader
//		Class c3=Class.forName("C:\\Program Files\\Java\\jdk-25.0.3\\lib\\jawt.lib");
//		System.out.println(c3);
//		Class c2=Class.forName("com.javawork.Bank");
//		System.out.println(c2);
		Class c1=Class.forName("com.javaintroduction.Cricket");
		System.out.println(c1);
		
        
		//application class loader example
//		Class c1=Class.forName("com.mysql.cj.jdbc.admin");
//		System.out.println(c1);
		System.out.println("main method ended");
		
	}

}
