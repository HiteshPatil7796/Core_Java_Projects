package Enumeration;

enum weekdays
{
	sun,mon,tue,wedn,thurs,fri,sat;
}
public class EnumDemo {

	public static void main(String[] args) {
		
		weekdays wk;
		wk=weekdays.wedn;
		System.out.println("today is : "+wk);
	}

}
