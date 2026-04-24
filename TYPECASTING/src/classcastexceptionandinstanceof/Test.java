package classcastexceptionandinstanceof;

public class Test {

	public static void main(String[] args) {
		
		Father f=new Son();
		System.out.println(f.x);
		System.out.println("--------------------------");
		Son s=(Son) f;
		System.out.println(s.x+" this is the x vlaue\nthis is the sons value "+s.y);

	}

}
