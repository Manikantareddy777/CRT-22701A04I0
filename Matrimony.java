class Matrimony
{
	
	public static void main(String[] args)
	{
		char gender='M';
		int age=21;
		if(gender=='M')
			
		{
			System.out.println("Gender is Male");
			if(age>=21)
			{
				System.out.println("Married");
				
			}
			else
			{
				System.out.println("child");
				
			}		
		}
		else if(gender=='F')
		{
			System.out.println("Gender is Female");
			if(age>=18)
			{
			System.out.println("married");
			}
			else
			{
				System.out.println("Child");
			}
			
		}
		else
		{
			System.out.println("Enter a correct gender");
		}
	}
} 