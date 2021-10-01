package clone;

public  class Bus implements Cloneable {
 String name="scania";

Driver driver=new Driver();


public Bus clone() throws  CloneNotSupportedException{
	return(Bus) super.clone();
}


@Override
public String toString() {
	return "Bus [name=" + name + ", driver=" + driver + "]";
}
}