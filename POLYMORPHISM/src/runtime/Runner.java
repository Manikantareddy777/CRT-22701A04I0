package runtime;

public class Runner {

	public static void main(String[] args) 
	{
		Employee e=new Developer();
		e.work();
		
		Employee e1=new Tester();
		e1.work();
		
		System.out.println("-----------------------------------");
		
		Employee emp;
		emp=new Developer();
		emp.work();
		
		emp=new Tester();
		emp.work();
		

	}

}
