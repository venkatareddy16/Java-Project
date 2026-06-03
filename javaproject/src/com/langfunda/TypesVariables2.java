package com.langfunda;
//local variables
public class TypesVariables2 {
    static int x=100;
  
//Runtime-error:Illegal modifier for parameter name; only final is permitted
//static variable is permittted only in class-level not in method level
//  static void hello() {
//    static String name="vcube";
//    System.out.println(name);
//  }
    //var i=10; //var is not allowed here in class level ,only in methods it allowed.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static String name2="Vcube"; //Illegal modifier for parameter name2; only final is permitted not permitted static variable in  methods(any methods).
		
		int a;
       //complie error:The local variable a may not have been initialized before displaying the a.
       //System.out.println(a); //complie time-error
		
		int x;
		x=10;
		System.out.println(x);//local variable
		System.out.println(TypesVariables2.x);

		var a1 = 16;
		var name1 = "Venkata Reddy";
		var gen = 'm';
		System.out.println(a1);
		System.out.println(name1);
		System.out.println(gen);
		//hello();
	}

}
