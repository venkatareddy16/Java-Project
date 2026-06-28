package com.langfunda.methods;
//why need return type;;
//for doing new calculation on the methods,that methods must return the values.
public class EmployeeSalaryInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
	    EmployeeSalaryInfo e=new EmployeeSalaryInfo();
		double totalsal=e.getTotalSalary();
		double bonus=e.getBonus();
		System.out.println("Total salary is : "+(totalsal+bonus));
		System.out.println("main method ended");		
 
	}
	//method with no arguments and with return type.
	double getTotalSalary() {
		double totalsalary=0;
		
		double sal=100000.00;
		double hra=35000.00;
		
		totalsalary=sal+hra;
		return totalsalary;
		
	}
	double getBonus() {
		double bonus=2000.00;
		return bonus;
	}

}
