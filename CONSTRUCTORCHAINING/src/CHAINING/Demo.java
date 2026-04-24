package CHAINING;

public class Demo {
	Demo()
	{
		System.out.println(1);
		
	}
	Demo(int a)
	{
		this();
		System.out.println(2);
	}
	public static void main(String[] args) {
		System.out.println("start");
		new Demo(22);
		System.out.println("stop");
	}
}
