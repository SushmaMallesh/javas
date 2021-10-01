
public class Ipad {

	String brand;
	String ramsize;
	String cameraquality;
	double price;
	
	Ipad(String  brand,String ramsize,String cameraquality,double price){
		this.brand=brand;
		this.cameraquality=cameraquality;
		this.ramsize=ramsize;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Ipad [brand=" + brand + ", ramsize=" + ramsize + ", cameraquality=" + cameraquality + ", price=" + price
				+ "]";
	}
}
