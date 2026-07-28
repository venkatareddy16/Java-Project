package com.arrays;
import java.util.*;
//find all the leaders in the array. An element is a leader if it is greater than or equal to all the elements to its right. The rightmost element is always a leader.
public class FindLeadersinRightofEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int res[]=findLeadersinright(a);
		System.out.println(Arrays.toString(res));
		int r[]=findonlyLeaders(a);
		System.out.println(Arrays.toString(r));
		

	}

	static int[] findonlyLeaders(int[] a) {
		int n=a.length;
		//o(n2)
//		int res[]=new int[n];
//		int k=0;
//		res[k++]=a[n-1];
//		for(int i=n-2;i>=0;i--) {
//			boolean flag=true;
//			for(int j=i+1;j<n;j++) {
//				if(a[i]<=a[j]) {
//					flag=false;
//					break;
//				}
//			}
//			if(flag) {
//				res[k++]=a[i]; //copying the all leaders into the res array and last element is always a leader.
//			}
//		}
//		//reverse the res array
//		int temp[]=new int[k];
//		for(int i=k-1;i>=0;i--) {
//			temp[k-i-1]=res[i];
//		}
//		return temp;
		
		//o(n)
		int max=a[n-1];
		int res[]=new int[n];
		int k=0;
     	res[k++]=max;
     	for(int i=n-2;i>=0;i--) {
     		if(a[i]>max) {
     			max=a[i];
     			res[k++]=max;
     		}
     	}
     	//reverse the res array
		int temp[]=new int[k];
		for(int i=k-1;i>=0;i--) {
			temp[k-i-1]=res[i];
		}
		return temp;
     	
	}

	static int[] findLeadersinright(int[] a) {
		int n=a.length;
		int res[]=new int[n];
		//o(n2)
		res[n-1]=a[n-1]; //last element is always a leader
		for(int i=n-2;i>=0;i--) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<=a[j]&&res[i]<a[j]) {
					res[i]=a[j];
				}
			}
			if(res[i]==0) { //if in right side greater or equal element is not there. 
				res[i]=-1;
			}
		}
		
		//o(n)
//		int max=a[n-1]; //last element is always a leader
//		res[n-1]=max;
//		for(int i=n-2;i>=0;i--) {
//			if(a[i]>max) {
//				max=a[i];
//				res[i]=-1;
//			}
//			else if(a[i]<max) {
//				res[i]=max;
//			}
//		}
		
		return res;
	}
	

}
