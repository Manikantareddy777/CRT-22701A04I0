package CHAINING;

public class Thisdemo {
	Thisdemo()
	{
		this(70000.77);
	}
	Thisdemo(int id)
	{
		System.out.println("id :"+id);
	}
	Thisdemo(String name)
	{
		this(772992);
		System.out.println("name :"+name);
	}
	Thisdemo(double salary)
	{
		this("prathap");
		System.out.println("salary :"+salary);
		
	}
	public static void main(String[] args)
	{
		new Thisdemo();
	}
	

}
