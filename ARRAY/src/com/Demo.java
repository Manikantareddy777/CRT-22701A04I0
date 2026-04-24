package com;

public class Demo {
	public static void main(String[] args) {
		//array declaration
		
		int[] a;
		
		//array creation
		
		a=new int[3];
		
		//printing
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//array intilization
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//printing
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//array creation and declaration 
		double[] marks = new double[4];
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		marks[0]=1000.0;
		marks[1]=2000.0;
		marks[2]=3000.0;
		marks[3]=4000.0;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		System.out.println("length of array :"+marks.length);
		
		
		
		
	}

}
