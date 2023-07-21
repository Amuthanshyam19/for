package for3;

public class A {
	public static void main(String[] args) {
		Ac ac=new Ac();
		ac.brand="nokia";
		ac.tens=2.6f;
		ac.iswarranty=1;
		ac.price=20000;
		Ac ac1=new Ac();
		ac1.brand="samsung";
		ac1.tens=8.6f;
		ac1.iswarranty=2;
		ac1.price=50000;
		Ac ac2=new Ac();
		ac2.brand="LG";
		ac2.tens=5.6f;
		ac2.iswarranty=3;
		ac2.price=30000;
		Ac[] acs= {ac,ac1,ac2};
		for(Ac a:acs) {
			System.out.println(a.price+","+a.tens+","+a.iswarranty+","+a.brand);
		}
		int total=0;
			for(Ac b:acs) {
				total=total+b.price;
			}
				System.out.println(total);

			String max=acs[0].brand;
			for(Ac c:acs) {
				if(max.length()<c.brand.length()) {
					max=c.brand;
			}
				System.out.println(max);
			}
				float min=acs[0].tens;
				for(Ac d:acs) {
					if(d.tens<min) {
						
					}
					System.out.println(min);
					for(Ac e:acs) {
						if(e.brand.contains("a")||e.brand.contains("e")||e.brand.contains("u")||e.brand.contains("i")||e.brand.contains("o")) {
							System.out.println(e.brand);
						}}
				}
	}
}
			
	
