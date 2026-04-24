package com;

public class Person {

	private int age=22;

	public void setAge(int age) 
	{
		this.age=age;
	}

	public int getAge() 
	{
		return age;
	}

		public static void main(String[] args) 
		{
			Person p = new Person();
			System.out.println(p.age);
		}

	}
