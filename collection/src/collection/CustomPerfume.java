package collection;

import java.util.HashSet;

public class CustomPerfume {
public static void main(String args[]) {
	Perfume fogg=new Perfume("fogg","noflavor",200,"strong");
	Perfume wattagirl=new Perfume("wattagirl","rose",400,"strong");
	Perfume titian=new Perfume("titian","noflavor",240,"weak");
	Perfume axe=new Perfume("axe","jasmine",250,"weak");
	
	
	HashSet<Perfume>PerfumeSet=new HashSet();
	PerfumeSet.add(fogg);
	PerfumeSet.add(wattagirl);
	PerfumeSet.add(titian);
	PerfumeSet.add(axe);
	for(Perfume perfume:PerfumeSet) {
	System.out.print(PerfumeSet);

	
}
	System.out.println();
}
}
