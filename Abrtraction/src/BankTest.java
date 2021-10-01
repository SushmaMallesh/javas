
class BankTest {
public static void main(String args[]) {
	Bank b;
	b=new Sbi();
	System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");
	b=new Hdfc();
	System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");
	
}
}
