package InnerClasses;

class AA
{
	static int i;
	static class BB
	{
		int j;
	}
}
public class NonStaticcNestedClass {

	public static void main(String[] args) {
		
		AA.i=5;
		System.out.println("i : "+AA.i);
		
		AA.BB obj=new AA.BB();
		obj.j=15;
		System.out.println("j : "+obj.j);

		
	}

}
