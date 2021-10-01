package collection;
import java.util.*;
public class Vectorexp {
	public static void main(String args[]) {
		Vector<Character> vec=new Vector();

		vec.add('A');
		vec.add('B');
		vec.add('C');
		vec.add('D');
		vec.add('E');
		vec.add('F');
		
		System.out.println("Vector:"+vec);
		
		Enumeration<Character> enumeration=vec.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
