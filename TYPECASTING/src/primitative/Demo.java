package primitative;

public class Demo {

	public static void main(String[] args) {
		System.out.println("widening");
		int a=12;
		float b=a;
		System.out.println(b);
		
		double c = b;
		System.out.println(c);
		
		char l='a';
		int m=l;
		System.out.println(l+" "+m);
		
		
		System.out.println("narrowing");
		double d= 22.44;
		int e=(int)d;
		System.out.println(e);
		
		char f='A';
		int g= (int)f;
		System.out.println(f+" "+g);
		
		System.out.println("A"+"B");
		
		System.out.println('x'+'y');
		System.out.println('Z'+1);
		System.out.println('a'+1);
		System.out.println('z'+1);
		System.out.println(97-122);
		
		
		

	}

}
