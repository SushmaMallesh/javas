
public class Downcasting {
public static void main(String args[]) {
	Animal animal=new Dog();
	animal.eat();

	Dog dog=(Dog)animal;
	dog.eat();
	dog.bark();
	
	animal=new Cow();
	animal.eat();
	
	
}
}
