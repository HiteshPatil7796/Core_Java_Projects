package Revision.MethodOverloadingOverriding;

class Bankk
{
	public
		double rateofinterest()
		{
			return(0);
		}
}
class Kotak extends Bankk
{
	public
		double rateofinterest()
		{
			return(3.0);
		}
}
class SBI extends Bankk
{
	public
		double rateofinterest()
		{
			return(3.1);
		}
}
class ICICI extends Bankk
{
	public
		double rateofinterest()
		{
			return(3.2);
		}
}
public class Bank {

	public static void main(String[] args) {
		
		Bankk obj=new Bankk();
		System.out.println("Bankk :"+obj.rateofinterest());
		obj=new Kotak(); // upcasting
		System.out.println("Kotak :"+obj.rateofinterest());
		obj=new SBI();
		System.out.println("SBI :"+obj.rateofinterest());
		obj=new ICICI();
		System.out.println("ICICI :"+obj.rateofinterest());

	}

}
