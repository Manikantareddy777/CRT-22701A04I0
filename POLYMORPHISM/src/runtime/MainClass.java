package runtime;

public class MainClass 
{
	void invokework(Employee emp)
	{
		emp.work();
	}
	public static void main(String[] args) 
	{
		MainClass m=new MainClass();
		m.invokework(new Developer());
		m.invokework(new Tester());
		
		System.out.println("-------------------------");
		Developer d=new Developer();
		d.work();
		Tester t= new Tester();
		t.work();
		Employee e=new Employee();
		e.work();
		
		
	}

}
