class loginwithcredentials
{
	public static void main(String[] args)
	{
		String id="22701A04I0";
		int password=1234;
		if(id=="22701A04I0")
			
		{
			System.out.println("id is correct");
			if(password==1234)
			{
				System.out.println("password is correct");
				System.out.println("login successful");
			}
			else
			{
				System.out.println("password is wrong");
				System.out.println("login unsuccessful");
			}		
		}
		else
		{
			System.out.println("invalid id");
			System.out.println("login unsuccessful");
		}
	}
} 