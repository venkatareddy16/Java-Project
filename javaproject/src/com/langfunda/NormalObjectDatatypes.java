package com.langfunda;
import java.math.BigDecimal;
import java.math.BigInteger;
//JVM will default values as null for object datatypes when we declare that object datatypes as instance or static not local data.
//Normal Object Datatypes are:ex:BigInteger,BigDecimal,String,System(already predefined class or object data type for print statements),Thread(we discuss in later concepts).
//now we want to discuss about BigInteger,BigDecimal,String.
public class NormalObjectDatatypes {
    String s;
    
    //BigInteger is used when the number size greater than long,then we use BigInteger.
    //we can store the value in string only inside the BigIntger.
    //ex:for multiply the two long values we use bigInteger,because the multiplication value is greater than long size.
    BigInteger b1=new BigInteger("278378497389474849849948");
    BigInteger b2=new BigInteger("384754985989923994844448");
    
    //BigDecimal is used when the decimal number size greater than double,then we use BigDecimal.
    //we can store the value in int,long,string and double also inside the BigDecimal.
    BigDecimal b3=new BigDecimal("278378497389.474849849948859598095809");
    BigDecimal b4=new BigDecimal(384754985989923994844.44828894587485848);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//we want to access the big integer and big decimal values,for that we have to create an object because the that data is instance data
		NormalObjectDatatypes o=new NormalObjectDatatypes();
		
		//add the two biginteger values
		System.out.println(o.b1.add(o.b2)); //we get another biginteger internally.
		
		//mutiply the two biginteger values
		BigInteger b5=o.b1.multiply(o.b2); //here we are storing that multiplication value into another biginteger
		System.out.println(b5);
		
		//add the two bigdecimal values
		System.out.println(o.b3.add(o.b4)); //we get another bigdecimal internally.
		
		//mutiply the two bigdecimal values
		BigDecimal b6=o.b3.multiply(o.b4); //here we are storing that multiplication value into another bigdecimal
	    System.out.println(b6);
	}

}
