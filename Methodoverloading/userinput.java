package Methodoverloading;
import java.util.Scanner;

public class userinput {
	

	public static void main(String[] args) {
		System.out.println("start");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value:");
		int a =scan.nextInt();
		System.out.println("enter b value:");
		int b= scan.nextInt();
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
		System.out.println("end");
		System.out.println("-------------------------------");
		System.out.println("enter age : ");
		int age=scan.nextInt();
		System.out.println("enter name : ");
		String Name=scan.next();
		System.out.println("enter salary : ");
		int salary=scan.nextInt();
		System.out.println("end");
		System.out.println("-------------------------------");
		System.out.println("my name is "+Name+"; my age is : "+age+";my salary is:"+salary);
		System.out.println("my name is "+Name+";\nmy age is "+age+";\nmy salary is:"+salary);
		
		

	}

}
