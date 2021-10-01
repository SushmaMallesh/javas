package collection;

public class Perfume {
String brand;
String flavor;
double price;
String type;

public Perfume(String brand,String flavor,double price,String type) {
	this.brand=brand;
	this.flavor=flavor;
	this.price=price;
	this.type=type;
	
}

@Override
public String toString() {
	return "Perfume [brand=" + brand + ", flavor=" + flavor + ", price=" + price + ", type=" + type + "]";
}


}