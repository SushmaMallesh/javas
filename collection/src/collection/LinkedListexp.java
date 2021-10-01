package collection;
import java.util.*;
public class LinkedListexp {
public static void main(String args[]) {
	LinkedList<String> list=new LinkedList();
	list.add("Aishu");
	list.add("tv");
	list.add("fan");
	list.add("pen");
	list.add("mobile");
	list.add("pencil");
	System.out.println(list);
	
	ListIterator<String> listItr=list.listIterator();
	while(listItr.hasNext()) {
		System.out.println(listItr=next());
	}

}

private static ListIterator<String> next() {
	// TODO Auto-generated method stub
	return null;
}
}


