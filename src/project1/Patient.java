package project1;

public class Patient {
	
	String p_name;
	int p_id;
	String p_desease;
	
	public
		Patient()
		{
			p_name="";
			p_id=0;
			p_desease="";
		}
		Patient(String n,int i, String d)
		{
			p_name=n;
			p_id=i;
			p_desease=d;
		}
		Patient(Patient obj)
		{
			p_name=obj.p_name;
			p_id=obj.p_id;
			p_desease=obj.p_desease;
		}
		public String toString()
		{
			return ("Patient name : "+p_name+" Patient Id : "+p_id+" Patient Desease : "+p_desease);
		}

	public static void main(String[] args) {
		
		Patient p1=new Patient();
		p1.p_name="One";
		p1.p_id=1;
		p1.p_desease="h1n1";
		System.out.println(p1);
		Patient p2=new Patient("Two",2,"corona");
		System.out.println(p2);
		Patient p3=new Patient(p2);
		System.out.println(p3);

	}

}
