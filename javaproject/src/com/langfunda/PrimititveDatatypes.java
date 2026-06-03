package com.langfunda;
//JVM provide default values for static & instance variables
public class PrimititveDatatypes {
	//	Type Casting: converting one data type values into another data types.
	//In Java,we have two types of casting
	//low to high data types:byte->short->int->long->float->double
	//   (i) Implicit Type Casting:Converting low data types values to High data types values will convert internally will consider as Implicit type casting.Here, we no need to do explicitly
	//   (ii)Explicit Type casting:Converting  High data types values to Low Data Types will consider as Explicit type casting.Here, we need to do Explicit casting with LHS(LOW) Data type.
    byte b; //1 byte->8 bits (size)
    //range:-128 -127 -126 ....... 0 1 2 3 ......... 127
    //byte range is:-128 to 127 -> 2^7
  	//If we give more than b value (127) then it throws compile time error.
  	//If we give less than b value (-128) then it throws compile time error.
  	//THIS COMPILE ERROR:Type mismatch:cannot covert from int to byte
  	//By default RHS Numeric value is: int(integer)
    byte b1=(byte)256;//Explicit Type casting
    
    short s; //2 bytes->16 bits (size)
    short s1=b1;//byte value is storing into short,then it is considered as Implicit Type casting
    //range is  :-32767 to 32767 -> 2^15
    short s2=(short)65535;//Explicit Type casting
    
    int i; //4 bytes->32 bits (size)
    int i1=s2; //short value is storing into int//implicit type casting
    //range is: -2147483648 to 2147483647 -> 2^31 
    int i2=(int)2147483648L;  //long is converted to int //explict type casting
    
    long l;//8 bytes -> 64 bits (size)
    long l1=i2;//int value is storing into long//implicit type casting
    //range is //more than 10 digits // and less than 20 digits ->2^63
    long l2=3456789234234567845L;
    long l3=(long)34567.2345F; //float converted to long //exclipit type casting.
    long l4=(long)94567.23456789;//by default RHS Decimal value is considered as double,if we want float we have to keep literal (F) at end of decimal.//double converted to long by explicit casting. 
    
    float f; //4 bytes->32 bits (size)
    //it displays decimals up to 5-6 decimals
    float f1=l2; //long is storing into float//implicit type casting.
    float f2=(float)4567.6789467D;//converting double to float by explicit
    
    double d; //8 bytes -> 64 bits (size)
    //it displays decimals up to 15-16 decimals
    double d1=f1;//implicit type casting
    double d2=32457.456789379D; //or d2=32457.4785959 is same.
    
    char ch; //2 bytes -> 16 bits (size)
    char ch1='A';
    char ch2=65; //convert ascii value to respective character
    char ch3='\u0041';//covert unicode to respective character.
    char ch4=127;  //we can get valid characters from 0 to 126 ascii values only.
    char ch5=32767;//after that there is no valid characters.
    char ch6=65534;//after that there is no valid characters.range is ((-32768)add32767)->(0 to 65535) hence it has no negative values unlike short(-32768 to 32767) but the size is 2bytes for both.
    //converting the integer to character beyond the char range (65535) by doing the the explicit type casting.
    char ch7=(char)75534;//explicit type casting.
    int i3=ch1;//implicit type casting-//converting from character to integer
    char ch8='9';
    int i4=ch8-'0'; //implicit type casting
    char ch9=(char)(i4+'0');//explicit type casting-get the i4=9 in character format by using (i4+'0')
    char ch10=(char)i4;   //explicit type casting-get acill character of i4=9
    
    boolean boo;//1 byte ->8 bits (size)
    boolean boo1=true; //'true' 0 1 'FALSE' FALSE TRUE are invalid
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//object creation
		PrimititveDatatypes t=new PrimititveDatatypes();
		//all data types default values
		System.out.println("byte value:"+t.b);  //0
		System.out.println("short value:"+t.s);  //0
		System.out.println("int value:"+t.i);  //0
		System.out.println("long value:"+t.l);  //0
		System.out.println("float value:"+t.f);  //0.0
		System.out.println("double value:"+t.d);  //0.0
		System.out.println("char value:"+t.ch); //' '->space
		System.out.println("boolean value:"+t.boo);//false
        //experiment values for default values
		System.out.println("byte value:"+t.b1);
		System.out.println("short value:"+t.s1);
		System.out.println("short value:"+t.s2);
		System.out.println("int value:"+t.i1); 
		System.out.println("int value:"+t.i2); 
		System.out.println("long value:"+t.l1); 
		System.out.println("long value:"+t.l2); 
		System.out.println("long value:"+t.l3); 
		System.out.println("long value:"+t.l4); 
		System.out.println("float value:"+t.f1);
		System.out.println("float value:"+t.f2);
		System.out.println("double value:"+t.d1);
		System.out.println("double value:"+t.d2);
		System.out.println("char value:"+t.ch1);
		System.out.println("char value:"+t.ch2);
		System.out.println("char value:"+t.ch3);
		System.out.println("char value:"+t.ch4);
		System.out.println("char value:"+t.ch5);
		System.out.println("char value:"+t.ch6);
		System.out.println("char value:"+t.ch7);
		System.out.println("int value:"+t.i3);
		System.out.println("char value:"+t.ch8);
		System.out.println("int value:"+t.i4);
		System.out.println("char value:"+t.ch9);
		System.out.println("char value:"+t.ch10);
		System.out.println("boolean value:"+t.boo1);
	}

}
