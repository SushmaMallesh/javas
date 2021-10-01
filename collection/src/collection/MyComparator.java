package collection;

public class MyComparator implements Comparator {

	public int compare(Character c1,Character c2) {
		if(c1<c2) {
			return 1;
			
		}
		else if(c1>c2) {
			return -1;
			
		}else {
			return 0;
		}
			
	}
	
}
