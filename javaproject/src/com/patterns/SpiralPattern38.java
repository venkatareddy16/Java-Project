package com.patterns;

import java.util.Scanner;

public class SpiralPattern38 {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		char a[][]=spiralPattern(n);
		//print the spiral pattern
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	static char[][] spiralPattern(int n) {
		char ch[][]=new char[n][n];//char array
		int tl = 0, br = n - 1; // tl,br->i->0,n-1
		int bl = 0, tr = n - 1; // bl,tr->j->0,n-1
		// loop
		while (tl <= br && bl <= tr) {
			// horizontal up most row
			for (int j = bl; j <= tr; j++) {
				ch[tl][j]='*';
			}
			
			// vertical right most column
			for (int i = tl; i <= br; i++) {
				ch[i][tr]='*';
			}
			
			// horizontal bottom most row
			if(tl>bl) {
				bl=bl+2;//skip one col from left most
			}
			for (int j = tr; j >= bl; j--) {
				ch[br][j]='*';
			}
			
			// vertical left most column
			tl=tl+2;//skip row from top most
			for (int i = br; i >= tl; i--) {
				ch[i][bl]='*';
			}
			tr=tr-2; //skip one col from right most
			br=br-2; //skip one row from bottom most
		}
		return ch;
	}

}
