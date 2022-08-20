package constructor;

class Boxone
{
	private
			int width,height,depth;
	public
			Boxone(int w,int h,int d)
			{
				this.width=w;
				this.height=h;
				this.depth=d;
			}
			public String toString()
			{
				return("width: "+width+" height : "+height+" depth : "+depth);
			}
}
public class Box {

	public static void main(String[] args) {
		
		Boxone obj=new Boxone(2,3,4);
		System.out.println(" "+obj);

	}

}
