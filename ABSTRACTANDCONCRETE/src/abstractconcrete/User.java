package abstractconcrete;

public class User extends Car{
	void stop()
	{
		System.out.println("Car stopped");
	}
	void start()
	{
		System.out.println("Car started");
	}
	//optionally override shiftGears

	public static void main(String[] args) 
	{
		User u=new User();
		u.start();
		u.shiftGears();
		u.stop();

	}

}
