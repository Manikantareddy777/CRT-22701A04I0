package COM;

import java.util.Scanner;

public class PROJECT {
	static String villagename="kotha eturu";
	String menname;
	int age;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		PROJECT project=new PROJECT();
		System.out.println("number of members");
		int n =scan.nextInt();
		scan.nextLine();
		for(int i=1;i<=n;i++) 
		{
			System.out.println("enter a menname");
			project.menname=scan.nextLine();
			
			System.out.println("enter age");
			project.age =scan.nextInt();
			scan.nextLine();
			
			System.out.println("Villagename is :"+PROJECT.villagename);
			System.out.println("menname is :"+project.menname);
			System.out.println("age is :"+project.age);
			System.out.println("---------------------------");
			
		}
		scan.close();
		
		
			
	}

}
