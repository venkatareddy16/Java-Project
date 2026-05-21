package com.javaintroduction;
// Example program to understand the static variables and instance variables

//when the data is changing from object to object then we can go and keep instance for those data.
//when the data is not changing from object to object then we can go and keep that data as static data.
//for instance data,new copy is created for every object
//for static data,new copy is not created for every object
//for static data,copy is same for every object
//we can update the static data in future whenever it required.
//for final data ,we cannot update the data in future whenever it required.
//final data is also considered as static data
//static data is not considered as final data
//If we keep data as final, then we should intialize value  in the declaration only. 
//
//static data is loading when the class is loading and it is storing  into method area
//instance data is loading when the object is creating and it is storing into heap area
public class CricketVariables {
	//declaration
	
	//instance data
	int jno;
	String name;
			
	//static data
	static int countryid;
	static String countryname;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indian Cricket Team Information");
		//JVM will provide default values for static and instance data when there is no intialization for static and instance data.
		
		//Object 1 information 
		//Accessing the instance data
		//if we want to access the instance data in the static area,we cannot access directly 
		//cannot make a static reference to the non-static field (or) state are jno,name.
		//we need to create an object and by using the object reference variable ,we can access the instance data inside the static area
		CricketVariables msd=new CricketVariables();
		//here LHS: Cricketer is a class name
		//here c is a object reference variable
		//new is a java keyword to create object
		//Cricket() is a constructor calling 
		//RHS is a object creation that we are storing it into a (c) reference variable   
		
		//Intialization or reassigning for static data
		//it is same for all objects until we update the new names
		countryid=91;
		countryname="India";
					 
		//Accessing the static data
		//if we want to access the static data in the static area,we access directly without creating an object
		System.out.println(countryid);
		System.out.println(countryname);
		
		//Intialization for instance data
		//it is different from object to object
		msd.jno=7;
		msd.name="dhoni";
		System.out.println(msd.jno);
		System.out.println(msd.name);
		
		//Object 2 information
		CricketVariables pat=new CricketVariables();
		
		
		System.out.println(countryid);
		System.out.println(countryname);
		
		pat.jno=30;
		pat.name="Patcummins";
		System.out.println(pat.jno);
		System.out.println(pat.name);
		
		//Object 3 information
				CricketVariables kl=new CricketVariables();
				
				countryid=92;
				countryname="bharath";
				
				System.out.println(countryid);
				System.out.println(countryname);
				
				kl.jno=1;
				kl.name="klrahul";
				System.out.println(kl.jno);
				System.out.println(kl.name);
		

	}

}
