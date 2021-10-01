package aggregation;

public class MobileInternet {
	public static void main(String args[])
	{	
		Internet internet=new Internet();
		internet.devices="computer";
		internet.smartobjects="echobot";
		internet.sensors="image sensors";
		
		Mobile mobile=new Mobile();
		mobile.name="mi";
		mobile.color="gold";
		mobile.price=1500;
		mobile.internet=internet; 
		
		
		
	
		   
		
		System.out.println("mobileinternet");
		System.out.println("devices:"+mobile.internet.devices);
		System.out.println("smartobjects:"+mobile.internet.smartobjects);
		
		
		
	}

}
