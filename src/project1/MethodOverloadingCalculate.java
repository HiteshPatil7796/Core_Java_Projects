package project1;

class calc
{
	public
			void calculate(int a, int b)
			{
				System.out.println(a+b);
			}
			void calculate(double a,double b)
			{
				System.out.println(a+b);
			}
}
public class MethodOverloadingCalculate {

	public static void main(String[] args) {
		
		calc obj=new calc();
		obj.calculate(5, 5);
		obj.calculate(1.1, 1.1);

	}

}
