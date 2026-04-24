package com;
import java.util.Scanner;
public class Teststudent
{
	public static void main(String[] args) 
	{
	Student s= new Student();
	Scanner scan =new Scanner(System.in);
	for(int i=0;i<2;i++) {
		
	System.out.println("enter age");
	int age=scan.nextInt();
	s.setAge(age);
	
	System.out.println("enter name");
	String name=scan.next();
	s.setName(name);
	
	System.out.println(s.getAge()+" is age and name is "+s.getName());
	}
	
	}
	

}
