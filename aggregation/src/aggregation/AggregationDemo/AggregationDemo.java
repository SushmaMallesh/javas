package aggregation.AggregationDemo;

public class AggregationDemo {
public static void main(String arg[])
{
	Student student=new Student();
	student.name="ab";
	student.id=100;
	student.collegename="aps";
	
	Library library=new Library();
	library.name="lk";
	library.location="bb";
	library.contactnumber=12l;
	library.student=student;
	
	System.out.println("name:"+library.student.name);
	
	
	
	
}
}
