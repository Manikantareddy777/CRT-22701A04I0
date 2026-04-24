package cal;
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Calculator c=new Calci();
		Scanner scan=new Scanner(System.in);

		while(true)
		{
			System.out.println("1:ADD\n2:SUB\n3:MUL\n4:DIV\n5:stop looping & Thank you");

			System.out.println("Choose your Need");
			int choose=scan.nextInt();

			int a,b;

			switch(choose) {
			case 1:
				System.out.println("Enter a value");
				a =scan.nextInt();
				System.out.println("Enter b value");
				b=scan.nextInt();
				System.out.println(c.add(a, b));
				break;
			case 2:
				System.out.println("Enter a value");
				a =scan.nextInt();
				System.out.println("Enter b value");
				b=scan.nextInt();
				System.out.println(c.sub(a, b));
				break;
			case 3:
				System.out.println("Enter a value");
				a =scan.nextInt();
				System.out.println("Enter b value");
				b=scan.nextInt();
				System.out.println(c.mul(a, b));
				break;
			case 4:
				System.out.println("Enter a value");
				a =scan.nextInt();
				System.out.println("Enter b value");
				b=scan.nextInt();
				System.out.println(c.div(a, b));
				break;
			case 5:
				System.out.println("Thank you");
				System.exit(0);
			default:
				System.out.println("Invalid Need Choosed,so choose correct ");
			}
			System.out.println("==============================");
		}



	}

}
