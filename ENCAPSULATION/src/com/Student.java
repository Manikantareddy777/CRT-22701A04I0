package com;

public class Student {
	private int age;
	
	private String name;
	
	public void setAge(int age) 
	{
		if(age>0) 
		{
			this.age=age;
		}
		else {
			System.out.println("this is not valid age");
		}
		
	}
	public int getAge() 
	{
		return age;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	

	public static void main(String[] args) {
		

	}

}
