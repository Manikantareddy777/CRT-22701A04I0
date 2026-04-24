package CO;

public class Whatsapp3 extends Whatsapp2{
	void display() 
	{
		super.display();
		System.out.println("blue ticks supported");
		
	}
	void call()
	{
		super.call();
		System.out.println("Video call Supported");
	}
	void story()
	{
		System.out.println("uploaded images");
	}
	public static void main(String[] args)
	{
		Whatsapp3 w=new Whatsapp3();
		w.display();
		System.out.println("-------------------------------");
		w.call();
		System.out.println("---------------------------------");
		w.story();
		
	}

}
