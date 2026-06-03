package com.langfunda;
//JVM will default values as null for wrapper object datatypes when we declare that wrapper object datatypes as instance or static not local data.
//wrapper object data types:Byte,Short,Integer,Long,Float,Double,Character,Boolean.
public class WrapperObjectDatatypes {
	//Note:Auto Boxing & Un boxing came from Java 1.5 version,Before that we are doing the conversion like below:
	//- Integer x=Integer.valueOf(int values):Auto Boxing and in that () we write int values or string data.
	//- int i2=x.intValue()      :Auto un boxing
	Integer x=Integer.valueOf(100);//before 1.5 version //this valueOf() method(static method) takes string and int values also to convert to Integer object data type.
	int i2=x.intValue();//before 1.5 version
    //Auto-Boxing:Converting the primitive data types to wrapper object data types then will consider as Auto-Boxing.
	//ex:int to Integer.
	Integer i=100;  //here rhs value is int type convert to lhs Integer object data type(lhs value).
	
	//Auto-UnBoxing:Converting the primitive data types to wrapper object data types to primitive data types then will consider as Auto-UnBoxing.
	//ex:Integer to i;.
	int i1=i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//asseccsing the primitive and wrapper object
		WrapperObjectDatatypes o=new WrapperObjectDatatypes();
		System.out.println(o.x);
		System.out.println(o.i2);
		System.out.println(o.i);
		System.out.println(o.i1);

	}

}
