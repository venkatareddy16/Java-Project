package com.langfunda;

public class WrapperCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//	Integer Wrapper Object datatypes caching
		//Integer Wrapper Caching:If the range is -128 to 127 then its creating only one object in heap area for all the data which are having same values.
		//If the range is -128 to 127 then its creating multiple objects in heap area for the data which are having different values.
		//if there is out of -128 to 127 then its creating multiple objects in heap area for all the data which are having same values also.
		
		//range is within and same values.
		Integer i1=100;
		Integer i2=100;
		
		// == operator always checks the value if the data type is primitive type.
		// == operator always checks the object references if the data type is object types.
		
		System.out.println(i1==i2); //true
		
		//range is out of and same values
		Integer i3=200;
		Integer i4=200;
        System.out.println(i3==i4); //false
        
        //range is within and different values
        Integer i5=107;
        Integer i6=106;
        System.out.println(i5==i6); //false
	}

}
