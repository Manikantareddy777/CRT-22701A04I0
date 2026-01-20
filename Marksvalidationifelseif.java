class Marksvalidationifelseif
{
	public static void main(String[] args)
	{
		int marks=100;
		if(marks>=81 &&  marks<=100)
		{
			System.out.println("distinction");
		}
		else if(marks>=31 && marks<=80)
		{
			System.out.println("first class");
		}
		else if(marks>=0 && marks<=30)
		{
			System.out.println("bad fail");
		}
		else{
			System.out.println("invalid marks");
        }			
	}
}