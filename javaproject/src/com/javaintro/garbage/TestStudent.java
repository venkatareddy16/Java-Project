package com.javaintro.garbage;
class Student{
	int sid;
	String  sname;
}

//Driver class
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		Student s1=new Student();
		System.out.println(s1);
		
		Student ref=new Student(); //object creation in the heap memory
        System.out.println(ref);  //Reference is address (or) identity  of the object
        //here address is hexa-decimal value of the hash code
        
        int a=0x79fc0f2f;  //if we want integer value from hexa-decimal value,we have to keep (0x) before the hexa-decimal value and store it in int datatype variable..
        System.out.println(a);  //this integer value(decimal value) is called hashcode.
       
        //if we can to print the hashcode directly without hexadecimal value.
        System.out.println(ref.hashCode());   //hashCode() is called from the parent object class for this Student class.
        
        //output of Address (ex:ref) of an object is hexa-decimal value of hash-code.
        //Address of an object contains:Fully qualified name of a class + hexa-decimal value of hashcode.
        //here fully qualified name of a class contains package name+class name.
	}

}
