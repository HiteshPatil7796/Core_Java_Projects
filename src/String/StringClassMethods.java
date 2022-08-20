package String;

public class StringClassMethods {

	public static void main(String[] args) {
		
		// 1) CharAt
		String str="Spark";
		System.out.println("Chat At : "+str.charAt(2));

		// 2) equalsIgnoreCase()
		String str1="Java";
		System.out.println("equals ignore case : "+str1.equalsIgnoreCase("JAVA"));
		
		//3)Length
		String str2="Java";
		System.out.println("Length : "+str2.length());
		
		//4)replace
		String str3="Change me";
		System.out.println("Replace "+str3.replace("m", "M"));
		
		//5)Substring
		String str4="0123456789";
		System.out.println("Substring : "+str4.substring(4));
		System.out.println("Substring : "+str4.substring(4, 7));
		
		//6)toLowerCase
		String str5="ABCD";
		System.out.println("To Lower case : "+str5.toLowerCase());
		
		//7)toUppercase
		String str6="abcd";
		System.out.println("To uppercase : "+str6.toUpperCase());
		
		//trim
		String str7="     Hello     ";
		System.out.println("Trim : "+str7.trim());
	}

}
