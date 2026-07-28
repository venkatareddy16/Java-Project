package com.logicalstatements.conditionalst;

import java.util.Scanner;

public class SkipStop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==2) {
				continue;
			}
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("******************************");
		for(int j=1;j<=n;j++) {
			if(j<5) {
				continue;
			}
			System.out.print(j+" ");
		}
		

	}

}
