package Methodoverloading;
import java.util.Scanner;

public class s1 {
	void add(int a,int b)
	{
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
	}
	public static void main(String[] args) {
		s1 s=new s1();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		int a=scan.nextInt();
		System.out.println("enter b value");
		int b=scan.nextInt();
		s.add(a,b);
		
		
	} 

}

