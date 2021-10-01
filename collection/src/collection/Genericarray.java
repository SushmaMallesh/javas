package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Genericarray {

	
	public static void main(String[] args)
	{
		
	Laptop dell=new Laptop("dell",25000,"black");

	Laptop dell1=new Laptop("dell1",20000,"silver");
	
	
	
	Laptop hp=new Laptop("hp",50000,"black");
	Laptop hp1=new Laptop(" hp1",25000,"silver");
	
	
	
	Laptop apple=new Laptop("apple",35000,"black");
	Laptop apple1=new Laptop("apple1",225000,"silver");
	

		
	
	
	Laptop[] laptopp= {dell,dell1,hp,hp1,apple,apple1};

	
	for(Laptop laptop :laptopp) {
		if(laptop.color.equals("black") ){
			
			System.out.print(laptop.color);
		}
		
	}
	
	
	
		ArrayList<Laptop>laptopList=new ArrayList();
		
		
		
		laptopList.add(dell);
		laptopList.add(dell1);
		laptopList.add(apple);
		laptopList.add(apple1);
		laptopList.add(hp);
		laptopList.add(hp1);
		
		
		
		
		
		System.out.println("laptopList:"+laptopList);
		
		Iterator itr=laptopList.iterator();
		while(itr.hasNext())
		{
			
				System.out.println(itr.next());
				
			}

		
}
}
