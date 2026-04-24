package abstractconcreteconstructors;

public class Son extends Father
{
	//Father()   implicitly
	//Father(int a)   explicitly
	Son()
	{
		super(55);
		System.out.println("Hi Son");
	}
}
