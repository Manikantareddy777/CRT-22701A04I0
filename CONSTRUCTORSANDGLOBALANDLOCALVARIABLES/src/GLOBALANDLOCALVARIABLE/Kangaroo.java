package GLOBALANDLOCALVARIABLE;

class Kangaroo {
	double height=4.4;
	Kangaroo() {
		double height=5.5;
		System.out.println(height);
		System.out.println(this.height);
	}
	public static void main(String[] args) 
	{
		Kangaroo k=new Kangaroo();
		

	}

}
