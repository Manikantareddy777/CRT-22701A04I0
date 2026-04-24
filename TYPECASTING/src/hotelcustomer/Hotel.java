package hotelcustomer;

public class Hotel {
	
		Food foododered (int choice){
			
			if(choice==1)
			{
				Idly i=new Idly();
				return i;
			}
			else if(choice==2)
			{
				Dosa d= new Dosa();
				return d;
			}
			else  if(choice==3)
			{
				Vada v=new Vada();
				return v;
			}
			return null;
	}
}
