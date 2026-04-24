package CHAINING;

public class Employee {
	Employee(int id)
	{
		System.out.println(id);
	}
	Employee(int id,String name)
	{
		this(id);
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		new Employee(7722992,"Prathap Reddy");
	}

}
