package com.arrays;



public class ReverseOfArray {

	public static void main(String[] args) {
		//declaration&creation and initailization at once.
		int ar[]= {10,20,30,40,50};
		int len=ar.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}

        System.out.println("end");
	}

}
