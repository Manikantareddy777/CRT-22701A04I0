package classcastexceptionandinstanceof;

public class Runner {

	public static void main(String[] args) 
	{
		Father f= new Father();
		Son s=new Son();
		Daughter d=new Daughter();

		System.out.println(f instanceof Father);//true
		System.out.println(s instanceof Son);//true
		System.out.println(d instanceof Daughter);//true
		System.out.println("----------------------------");
		System.out.println(s instanceof Father);//true
		System.out.println(d instanceof Father);//t
		System.out.println(f instanceof Son);//f
		System.out.println(f instanceof Daughter);//f
		System.out.println("___________________-----------------");
		System.out.println(new Son() instanceof Father);//t
		System.out.println(new Daughter() instanceof Father);//t
		System.out.println(new Father() instanceof Son);//f
		System.out.println(new Father() instanceof Daughter) ;//f
		
		
	}
}
