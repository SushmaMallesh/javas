package clone;

public class TestClone {
	public static void main(String args[]) {
Bus bus=new Bus();
Bus copyOfBus=null;
try {
	copyOfBus = (Bus)bus.clone();
	
}
catch(CloneNotSupportedException e) {
	e.printStackTrace();
	
}
System.out.println(bus);
System.out.println(copyOfBus);


bus.name="volvo";
System.out.println(bus);
System.out.println(copyOfBus);

bus.driver.name="shakar";
System.out.println(bus);
System.out.println(copyOfBus);
}
}