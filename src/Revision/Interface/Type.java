package Revision.Interface;

interface Moveable
{
	boolean isMoveable();
}
interface Rollable
{
	boolean isRollable();
}
public class Type implements Moveable,Rollable{
	
	public boolean isMoveable()
	{
		return true;
	}
	public boolean isRollable()
	{
		return false;
	}

	public static void main(String[] args) {
		
		Type obj=new Type();
		System.out.println(obj.isMoveable());
		System.out.println(obj.isRollable());
		

	}

}
