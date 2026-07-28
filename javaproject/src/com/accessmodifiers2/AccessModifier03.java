package com.accessmodifiers2;

//importing one package class in our package class and that importing class from another package should be in public.
import com.accessmodifiers1.AccessModifier01;  //fully qualified name of a class.(package name followed by class name).

public class AccessModifier03 extends AccessModifier01{
	protected AccessModifier03(){
		//super(); by default it is called
		System.out.println("sub class protected scope contructor called");
	}
	public static void main(String[] args) {
		System.out.println("***********Acessing the default data of one package class in outside package class******************");
		//1.//calling the default scope no-arg constructor of one class in another class within the same package
		//AccessModifier01 p=new AccessModifier01(); //is possible to call
		//1.//calling the default scope variable of one class in another class within the same package
		//System.out.println(p.stno1);//is possible to access
		//System.out.println(p.name1);//is possible to access
		//3.//calling the default scope method of one class in another class within the same package
		//p.display1();//is possible to call
		
		System.out.println("***********Acessing the public data of one package class in outside package class******************");
		//1.//calling the public scope no-arg constructor of one class in another class within the same package
		//AccessModifier01 p1=new AccessModifier01(); //is possible to call
		//1.//calling the public scope variable of one class in another class within the same package
		//System.out.println(p1.stno5);//is possible to access
		//System.out.println(p1.name5);//is possible to access
		//3.//calling the public scope method of one class in another class within the same package
		//p1.display2();//is possible to call
		
		System.out.println("***********Acessing the protected data of one package class in outside package class******************");
		//1.//calling the protected scope no-arg constructor of one class in another class within the same package
		//AccessModifier01 p2=new AccessModifier01(); //is not possible to call because this class is in protected.
		//we have to extends this above class to our class then we create object for class then we call protected data by using our class obj ref.
		AccessModifier03 p3=new AccessModifier03();  //sub class object reference.
		//1.//calling the protected scope variable of one class in another class within the same package
		System.out.println(p3.stno7);//is possible to access by sub class(our class) obj ref only,we can access.
		System.out.println(p3.name7);//is possible to access by sub class(our class) obj ref only,we can access.
		//3.//calling the protected scope method of one class in another class within the same package
		p3.display3();//is possible to call by sub class(our class) obj ref only,we can access.
	}

}
