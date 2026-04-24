package com;
import java.util.Scanner;
public class dynamicinputs {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		System.out.println("Enter array size");
		int size=s.nextInt();
		int[] arr=new int[size];

		System.out.println("enter values");
		for(int i=0;i<size;i++) 
		{
			int value=s.nextInt();
			arr[i]=value;
		}
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+" array indexed position is "+i);	
		}
		
		int count=0;
		System.out.println("enter occurence ");
		int occurancenum=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==occurancenum)
			{
			count++;
			}
		}
		System.out.println(count+" items occurred");
	}

}
