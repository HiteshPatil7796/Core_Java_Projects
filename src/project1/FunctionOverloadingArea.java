package project1;

public class FunctionOverloadingArea {

	void area(long l,long b)
	{
		System.out.println("Area is : "+l*b);
	}
	void area(int l,int b,int h)
	{
		System.out.println("Area is : "+l*b*h);
	}
	
	public static void main(String[] args) {
		
		FunctionOverloadingArea obj=new FunctionOverloadingArea();
		
		obj.area(5, 5);//typpe conversion fromm long to int 
		obj.area(2, 3, 4);
		

	}

}
