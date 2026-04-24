package CONSTRUCTOROVERLOADING;

public class Employee {
	int id;
	String name;
	int salary;
	Employee(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("id number: "+this.id);
		System.out.println("name is : "+this.name);
		System.out.println("salary is: "+this.salary);
	}

	public static void main(String[] args) {
		Employee e1=new Employee(2270,"prathap",70000);
		e1.display();
		System.out.println("--------------------------");
		Employee e2=new Employee(9121,"siva",80000);
		e2.display();

	}

}
