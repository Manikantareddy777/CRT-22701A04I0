package com;

public class Person {

	public int age=12;

	public void work() 
	{
		System.out.println("i am working");
	}

	protected static void main(String[] args) 
	{
		Person P=new Person();
		P.work();
		System.out.println(P.age);


	}

}
