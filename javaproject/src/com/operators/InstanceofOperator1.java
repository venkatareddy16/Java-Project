package com.operators;
class Instance1{
	
}
class Instance2 extends Instance1{
	
}
public class InstanceofOperator1 extends Instance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		InstanceofOperator1 i1=new InstanceofOperator1();
		System.out.println(i1 instanceof InstanceofOperator1);//true
		System.out.println(i1 instanceof Instance2);//true
		System.out.println(i1 instanceof Instance1);//true
		System.out.println("**************************");
		Instance2 i2=new Instance2();
		System.out.println(i2 instanceof InstanceofOperator1);//false
		System.out.println(i2 instanceof Instance2);//true
		System.out.println(i2 instanceof Instance1);//true
		System.out.println("*********************************");
		Instance1 i3=new Instance1();
		System.out.println(i3 instanceof InstanceofOperator1);//false
		System.out.println(i3 instanceof Instance2);//false
		System.out.println(i3 instanceof Instance1);//true

	}

}
