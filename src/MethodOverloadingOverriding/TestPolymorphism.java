package MethodOverloadingOverriding;

class Bankkk {
	public
	float RateOfInterest()
	{
		return(0);
	}
}
class SBII extends Bankkk
{
	public
		float RateOfInterest()
		{
			return(8.4f);
		}
}
class ICICII extends Bankkk
{
	public
		float RateOfInterest()
		{
			return(9.7f);
		}
}
class AXISS extends Bankkk
{
	public
		float RateOfInterest()
		{
			return(9.3f);
		}
}
public class TestPolymorphism {

	public static void main(String[] args) {
		
		Bankkk b=new Bankkk();
		System.out.println("Bank Rate Of Interest : "+b.RateOfInterest());
		b=new SBII(); // upcasting
		System.out.println("SBI Rate Of Interest : "+b.RateOfInterest());
		b=new ICICII();
		System.out.println("ICICI Rate Of Interest : "+b.RateOfInterest());
		b=new AXISS();
		System.out.println("AXIS Rate Of Interest : "+b.RateOfInterest());
	}

}
