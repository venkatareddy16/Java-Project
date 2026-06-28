package com.logicalstatements.loopingst;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int en=sc.nextInt();
		
		evenNum(st,en);
		System.out.println();
		System.out.println("**********************************");
		oddNum(st,en);
		
	}

	private static void oddNum(int st, int en) {
		// TODO Auto-generated method stub
		for(int i=st;i<=en;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

	private static void evenNum(int st, int en) {
		// TODO Auto-generated method stub
		for(int i=st;i<=en;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}

}
