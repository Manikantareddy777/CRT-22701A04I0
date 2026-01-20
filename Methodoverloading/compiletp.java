package Methodoverloading;

public class compiletp {
	void display() {
		System.out.println("HELLO THIS IS MANI");	
		System.out.println("-------------------------------");
		}
	void display(int x) {
		System.out.println("INT VALUE IS : "+x);
		System.out.println("-------------------------------");
		
	}
	void display(double x) {
		System.out.println("DOUBLE VALUE IS : "+x);
		System.out.println("-------------------------------");
		
		
	}
	void display(int x,String y)
	{
		System.out.println("INT VALUE IS : "+x);
		System.out.println("STRING VALUE IS :" +y);
		System.out.println("-------------------------------");
		
	}
	void display(String y,int x)
	{
		System.out.println("STRING VALUE IS : "+y);
		System.out.println("INT VALUE IS : "+x);
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
	

	}

}

