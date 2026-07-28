package com.arrays;
import java.util.*;
public class TwoDimensionalIntArray {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter the size of the 2-d array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//size
		//1.2-d array declaration and creation
		//1.int a[][];
		//1.a=new int[n][n];
		
		//2.2-d array declaration direct initialization at once is called array literal initialization
		//2.int a[][]={{2,3,4},{3,5,6},{6,7,8}};
		
		//3.2-d array declaration and after creation and initialization at one place.
		//int b[][];
		//b=new int[][]{{2,3,4},{3,5,6},{6,7,8}};
		
		int a[][]=new int[n][n];   
		//1.a[0][0]=1;  //one way
		//2.take input through scanner for this 2-d array -> other way
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		//Representation of the 2-d array
		//a.length represents no of rows in the 2-d array
		//a[0].length or a[1].length or a[2].length....a[n].length represents no of columns for each row in 2-d array.
//		for(int i=0;i<a.length;i++) {		
//			for(int j=0;j<a[i].length;j++) {  //here a[0] or a[i] is same 
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//for-each loop
		for(int i[]:a) {
			for(int b:i) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println(a); //[[I@681a9515 -> address of 2-d array variable.
		
		//for every row of elements it prints the address
		System.out.println(Arrays.toString(a)); //o/p->[[I@------,[I@---------,.......] 

	} 

}
