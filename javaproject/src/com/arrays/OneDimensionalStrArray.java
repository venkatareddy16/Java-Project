package com.arrays;
import java.util.Scanner;
public class OneDimensionalStrArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the String Array:");
		int n=sc.nextInt();
		String[] str=new String[n];
		sc.nextLine();//before getting the string with spaces
		for(int i=0;i<n;i++) {
			//str[i]=sc.next();
			str[i]=sc.nextLine();
		}
		//representation of string array
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+" ");
			System.out.println("*************");
		}
		
		//for each loop
		for(String s:str) {
			System.out.println(s+" ");
		}
		
		System.out.println(str);  //[Ljava.lang.String;@3af49f1c->Address of String
		
	}

}
