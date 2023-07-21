package for3;

public class UseShoe {
public static void main(String[] args) {
	String[]a=args[0].split(",");
	Shoe shoe1=new Shoe();
	shoe1.brand=a[0].toUpperCase();
	shoe1.price=Integer.parseInt(a[1])+500;
	shoe1.color=(a[2]).toUpperCase();
	shoe1.discountAmount=Integer.parseInt(a[3]);
	shoe1.netprice=shoe1.price-shoe1.discountAmount;
	String[]b=args[0].split(",");
	Shoe shoe2=new Shoe();
	shoe2.brand=b[0].toUpperCase();
	shoe2.price=Integer.parseInt(b[1]);
	shoe2.color=(b[2]).toUpperCase();
	shoe2.discountAmount=Integer.parseInt(b[3]);
	shoe2.netprice=shoe2.price-shoe2.discountAmount;
	String[]c=args[0].split(",");
	Shoe shoe3=new Shoe();
	shoe3.brand=c[0].toUpperCase();
	shoe3.price=Integer.parseInt(c[1]);
	shoe3.color=(c[2]).toUpperCase();
	shoe3.discountAmount=Integer.parseInt(c[3]);
	shoe3.netprice=shoe3.price-shoe3.discountAmount;
	
	Shoe shoes[]= {shoe1,shoe2,shoe3};

	for(int i=0;i<=shoes.length-1;i++) {
	
	System.out.println("BRAND="+shoes[i].brand+","+"COLOR="+shoes[i].color+","+"NETPEICE="+shoes[i]+shoes[i].netprice);	
		
	}
		
		
		
		
		
		
	}
}

