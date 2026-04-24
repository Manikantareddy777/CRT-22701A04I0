package thisandsuperstatements;

public class Son extends Father {
	int age=21;
	void display() {
		int age=5;
		System.out.println("method variable :"+age);
		System.out.println("class variable :"+this.age);
		System.out.println("inherited variable :"+super.age);
	}

}
