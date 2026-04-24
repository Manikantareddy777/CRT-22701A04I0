package compiletime;

public class Customer {

	public static void main(String[] args) {
		
		Myntra m=new Myntra();
		m.purchase(101);
		m.purchase(5000, "mobile");
		m.purchase("laptop");
		m.purchase("shoe",2000);

	}

}
