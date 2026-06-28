package com.logicalstatements.conditionalst;
import java.util.*;
public class FriendsDescritionSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		switch(name) {
		case "Venkata Reddy":
			System.out.println("Consistency person");
			System.out.println("Vucube student");
			break;
		case "Mani":
			System.out.println("Hardworking man");
			break;
		case "Jayanth":
			System.out.println("Vcube student");
			break;
		default:
			System.out.println("Invalid person");
		}
		
		

	}

}
