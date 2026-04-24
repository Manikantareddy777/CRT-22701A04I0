package REALTIMEOVERRIDE;

final class finalkey {
	final void display() 
	{
		System.out.println("final variables are not re-initialized"+"\nfinal methods are inherited but not overrided"+"\nfinal classes are not inherited");
	}

	public static void main(String[] args) 
	{
		finalkey f=new finalkey();
		final double pi=3.14;
		
		System.out.println(pi);
		f.display();
		
	}

}
