package com.javaintroduction;

//Class name,super class name(every class name extends from object class) and static related data is storing it into method area.
//class Metadata(data about the data) is also storing it into method area.
//Metadata means all the data related to class is called metadata.
//ex:package name,class name are the examples of metadata.
public class Variables {
    
	//static data loaded and stored into the method area when the class is loading.
	static String name;
	
	//instance data loaded and stored into the heap area when we create an object.
	String name1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//intialization of static variable
		name="vcube";
		
		//accessing of static variable,we can access directly or by using class name.
		System.out.println(name);
		
		//intialization of instance variable
		//for  intialization of instance variable and accessing the instance variable,we have to create a object.
		Variables v=new Variables();
		v.name1="vc";
		System.out.println(v.name1);
	}

}
