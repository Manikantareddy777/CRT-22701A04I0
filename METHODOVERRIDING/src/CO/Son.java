package CO;

class Son extends Father {
	
	void bike() {
		System.out.println("sons bike");
	}
	public static void main(String[] args)
	{
		Son s= new Son();
		s.bike();
	}

}
