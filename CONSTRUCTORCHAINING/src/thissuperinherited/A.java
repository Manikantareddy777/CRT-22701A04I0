package thissuperinherited;

class A {
	A(int x)
	{
		this(5.5);
		System.out.println("int x: "+x);
		System.out.println(1);
	}
	A(double y)
	{
		System.out.println("double y: "+y);
		System.out.println(2);
	}

}
