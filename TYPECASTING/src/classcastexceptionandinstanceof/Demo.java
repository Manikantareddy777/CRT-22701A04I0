package classcastexceptionandinstanceof;

public class Demo {
	

	public static void main(String[] args) 
	{
		Vehicle v =new Bike();
		
		if(v instanceof Car) 
		{
			System.out.println("downcasting to car");
			Car c=(Car) v;
			System.out.println(c.Brand+"          "+c.fuel);
		}
		else if(v instanceof Bike)
		{
			System.out.println("downcasting to Bike");
			Bike b=(Bike) v;
			System.out.println(b.cost+"          "+b.Brand);
		}
		
		
		
		
	

	}

}
