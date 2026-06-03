package com.langfunda;
//Floating Literlas:Floating point Literals,Double Literals
public class FloatingandOtherLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java";//String Literals -->stored in scp(sub in heap)
		String s1=new String("Srikanth");//String Object +Literals-->stored in Heap area
		
		//char literals
		char c1 = 'A';// Single quote values
		char c2 = 45;// ASCII values
		char c3 = '\u0000';// Unicode values
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//boolean literals
		boolean whenYouPrcatice = false;

		if (whenYouPrcatice) {
			System.out.println("You will get a job ");
		} else {
			System.out.println("You will get nothing !");
		}
		
//		String s5 = null; null is a Literal which we can store it in only for Object data types 
//		int i = null;//invalid 

		System.out.println(s);
		System.out.println(s1);
		
		//Floating point Literals checking of validation
		float f1=123;  //int --> float //valid
		//float f2=123.5;  //invalid //double cannot be convert to float directly
     	float f3=0123;   //valid //integral octal literal is converting decimal literal(int) and convert to float(implicit casting)
		float f4=0123.5F; //valid //it is not taken as octal literal because we have floating point (.5F)
		float f5=1230;    //valid //Integral Decimal literal(int) converted to float(implicit casting)
		float f6=0x123;   //valid //Integral hexa-decimal literal is convert to decimal literal(int) convert to float(implicit casting)
		//float f7=0x123.5F; //Invalid hexa-decimal literal number
		float f8=0b10;    //valid //Integral Binary literal is convert to decimal literal(int) and convert to float(implicit casting)
     	float f9=0x123F;  //valid //Integral hexa-decimal literal is convert to decimal literal(int) convert to float(implicit casting
		float f10=1235F;  //valid //Integral hexa-decimal literal is convert to decimal literal(int) convert to float(implicit casting
		float f11=10F;   //valid //10F or 10 is same
		
		//Double Literals checking of validation
				double d1=123;  //int --> double //valid
				double d2=123.5;  //valid //In rhs (.) after values in double only by default.
		     	double d3=0123;   //valid //integral octal literal is converting decimal literal(int) and convert to float(implicit casting)
				double d4=0123.5; //valid //it is not taken as octal literal because we have floating point (.5F)
				double d5=1230;    //valid //Integral Decimal literal(int) converted to float(implicit casting)
				double d6=0x123;   //valid //Integral hexa-decimal literal is convert to decimal literal(int) convert to float(implicit casting)
				//double d7=0x123.5; //Invalid hexa-decimal literal number
				double d8=0b10;    //valid //Integral Binary literal is convert to decimal literal(int) and convert to float(implicit casting)
		     	double d9=0x123F;  //valid //Integral hexa-decimal literal is convert to decimal literal(int) convert to float(implicit casting
				double d10=1235F;  //valid //Integral hexa-decimal literal is convert to decimal literal(int) convert to float(implicit casting
				double d11=10D;  //valid //10D or 10 is same //10D gives output is 10.0
				
		System.out.println(f1);
		//System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		//System.out.println(f7);
		System.out.println(f8);
		System.out.println(f9);
		System.out.println(f10);
		System.out.println(f11);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		//System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		

	}

}
