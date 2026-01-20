class Manager
{
	int expanses=30000;
	public static void main(String[] args)
	{
		Manager M=new Manager();
		Employee E1=new Employee();
		System.out.println(E1.id);
		System.out.println(E1.name);
		System.out.println(E1.salary);
		System.out.println(M.expanses);
		System.out.println("----------------");
		System.out.println("MY ID IS: "+E1.id);
		System.out.println("MY NAME IS "+E1.name);
		System.out.println("MY SALARY IS "+E1.salary);
		System.out.println("MY EXPANSES IS :"+M.expanses);
		System.out.println("total balance for savings: "+(E1.salary-M.expanses));
	}
}