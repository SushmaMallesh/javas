package polymorphismm;

public class MethodOverloading {
	public static void main(String args[])
	{
		Overload ol=new Overload();
		ol.searchbotton("pipeline");
		ol.searchbotton("pipeline","aishu");
		ol.searchbotton(9999);
		ol.searchbotton("pipeline","aishu","aishu@email");
	}

}
