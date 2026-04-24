package CONSTRUCTOROVERLOADING;

class A {
	A(String brand){
		System.out.println("Braand :"+brand);
		
	}
	A(String brand,int cost){
		System.out.println("brand :"+brand+" cost :"+cost);
	
	}
	A(int cost,String brand)
	{
		System.out.println("cost is :"+cost+" brand is: "+brand);
	}
	A(String brand,String fuel)
	{
		System.out.println("brand is : "+brand+" fuel is : "+fuel);
	}
	A(int id,double code,String name)
	{
		System.out.println("id is: "+id+" code is: "+code+" name is : "+name);
		
	}
	A(){
		System.out.println("constructor overloading we learning");
	}
	public static void main(String[] args) {
		new A();
		new A("BMW");
		new A("hyundai",100000);
		new A(7013,5.55,"mani");
		new A("mahindra","petrol");
		new A(50000,"honda ");
		
		
	}
	

}
