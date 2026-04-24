package com;
import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(true) {
			System.out.println("enter a valid choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hi ra bava");
				break;
			case 2:
				System.out.println("HI ra bamardhi");
				break;
			case 3:
				System.out.println("Thank yoo");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");

			}
			System.out.println("==============================");
		}

	}

}
