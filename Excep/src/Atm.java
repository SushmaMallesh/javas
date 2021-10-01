import java.util.Scanner;

class LowbalanceException extends Exception{
	public LowbalanceException()
	{
		super("invalid amount");
	}
	
}
class Exceptiontest
{
	 public void atm(int a)
	 {
		 int amount=a;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter amount");
		 int withdraw=sc.nextInt();
		 if(amount<withdraw)
		 {
			 try {
				 throw new LowbalanceException();
			 }
			 catch(LowbalanceException e)
			 {
				 System.out.println("invalid amount"); 
			 }
		 }
		 else
		 {
			 int remain=amount-withdraw;
			 System.out.println("remainbalance:"+remain);
		 }
	 }

}

public class Atm
{
	public static void main(String[] args)
	{
		Exceptiontest obj=new Exceptiontest();
		obj.atm(10);
	}
}
