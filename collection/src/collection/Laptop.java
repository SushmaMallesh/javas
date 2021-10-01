package collection;

public class Laptop {
	String brand;
	int price;
	String color;
	 
	
	public Laptop(String brand, int price, String color) {

		this.brand=brand;
		this.price=price;
		this.color=color;
		
	}


	


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", color=" + color + "]";
		
	}
	
}
