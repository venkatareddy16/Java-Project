package com.arrays;
import java.util.*;
//wap to print the 2-d or jagged array by using the Intialization of values in {}
public class JaggedArray2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		//Declaration & initialization at once
		int [][] literaljagg= {{1,2,3},{4},{6,7,8}}; //3 rows ->0->(3 col) ,1->(1col),3->(3col)
		
		//or
//		int jagg[][];
//		jagg= new int[][]{{1,2,3},{4},{6,7,8}};
		
		//Representation of Array in for loop
		for(int i=0;i<literaljagg.length;i++) {
			for(int j=0;j<literaljagg[i].length;j++) {
				System.out.print(literaljagg[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("******************************");
		//in for-each loop
		for(int []jagg:literaljagg) {
			for(int j:jagg) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(literaljagg)); // ->o/p:[[I@8efb846, [I@2a84aee7, [I@a09ee92]
	}

}
