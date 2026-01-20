package com;

class Demomethods {
	void display()
	{
		System.out.println("HELLO");
	}
	void display1(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("sum of two numbers printed "+a+" and "+b);
		
	}
	int display2()
	{
		return 10;
	}
	int display3(String id,String name)
	{
		System.out.println(id);
		System.out.println(name);
		return 10;
	}
	int square(int a)
	{
		System.out.println("square of "+a);
		return a*a;
	}
	String matter()
	{
		return "Munikumar";
	}
	public static void main(String[] args) {
		Demomethods d=new Demomethods();
		System.out.println("START");
		d.display();
		System.out.println("STOP");
		System.out.println("----------------------------------");
		d.display1(2,3);
		System.out.println("----------------------------------");
		System.out.println(d.display2());
		System.out.println("----------------------------------");
		System.out.println(d.display3("22701A04I0","Manikanta"));
		System.out.println("----------------------------------");
		System.out.println(d.square(5));
		System.out.println("----------------------------------");
		System.out.println(d.matter());
		

	}

}
