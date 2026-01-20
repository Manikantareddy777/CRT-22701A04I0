package com;

public class Solution {
	public static void main(String[] args) {
		Empolyee E1=new Empolyee();
		Empolyee E2=new Empolyee();
		Empolyee E3=new Empolyee();
		E1.id="22701A04I0";E1.salary=50000;E1.name="Mani";
		E2.id="7729926710";E2.salary=14000;E2.name="Prathap";
		E3.id="9121960881";E3.salary=30000;E3.name="Siva";
		System.out.println(E1.id+" "+E1.salary+" "+E1.name);
		System.out.println(E2.id+" "+E2.salary+" "+E2.name);
		System.out.println(E3.id+" "+E3.salary+" "+E3.name);
		System.out.println(":-----------------------------------:");
		System.out.println("My id is : "+E1.id+"; my salary is : "+E1.salary+"; my name is : "+E1.name);
		System.out.println("My id is : "+E2.id+"; my salary is : "+E2.salary+"; my name is : "+E2.name);
		System.out.println("My id is : "+E3.id+"; my salary is : "+E3.salary+"; my name is : "+E3.name);
		
		
	}

}
