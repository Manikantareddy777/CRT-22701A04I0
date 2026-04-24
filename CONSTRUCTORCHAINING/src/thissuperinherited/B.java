package thissuperinherited;

class B extends A
{
	B(int x)
	{
		this();
		System.out.println("B int x: "+x);
		System.out.println(3);
	}
	B()
	{
		super(10);
		System.out.println(4);
	}
	public static void main(String[] args)
	{
		new B(5);
	}
	

}
