package Hierarchical;

class Car extends Vehicle{
	int cost=2500000;
	void start() {
		System.out.println("Car started");
	}
	public static void main(String[] args) {
		 Car c=new Car();
		 System.out.println("car cost is :"+c.cost+"\nvehicle brand :"+c.brand);
		 c.start();
	}

}
