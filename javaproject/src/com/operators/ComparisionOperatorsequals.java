package com.operators;
//== and !=
//Com op will always give you the resulted values like boolean expressions.
public class ComparisionOperatorsequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
        int a=10;
        int b=20;  
        int c=20;
        
        //==
        //== is used to (or) always check the values of two variables if the data is primitive.
        //== is used to check the addresses of two variables for object data types.
        System.out.println(a==b);//false
        System.out.println(c==b);//true
        
        //!=
        System.out.println(a!=b);//true
        System.out.println(c!=b);//false
        
          
        //String object data type.(Normal or predefined)
        String s1="Venkata Reddy"; //String Literal  -> stored in string const pool(scp) present in heap area.
        String s2=new String("Venkata Reddy"); //String Object ->stored directly in heap area not in scp.
        //this == is used to check the addresses of the two object ref varaibles not the content of the two strings.
        System.out.println(s1==s2);//false

        String s3=new String("Srikanth");//2 objects created(both in heap and scp)
        String s4="Srikanth"; //0 objects (already for this literal, 
        //obj is created in scp at the time of String s3 created because String content(literal) in s3 and s4 is same)
        //then s4 ref variable is refers obj in scp.
        System.out.println(s3==s4);//false //here s3 in heap and s4 in scp.
        String s5="Venkata Reddy"; //0 objects //stored in -> scp //here s5 and s1 refers to same obj,
        //because String content(literal) in s3 and s4 is same
        System.out.println(s1==s5);//true
        
        //.equals() method is used to check the content of two object data type variables(of same obj data type).
        System.out.println(s1.equalsIgnoreCase(s2));//password checking in real-time
        System.out.println(s1.equals(s2));//username checking in real time
        
        
        
        
	}

}
