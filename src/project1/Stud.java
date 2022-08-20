package project1;

import java.util.Scanner;

class Student
{
	private	
			String name;
			int rollno;
			float marks;
	public
			void accept()
			{
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Name : ");
				name=obj.next();
				
				System.out.println("Enter Roll No : ");
				rollno=obj.nextInt();
				
				System.out.println("Enter Marks : ");
				marks=obj.nextInt();
			}
		
			void display()
			{
				System.out.println("Name   : "+name);
				System.out.println("RollNo : "+rollno);
				System.out.println("Marks  : "+marks);
			}
}

public class Stud {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.accept();
		s1.display();

	}

}
