package hotelcustomer;

public class Customer {

	public static void main(String[] args) {
		Hotel h= new Hotel();
		Food obj=h.foododered(2);
		if(obj instanceof Idly) {
			System.out.println("idly food is ordered");
		}
		if(obj instanceof Dosa) {
			System.out.println("dosa food is ordered");
		}
		if(obj instanceof Vada) {
			System.out.println("vada food is Ordered");
		}
		
	}

}
