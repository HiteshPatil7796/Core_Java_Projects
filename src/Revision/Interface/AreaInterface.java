package Revision.Interface;

interface AreaOfCircle
{
	double Circle(double r);
}
interface AreaOfRect
{
	int rect(int l,int b,int h);
}
public class AreaInterface implements AreaOfCircle,AreaOfRect {

	
	public double Circle(double r)
	{
		return(3.14*r*r);
	}
	public int rect(int l,int b,int h)
	{
		return(l*b*h);
	}
	
	public static void main(String[] args) {
		
		AreaInterface obj=new AreaInterface();
		System.out.println("Area of circle : "+obj.Circle(2));
		System.out.println("Area of Rect : "+obj.rect(2, 3, 4));

	}

}
