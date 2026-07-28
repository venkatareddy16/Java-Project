package com.oops.encapsulation;
//if the class is public,then java complier created default constructor scope is also in public only.
//if the class is default,then java complier created default constructor scope is also in default only.
public class Employee {
   private int empno;
   private String ename;
   private double sal;
   
   //public setters and public getters
   public void setEmpno(int empno) {
	   this.empno=empno;
   }
   public int getEmpno() {
	   return empno;
   }
   public void setEmpname(String ename) {
	   this.ename=ename;
   }
   public String getEmpname() {
	   return ename;
   }
   public void setSal(double sal) {
	  if(sal>0) {
	   this.sal=sal;
	  }
	  else {
		  System.out.println("Invalid Salary Entered");
	  }
   }
   public double getSal() {
	   return sal;
   }
   
   
}
