package Revision.Constructor;

class Boxone
{
	private
			int l,b,w;
	public
			Boxone(int l,int b,int w)
			{
				this.l=l;
				this.b=b;
				this.w=w;
			}
			public String toString()
			{
				return("Length : "+l+" Width : "+w+" Bredth : "+b);
			}
}
public class Box {

	public static void main(String[] args) {
		
		Boxone obj=new Boxone(1,2,3);
		System.out.println(obj);

	}

}
