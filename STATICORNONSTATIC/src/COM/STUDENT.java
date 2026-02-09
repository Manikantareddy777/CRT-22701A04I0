package COM;

class STUDENT {
	static int age=10;
	static void study() {
		System.out.println("studying");
	}
	public static void main(String[] args) {
		System.out.println("starting");
		System.out.println(STUDENT.age);
		STUDENT.study();
		System.out.println("----------------------");
		System.out.println(age);
		study();
		System.out.println("ending");
	}
	
	
	

}
