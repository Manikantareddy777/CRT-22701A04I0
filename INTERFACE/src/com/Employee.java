package com;

public class Employee extends Testyantra implements Jspiders,Qspiders
{
	public void develop() {
		System.out.println("Developing app");
	}
	public void test() {
		System.out.println("testing app");
	}
	public static void main(String[] args) {
		Employee e =new Employee();
		e.develop();
		e.work();
		e.test();
		
		
	}
}
