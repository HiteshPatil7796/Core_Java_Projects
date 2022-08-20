package Revision.Constructor;
class Trainer
{
	String tname;
	String skill;
	int exp;
	public
		Trainer(String tname, String skill, int exp)
		{
			this.tname=tname;
			this.skill=skill;
			this.exp=exp;
		}
}
public class Client extends Trainer{

	String cname;
	long cno;
	public
		Client(String tname,String skill, int exp, String cname, long cno)
		{
			super(tname, skill, exp);
			this.cname=cname;
			this.cno=cno;
		}
		
		void display()
		{
			System.out.println("Trainer Name : "+tname);
			System.out.println("Trainer Skill : "+skill);
			System.out.println("Trainer Experience: "+exp);
			System.out.println("Client Name : "+cname);
			System.out.println("Client Contact no : "+cno);
		}
	public static void main(String[] args) {
		
		Client obj=new Client("Trainer1","Workout",5,"clientone",789654123);
		obj.display();

	}

}
