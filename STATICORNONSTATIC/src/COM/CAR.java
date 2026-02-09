package COM;
  /*GIVING PREVIOUS STORED VALUE AND CHANGED VALUE*/
public class CAR {
	static int cost=30;
	static String name="FERRARI";
	public static void main(String[] args)
	{
		System.out.println(cost);//CAR.cost
		System.out.println(name);//CAR.name
		System.out.println("-------------------");
		CAR.cost=25;
		System.out.println(cost);
		
	}

}
