package GLOBALANDLOCALVARIABLE;

public class Person {
	int age;
	String name;
	Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Person p1=new Person("mani",21);
		Person p2=new Person("muni",22);
		System.out.println("name is:"+p1.name+" //age is :"+p1.age);
		System.out.println("name is:"+p2.name+" //age is :"+p2.age);
		
		
	}

}
