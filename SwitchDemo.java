class SwitchDemo
{
	public static void main(String[] args)
	{
		int choice=3;
		switch(choice)
		{
			case 1:System.out.println("i am in class 1");
					break;
			case 2:System.out.println("i am in class 2");
					break;
			case 3:System.out.println("i am in class 3");
					break;
		    default : System.out.println("among three classes; select one class otherwise invalid class");
		}
	}
}