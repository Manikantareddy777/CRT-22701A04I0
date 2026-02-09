package COM;
import java.util.Scanner;
public class posorneg5times {
	void posneg(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is a even number");
		}
		else 
		{
			System.out.println(n+" is a odd number");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		posorneg5times num=new posorneg5times();
		
		for(int i=1;i<=5;i++) {
			System.out.println("enter a number");
			int n=scan.nextInt();
			num.posneg(n);
			System.out.println("_______________________");
		}

	}

}
