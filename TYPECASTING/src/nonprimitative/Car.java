package nonprimitative;

public class Car extends Vehicle{
	
	int cost=10000;
	int mileage=30;
	String fuel="diesel";
	
	void stop() {
		System.out.println("car stoped");
		
	}

	public static void main(String[] args) {
		
		System.out.println("---------------upcasting and downcasting--------------------- ");
		
		Vehicle v= new Car();
		System.out.println(v.brand);
		v.start();
		
		System.out.println("-------------------------------------------");
	
		Car c=(Car) v;
		System.out.println(c.brand +" this is the brand\ncost is "+c.cost+"\ncar mileage is "+c.mileage);
		System.out.println(c.brand+" is vehicle brand, "+c.fuel+" is fuel");
		c.stop();
		c.start();

	}

}
