package COM;

public class BUYINGPEN {
	static int x=10;
	static {
		x=20;
	}
	public static void main(String[] args) {
		
		BUYINGPEN pen=new BUYINGPEN();
		System.out.println("buyed at required cost is :"+x);
		
		
	}
	{
		x=30;
	}

}
