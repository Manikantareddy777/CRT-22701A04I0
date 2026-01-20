class GradeValidation
{
	public static void main(String[] args)
	{
		char grade='B';
		switch(grade)
		{
			case 'A':System.out.println("Excellent ");
					break;
			case 'B':System.out.println("Good");
					break;
			case 'C':System.out.println("bad ;improve your studies");
					break;
		    default : System.out.println("invalid Grade");
		}
	}
}