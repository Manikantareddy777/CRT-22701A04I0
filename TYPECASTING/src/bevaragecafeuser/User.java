package bevaragecafeuser;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
	Cafe c=new Cafe();
	Scanner s=new Scanner(System.in);
	System.out.println("enter what we want \n1:Tea\n2:coffee");
	int choice=s.nextInt();
	Bevarage obj=c.vendingMachine(choice);
	if(obj instanceof Tea )
	{
		System.out.println("tea ordered");
	}
	else if(obj instanceof Coffee) 
	{
		System.out.println("coffee ordered");
	}

	}

}
