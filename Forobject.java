package for3;

public class Forobject {
public static void main(String[] args) {
	Car car=new Car();
	car.company="amu";
	car.model="nissan";
	car.cc=1101;
	car.price=1000000;
	Car car1=new Car();
	car1.company="nokia";
	car1.model="maruthi";
	car1.cc=187;
	car1.price=2000033;
	Car car2=new Car();
	car2.company="mitsuba";
	car2.model="hontai";
	car2.cc=3763;
	car2.price=4288888;
	Car[] cars= {car,car1,car2};
	
	for(int i=0;i<=cars.length-1;i++) {
		System.out.println(cars[i].company+(",")+cars[i].model.toUpperCase());
	}
	Car max=cars[0];
	for(int j=0;j<=cars.length-1;j++) {
		if(max.price<cars[j].price) {
			max=cars[j];
		}
	}
	System.out.println(max.company+","+max.price+","+max.cc+","+max.model);
Car min=cars[0];
for(int k=0;k<=cars.length-1;k++) {
	if(min.cc>cars[k].cc) {
		min=cars[k] ;
	}}
System.out.println(min.cc);
	
	
}
	
}
	
	
	
	
	