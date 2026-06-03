package com.langfunda;

public class TypesVariables1 {
    //primitive+instance
	int id;
	
	//object+instance
	String name;
	
	//primitive+static
	static int countryid=91;
	
	//object+static
	static String countryname="india";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesVariables1 t1=new TypesVariables1();
		
		t1.id=16;
		t1.name="Venkata Reddy";
		//Acessing the instance data by using the object refernece variable.
		System.out.println(t1.id);
		System.out.println(t1.name);
		
		//accessing the static data directly
		System.out.println("***********Directly************");
		System.out.println(countryid);
		System.out.println(countryname);
		
		//accessing the static data by using the class name
		System.out.println("**********class name*************");
		System.out.println(	TypesVariables1.countryid);
		System.out.println(	TypesVariables1.countryname);
		
		//Acessing the static data by using the object refernece variable.
		System.out.println("**********obj ref variable*************");
		//warning:The static field TypesVariables1.countryid should be accessed in a static way
		System.out.println(	t1.countryid);
		System.out.println(	t1.countryname);
		
		//null dot(.) anything is NPE(NullPointerException)
		//Warning is showed because,even though the obj is null,There is no impact on static data
        //that's why we should access static data by using class name.
		TypesVariables1 t2=null;
		//System.out.println(t2.id); //runtime error:NullPointerException//instance data can impact when the obj is null.
		System.out.println(t2.countryid);
		System.out.println(t2.countryname);
		

	}

}
