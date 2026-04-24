package CONSTRUCTOROVERLOADING;

public class Emp {
	int id;
	Emp(int id){
		this.id=id;
	}
	void display() {
		System.out.println(id);	
	}
	public static void main(String[] args) {
		Emp e1=new Emp(10);
		Emp e2=new Emp(20);
		Emp e3=new Emp(30);
		e1.display();
		e2.display();
		e3.display();
	}

}
