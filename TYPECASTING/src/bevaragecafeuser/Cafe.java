package bevaragecafeuser;

public class Cafe{
	Bevarage vendingMachine(int choice) {
		if(choice==1) {
			Tea t=new Tea();
			return t;
		}
		else if(choice==2) {
			Coffee c=new Coffee();
			return c;
		}
		return null;
		

	}

}
