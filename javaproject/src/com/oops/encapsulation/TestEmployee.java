package com.oops.encapsulation;

public class TestEmployee {
 
	public static void main(String[] args) {
		System.out.println("main method started");
		//creating object for the encapsulation class
		//In that encapsulation class,default constructor(java complier created) scope is class scope(public).
		Employee e=new Employee();
		//setters are helping to modify or reassign the data with knowing of employee class
		e.setEmpno(16);
		e.setEmpname("Venkata Reddy");
		e.setSal(30000.0);
		
		//getters are helping to retrieve or read the data with knowing of employee class
		System.out.println(e.getEmpno());
		System.out.println(e.getEmpname());
		System.out.println(e.getSal());
		
		//Reassigning or modifying the data without knowing the employee class
//		e.empno=18;
//		e.ename("Venkata Reddy");
//		e.sal(18000.00);
		
	}

}
