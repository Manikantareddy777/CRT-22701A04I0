package com;

public class Guldu implements Person
{
	public void eat() {
		System.out.println("Eating Biryani");
	}

	public static void main(String[] args) 
	{
		Guldu d=new Guldu();
		System.out.println(Person.id);
		d.eat();
		

	}

}
