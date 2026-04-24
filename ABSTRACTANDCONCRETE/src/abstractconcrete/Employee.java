package abstractconcrete;

public class Employee extends Person
{
	@Override
	void work() 
	{
		System.out.println("working");
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.work();
		
		

	}

}
