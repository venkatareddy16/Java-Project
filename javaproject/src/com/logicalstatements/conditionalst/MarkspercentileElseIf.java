package com.logicalstatements.conditionalst;
import java.util.*;
public class MarkspercentileElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks<0||marks>100) {
			System.out.println("Invalid Marks percentile");
		}
		else if(marks>=90) {
			System.out.println("A grade");
		}
		else if(marks>=80) {
			System.out.println("B grade");
		}
		else if(marks>=70) {
			System.out.println("c grade");
		}
		else if(marks>=60) {
			System.out.println("D grade");
		}
		else if(marks>=35){
			System.out.println("Just Passed");
		}
		else {  //marks>=0 and marks<35
			System.out.println("Fail");
		}
	}

}
