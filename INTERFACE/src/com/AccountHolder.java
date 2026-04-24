package com;

public class AccountHolder implements HDFCBank 
{
	public void withdraw() {
		System.out.println("withdrawn");
	}
	public void deposit() {
		System.out.println("deposited");
	}

	public static void main(String[] args) 
	{
		AccountHolder acc=new AccountHolder();
		acc.deposit();
		acc.withdraw();

	}

}
