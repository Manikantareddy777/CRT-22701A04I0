package CONSTRUCTOROVERLOADING;

class B {
	B(){
		System.out.println("entering & playing");
	}
	B(String item,int cost){
		System.out.println(item+"\n"+cost);
	}
	B(String phone,int cost,String ram){
		System.out.println(phone+"\n"+cost+"\n"+ram);
	}
	public static void main(String[] args) {
		new B();
		System.out.println("----------------");
		new B("bag",2500);
		System.out.println("-----------------");
		new B("poco",15000,"6gb");
	}

}
