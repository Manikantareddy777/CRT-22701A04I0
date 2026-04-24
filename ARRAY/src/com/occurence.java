package com;

public class occurence {
	public static void main(String[] args) {
		
	
	int count=0;
	int[] numbers= {12,11,2,3,4,545,66,777,7676,545,2,1,2,1};
	
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]==2) {
			System.out.println(i);
			count++;
		}
	}
		System.out.println("number of times occurence :"+count);
	}
}
