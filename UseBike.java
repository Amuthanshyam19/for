package for3;

public class UseBike {
		  public static void main(String[] args) {
			Bike b1= new Bike();
			b1.brand="tvs";
			b1.price=50000;
			b1.model="jupiter";
			b1.cc=110;
			Bike  b2=new Bike();
			b2.brand="bajay";
			b2.price=60000;
			b2.model="pulsar";
			b2.cc=110;
			Bike b3=new Bike();
		    b2.brand="honda";
		    b2.price=80000;
		    b2.model="dio";
		    b1.cc=110;
		    Bike b4=new Bike();
	     	b1.brand="honda";
	     	b1.price=67000;
	     	b1.model="jupiter";
	     	b1.cc=124;
	     	Bike[] bikes= {b1,b2,b3,b4};
	     	for(int i=0;i<=bikes.length-1;i++) {
	     		System.out.println(bikes[i].brand+" "+bikes[i].price+" "+bikes[i].model+" "+bikes[i].cc);
	     	}
	   int max=bikes[0].price;
	     	for(int i=0;i<=bikes.length-1;i++) {
	         if(max<bikes[i].price) {
	        	 max=bikes[i].price;
	         }
	     	}

	     	System.out.println(max);
}
}
