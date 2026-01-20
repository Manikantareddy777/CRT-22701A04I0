package Methodoverloading;
import java.util.Scanner;
public class solution {
	void add(int a, int b)
	{
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		solution s=new solution();
		for(int i=1;i<=3;i++)
		{
		System.out.println("enter a value :");
		int a=scan.nextInt();
		System.out.println("enter b value :");
		int b=scan.nextInt();
		
		s.add(a, b);
		}
		
	}

}
