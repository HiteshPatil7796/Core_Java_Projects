package constructor;

class Trainer
{
	String tname;
	String skill;
	int texperience;
	public
		Trainer(String n,int e,String s)
		{
			this.tname=n;
			this.texperience=e;
			this.skill=s;
		}
}
public class Client extends Trainer{

	String cname;
	long mn;
	public
		Client(String n,int i,String s,String cn,long mn)
		{
			super(n,i,s);
			this.cname=cn;
			this.mn=mn;
		}
		void display()
		{
			System.out.println("Trainer name : "+tname);
			System.out.println("Trainer Experience : "+texperience);
			System.out.println("Trainer Skill : "+skill);
			System.out.println("Client name : "+cname);
			System.out.println("Client Mobile no : "+mn);
		}
	public static void main(String[] args) {
		
		Client obj=new Client("Trainer",5,"Workout","Clientone",1234578);
		obj.display();
	}

}
