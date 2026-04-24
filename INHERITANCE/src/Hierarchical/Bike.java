package Hierarchical;

class Bike extends Vehicle{
	String Fuel="petrol";
	void stop() {
		System.out.println("bike stoped");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println("Vehicle brand is :"+b.brand+"\nbike fuel :"+b.Fuel);
		b.stop();
	}

}
