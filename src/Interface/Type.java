package Interface;

interface Moveablee
{
	boolean isMoveable(); 
}
interface Rollable
{
	boolean isRollable();
}
public class Type implements Moveablee,Rollable{

	
	
			public  boolean isMoveable()
			{
				return true;
			}
			public boolean isRollable()
			{
				return true;
			}
	public static void main(String[] args) {
		
		Type obj=new Type();
		System.out.println(obj.isMoveable());
		System.out.println(obj.isRollable());

	}

}
