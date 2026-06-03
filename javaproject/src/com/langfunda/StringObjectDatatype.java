package com.langfunda;
//String is a Normal Object Data Type we can create in multiple ways:
//Like String Literals,String with objects and so on..
//it means collection of characters with double quotes store it into single variable.
public class StringObjectDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Venkata Reddy";  //String Literals  --> stored in (scp)string constant pool.
		String s1="Venkata Reddy";  //String Literals --> stored in (scp)
		
		String s2=new String("Venkata Reddy"); //String new object with literal-->stored in heap area.
		String s3=new String("Venkata Reddy"); //String new object with literal-->stored in heap area.
		
		//s and s1 are string literals with same string names that creates only one object in scp(sub of heap).
		//this two references s ans s1 referencing that one object only.
		System.out.println(s==s1);//true
		
		//s is string literal and s1 is string object with literal with same string names that creates different objects, one in scp(sub of heap) and other is in heap area.
		System.out.println(s==s2);//false
		
		//s2 and s3 are string object with literal with same string names that creates two different objects,both in heap area separately.
		System.out.println(s2==s3);//false

		String s4=new String("Santhosh");//this object is created in the heap area and as well as ,if this string name is not there in scp,then in scp alsonew object created for this string santhosh.
		//then there is 2 objects created at a time
		
		String s5="santhosh";//it is referenced to already created object for string santhosh in scp.so, zero(0) objects created.
		
		System.out.println(s4==s5);//false
		
		String s6=s4;//Re-assigning of object references.then s4 data stored to s6 and we can say s4==s6.
		
		System.out.println(s4==s6);//true
		
		//if we want to check the content of two strings are same or not
		System.out.println(s.equals(s1));
	}

}
