package bankproject;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Bank p=new ATM();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("WELCOME TO ATM");
			System.out.println("1:deposit\n2:withdraw\n3:checkbalance\n4:Thank you");
			System.out.println("Choose your Need");
			int choice=scan.nextInt();
			switch(choice) {	
			case 1:
				System.out.println("Enter amount to be deposited");
				p.deposit(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter amount to be Withdrawn");
				p.withdraw(scan.nextInt());
				break;
			case 3:
				p.checkBalance();
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
			default:
				System.out.println("invalid entered choice");
			}
			System.out.println("=========================================");
			
		}
	}

}
