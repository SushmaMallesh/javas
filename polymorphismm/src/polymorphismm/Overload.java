package polymorphismm;

public class Overload {
	
	void searchbotton(String address)
	{
		System.out.println("address:"+address);
		
	}
	
	void searchbotton(int phno)
	{
		System.out.println("phno:"+phno);
		
	}
	
	void searchbotton(String address,String name) 
	{
		System.out.println("address and name:"+address+","+name);
		
	}
	void searchbotton(String name,String address,String email) 
	{
		System.out.println("address,name and email:"+address+","+name+","+email);
	}
	

}
