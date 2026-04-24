package electronics;
import java.util.Scanner;
public class User {
	

	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the choice\n1:Laptop\n2:Mobile");
		int choice=s.nextInt();
		Electronics e=f.shoping(choice);
		if(e instanceof Laptop) {
			System.out.println("laptop is ordered");
		}
		else if(e instanceof Mobile){
			System.out.println("Mobile is ordered");
		}
	}

}
