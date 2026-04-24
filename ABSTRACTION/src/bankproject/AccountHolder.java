package bankproject;

public class AccountHolder {

	public static void main(String[] args) {
		Bank b=new ATM();
		
		b.checkBalance();
		System.out.println("------------------");
		b.deposit(5000);
		b.checkBalance();
		System.out.println("-------------------");
		b.withdraw(2000);
		b.checkBalance();		
	}

}
