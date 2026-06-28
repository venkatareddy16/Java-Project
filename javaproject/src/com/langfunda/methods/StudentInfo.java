package com.langfunda.methods;
public class StudentInfo {
	//method with arguments and no return type.
    void getStudentName(String name) { //(argument)
    	System.out.println("Student Name is: "+name);
    }
    void getAge(int age) {
    	System.out.println("Student Age is: "+age);
    }
    void feeInfo(double fee) {
    	System.out.println("Student fee is: "+fee);
    }
    void heightAndWeight(float height,double weight) {
    	System.out.println("Student height is: "+height);
    	System.out.println("Student weight is: "+weight);
    	
    }
    //method with no arguments and no return type
    void getPhoneNumber() {
    	long phno=6304460700L;
    	System.out.println("Student Phone number is "+phno);
    }
    void getMotherName() {
    	String name="Renuka";
    	System.out.println("Student mother name is "+name);
    }
    void getFatherName() {
    	String name="Srinivasa Reddy";
    	System.out.println("Student father name is "+name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("student details!");
		StudentInfo s=new StudentInfo();
		s.getStudentName("Venkata Reddy");//call by value (parameter)
        s.getAge(21);
        s.feeInfo(25000.00);
        s.heightAndWeight(5.9F, 75.0);
        s.getPhoneNumber();
        s.getMotherName();
        s.getFatherName();
	}

}
