package com.langfunda.methods;
import java.util.Scanner;
public class ATMBanking {
    double balance=50000.00;
    void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//ATMBanking a=new ATMBanking();
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		checkbalance();
		deposit(amt);
		withdraw(amt);
	}
    //method with no arguments and no return type
	void checkbalance() {
		System.out.println("current Balance is: "+balance);
	}
	
	//method with arguments and no return type
	void deposit(int amt) {
		balance=balance+amt;
		System.out.println("After deposit the amount: "+balance);
	}
	void withdraw(int amt) {
		if(balance>amt) {
			balance=balance-amt;
			System.out.println("After withdraw amt: "+balance);
		}
		else {
			System.out.println("Insufficient Balance,Your Curerent balance is "+balance);
		}
		
	}

}
