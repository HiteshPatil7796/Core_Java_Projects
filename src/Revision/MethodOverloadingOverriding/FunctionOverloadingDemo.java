package Revision.MethodOverloadingOverriding;

public class FunctionOverloadingDemo {

	void area(int l,int b)
	{
		System.out.println("Area is :  "+l*b);
	}
	void area(int l,int h,int b)
	{
		System.out.println("Area is : "+l*b*h);
	}
	public static void main(String[] args) {
		
		FunctionOverloadingDemo obj=new FunctionOverloadingDemo();
		obj.area(5,3);
		obj.area(5,3,2);
	}

}
