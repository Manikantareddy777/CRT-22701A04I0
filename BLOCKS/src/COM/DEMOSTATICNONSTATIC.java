package COM;

public class DEMOSTATICNONSTATIC{
	static
	{
		System.out.println(" in static =hi this is mani");
	}
	{
		System.out.println(" in non static =mani ");
	}
	public static void main(String[] args)
	{
		DEMOSTATICNONSTATIC d=new  DEMOSTATICNONSTATIC();
		System.out.println("main() method");
	}
	

}