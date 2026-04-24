package bankproject;

public class ATM implements Bank
{
	int balance=10000;
	public void deposit(int amount)
	{
		System.out.println("Depositing amount is Rs. "+amount);
		balance=balance+amount;
		System.out.println("Amount Depositted Successfully");
		
		}
	public void withdraw(int amount)
	{
		System.out.println("withdraw amount is Rs."+amount);
		balance=balance-amount;
		System.out.println("Amount Withdrawed Successfully");
	}
	public void checkBalance() 
	{
		System.out.println("Available Balance amount is :"+balance);
	}
}
