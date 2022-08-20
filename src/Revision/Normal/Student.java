package Revision.Normal;

import java.util.Scanner;

class info
{
	private
			String name;
			int rollno;
			int marks;
	public
			void accept()
			{
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Name of Student : ");
				name=obj.next();
				System.out.println("Enter Roll no of Student : ");
				rollno=obj.nextInt();
				System.out.println("Enter Marks of Student : ");
				marks=obj.nextInt();
			}
			void display()
			{
				System.out.println("Student Name : "+name);
				System.out.println("Student Roll no : "+rollno);
				System.out.println("Student Marks : "+marks);
			}
}
public class Student {

	public static void main(String[] args) {
		
		info obj=new info();
		obj.accept();
		obj.display();

	}

}
