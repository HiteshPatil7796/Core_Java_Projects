package Interface;
interface AreaOfCircle
{
	float circle(float r);
}
interface AreaOfRect
{
	int rect(int l,int b, int h);
}
public class AreaInterface implements AreaOfCircle,AreaOfRect {

	
		public float circle(float r)
		{
			return(3.14f*r*r);
		}
		public int rect(int l,int b,int h)
		{
			return(l*b*h);
		}
	public static void main(String[] args) {
		
		AreaInterface obj=new AreaInterface();
		System.out.println("Area of Circle : " +obj.circle(2));
		System.out.println("Area of Rect : "+obj.rect(5,2,6));

	}

}
