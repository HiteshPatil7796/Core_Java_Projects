package project1;

public class CallByValue {

	public void callbyvalue(int x) {
		x=100;
	}
	public static void main(String[] args) {
		
		int x=50;
		CallByValue c1=new CallByValue();
		c1.callbyvalue(x);
		System.out.println(x);
	}

}
