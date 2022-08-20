package Revision.MethodOverloadingOverriding;

public class MethodOverloadingCalculate {

	void calculate(int a,int b)
	{
		System.out.println(a+b);
	}
	void calculate(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		MethodOverloadingCalculate obj=new MethodOverloadingCalculate();
		obj.calculate(5, 5);
		obj.calculate(2.2, 2.2);

	}

}
