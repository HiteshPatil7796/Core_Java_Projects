package String;

import java.util.Scanner;

public class Concatenete {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Java";
		
		String con=str1.concat(str2); // 1)using  Concat  function
		System.out.println(con);
		
		String st="Rahul";
		String st1="Dravid";
		String st2=st+st1;
		String st3="Mahendra"+"Singh"+"Dhoni"; // using + operator
		System.out.println(st2);
		System.out.println(st3);
		
		String s1,s2,s3;
		Scanner obj=new Scanner(System.in); // using scanner 
		
		System.out.println("ENter first string : ");
		s1=obj.next();
		
		System.out.println("ENter second string : ");
		s2=obj.next();
		
		s3=s1+s2;
		
		System.out.println(s3);
		s3=s1.concat(s2);
		System.out.println(s3);
		
		
		
		
	}

}
