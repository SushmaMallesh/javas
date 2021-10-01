package composition;

public class BirdWings {
	public static void main(String args[])
	
	{
		Wings wings=new Wings();
	    wings.color="blue";
	
		Bird bird=new Bird();
		bird.Name="parrot";
		bird.Color="green";
		bird.wings=wings;
		
		
		System.out.println("color:"+bird.wings.color);
		
		
	} 

} 
