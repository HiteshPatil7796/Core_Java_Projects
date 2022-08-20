package MethodOverloadingOverriding;

class Bankk {
	public
	float RateOfInterest()
	{
		return(0);
	}
}
class SBI extends Bankk
{
	public
		float RateOfInterest()
		{
			return(8.4f);
		}
}
class ICICI extends Bankk
{
	public
		float RateOfInterest()
		{
			return(9.7f);
		}
}
class AXIS extends Bankk
{
	public
		float RateOfInterest()
		{
			return(9.3f);
		}
}
public class Bank
{
	public static void main(String args)
	{
		Bankk b=new Bankk();
		System.out.println("Bank Rate Of Interest : "+b.RateOfInterest());
		b=new SBI();
		System.out.println("SBI Rate Of Interest : "+b.RateOfInterest());
		b=new ICICI();
		System.out.println("ICICI Rate Of Interest : "+b.RateOfInterest());
		b=new AXIS();
		System.out.println("AXIS Rate Of Interest : "+b.RateOfInterest());
	}
}