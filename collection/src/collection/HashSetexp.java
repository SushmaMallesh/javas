package collection;
import java.util.*;
public class HashSetexp {
public static void main(String args[]) {
	HashSet<Character> set=new HashSet();
	set.add('a');
	set.add('b');
	set.add('c');
	set.add('d');
	System.out.println(set);
	
	Iterator<Character>setItr=set.iterator();
	while(setItr.hasNext()) {
		System.out.println(setItr.next());
	}
}
}
