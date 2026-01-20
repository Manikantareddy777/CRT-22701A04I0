class Student
{
	int age=20;
	String name="Mani";
	public static void main(String[] args)
	{
		Student s1= new Student();
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println("---------------------------");
		System.out.println("age is : "+s1.age);
		System.out.println("name is: "+s1.name);
		System.out.println("---------------------------");
		System.out.println("name is "+s1.name+" and age is: "+s1.age);
		System.out.println("---------------------------");
	}
}