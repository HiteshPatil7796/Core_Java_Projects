package Collection;

import java.util.ArrayList;

class Contact
{
	String firstname;
	String lastname;
	String phonenum;
	
	public Contact(String fn,String ln,String pn)
	{
		firstname=fn;
		lastname=ln;
		phonenum=pn;
	}
	public String toString()
	{
		return("First Name : "+firstname+" Last name : "+lastname+" Phone num : "+phonenum);
	}
}
public class ArrayListPhoneBook {

	public static void main(String[] args) {
		
		Contact c1=new Contact("Hitesh","Patil","001");
		Contact c2=new Contact("Ram","Kapoor","002");
		Contact c3=new Contact("Ravan","Lankesh","003");
		
		ArrayList<Contact>c=new ArrayList<Contact>(0);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		System.out.println(c);

	}

}