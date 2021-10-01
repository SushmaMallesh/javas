package collection;
import java.util.ArrayList;
import java.util.Iterator;


public class Array {

	
public static void main(String args[]) {
	
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(5);
	
	ArrayList smallList=new ArrayList();
	
	smallList.add(12);
	smallList.add(122);
	smallList.add(123);
	smallList.add(124);
	smallList.add(125);
	
	list.addAll(smallList);
	System.out.println("list:"+list);
	
	
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		Integer i=(Integer)itr.next();
		if(i%2==0) {
			System.out.println(i);
			
		}
	}
}

}
