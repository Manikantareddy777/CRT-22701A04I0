package com;

public class Test
{

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.work();
		System.out.println("------------------------");
		System.out.println("----------upcasting----------");
		Person p=new Employee();
		p.work();
		

	}

}
