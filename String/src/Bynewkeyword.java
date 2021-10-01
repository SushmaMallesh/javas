
public class Bynewkeyword {

	public static void main(String args[]) {
		
		String str=new String("aishu");
		String str1=str.intern();
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		
		String str2=new String("aishu");
		
		System.out.println(str==str2);
		System.out.println(str==str1);
		
		
	}
}
