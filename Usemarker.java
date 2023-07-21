package for3;

public class Usemarker {
	public static void main(String[] args) {
		Marker marker=new Marker();
		marker.brand="nokia";
		marker.colour="Red";
		marker.price=10000;
		marker.shape="round";
		
		Marker marker1=new Marker();
		marker1.brand="oppo";
		marker1.colour="blue";
		marker1.price=70;
		marker1.shape="oval";
		
		Marker marker2=new Marker();
		marker2.brand="redmi";
		marker2.colour="block";
		marker2.price=90;
		marker2.shape="cyclindar";
		Marker[] markers= {marker,marker1,marker2};
		for(int i=0;i<markers.length;i++) {
			System.out.println(markers[i].price+", "+markers[i].brand+","+markers[i].colour+","+markers[i].shape);
			
		}
		int count=0;
		int total=0;
		for(int j=0;j<markers.length;j++) {
			total=total+markers[j].price;
			count++;
		}
		System.out.println(total);
		System.out.println(total/count);
		}}
