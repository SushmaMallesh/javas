package collection;

import java.util.TreeSet;
import java.util.*;

public class Comparator {
	private static final java.util.Comparator MyComparator = null;

	public static void main(String args[]) {
		TreeSet<Character> set=new TreeSet(MyComparator);
		   set.add('a');
		   set.add('b');
		   set.add('e');
		   set.add('c');
		   set.add('d');
		   System.out.println(set);
		   
}
}

