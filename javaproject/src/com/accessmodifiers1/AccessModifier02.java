package com.accessmodifiers1;

public class AccessModifier02 {

	public static void main(String[] args) {
		System.out.println("main method started");
		//we can create an object of one class in another class within the same same package
		System.out.println("***********Acessing the private data of one class in our class within the same package******************");
		//1.//calling the private no-arg constructor of one class in another class within the same package
		//AccessModifier01 p=new AccessModifier01(); //is not possible to call
		//System.out.println("Accessing the private data");
		
	    //2.//accessing the private variable of one class in another class within the same package
		//System.out.println(p.stno);  //is not possible to access
		//System.out.println(p.name);  //is not possible to access
	
		//3.//calling the private method of one class in another class within the same package
		//p.display(); //is not possible to call
         
		System.out.println("***********Acessing the default data of one class in our class within the same package******************");
		//1.//calling the default scope no-arg constructor of one class in another class within the same package
		AccessModifier01 p=new AccessModifier01(); //is possible to call
		//1.//calling the default scope variable of one class in another class within the same package
		System.out.println(p.stno1);//is possible to access
		System.out.println(p.name1);//is possible to access
		//3.//calling the default scope method of one class in another class within the same package
		p.display1();//is possible to call
		
		System.out.println("***********Acessing the public data of one class in our class within the same package******************");
		//1.//calling the default scope no-arg constructor of one class in another class within the same package
		AccessModifier01 p1=new AccessModifier01(); //is possible to call
		//1.//calling the default scope variable of one class in another class within the same package
		System.out.println(p1.stno5);//is possible to access
		System.out.println(p1.name5);//is possible to access
		//3.//calling the default scope method of one class in another class within the same package
		p1.display2();//is possible to call
		
		System.out.println("***********Acessing the protected data of one class in our class within the same package******************");
		//1.//calling the default scope no-arg constructor of one class in another class within the same package
		AccessModifier01 p2=new AccessModifier01(); //is possible to call
		//1.//calling the default scope variable of one class in another class within the same package
		System.out.println(p2.stno7);//is possible to access
		System.out.println(p2.name7);//is possible to access
		//3.//calling the default scope method of one class in another class within the same package
		p1.display2();//is possible to call
		
		
		
		

	}

}
