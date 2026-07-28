package com.arrays;
//Jagged Array Def:Array of Arrays is called Jagged Array.
//Def:It is a multi-dimensional array where each row can have different no of columns.
public class JaggedArray {

	public static void main(String[] args) {
		System.out.println("main method started");
	
		//Declaration and creation of jagged array
		//[3]->Represents no of rows in the array
		//[]->Represents different column size for each row
		int[][] jagg=new int[3][];
		
		//Initialization(define the column size for each row ->it considered as array size)
		jagg[0]=new int[4];  //row 0 has 2 columns
		jagg[1]=new int[1];  //row 1 has 4 columns
		jagg[2]=new int[4];  //row 1 has 1 column
		
		//Representation of Jagged Array
		for(int i=0;i<jagg.length;i++) {  //no of rows
			for(int j=0;j<jagg[i].length;j++) {  //no of columns for each row
				System.out.print(jagg[i][j]+" ");
			}
			System.out.println();	
		} 
		System.out.println(jagg);//[[I@8efb846  is address of jagged array variable
		
		
	}

}
