package com;

class Student {
	int marks;
	String name;
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.marks=100;
		s2.marks=99;
		s1.name="Mani";
		s2.name="Muni";
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		System.out.println("-----------------------");
		System.out.println("Student 1 "+s1.name+" has scored "+s1.marks);
		System.out.println("Student 2 "+s2.name+" has scored "+s2.marks);
		
	}
	

}

