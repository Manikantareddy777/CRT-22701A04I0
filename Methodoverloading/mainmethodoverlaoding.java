package Methodoverloading;

public class mainmethodoverlaoding {
	public static void main(String[] args) {
		System.out.println("MAIN METHODS OVERLOADING TOPICS");
		main();
		System.out.println("-------------------------------");
		main(5);
		System.out.println("-------------------------------");
		main("bhadra ");
		System.out.println("-------------------------------");
		main("Mani",5);
		System.out.println("-------------------------------");
		main('S');
		}
		
		public static void main() {
			System.out.println("start");
		}
		public static void main(int x) {
			System.out.println("int value is :" +x);
		}
		public static void main(String z) {
			System.out.println("String is :"+z);
			
		}
		public static void main(String c, int y) {
			System.out.println(c+" favourate number is: "+y);
		}
		public static void main(char c) {
			System.out.println(c);
		}

}



