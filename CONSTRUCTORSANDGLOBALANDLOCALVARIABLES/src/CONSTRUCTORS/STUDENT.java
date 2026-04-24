package CONSTRUCTORS;

public class STUDENT {
	int age;
	STUDENT(int x){
		age=x;
	}
	public static void main(String[] args) {
		STUDENT s1= new STUDENT(20);
		STUDENT s3= new STUDENT(50);
		System.out.println(s1.age);
		System.out.println(s3.age);
	}

}
