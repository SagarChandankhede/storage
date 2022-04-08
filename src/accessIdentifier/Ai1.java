package accessIdentifier;

public class Ai1 {
	 
	int a=10;//default global variable
	public int b=11;//public global variable
	protected int c=12;//protected global variable
	private int d=13;//private global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ai1 obj=new Ai1();
		obj.test();//public method can call throughout the project
		
		obj.test3();
		
		System.out.println("call public variable "+obj.b);
		System.out.println("call default variable "+obj.a);
		System.out.println("call protected variable "+obj.c);
		System.out.println("call private variable "+obj.d);
	}
	
	public void test() {
		System.out.println("public variable calling from same class :-"+b);
	}
	void test1() {
		System.out.println("Default variable calling from same class :-"+a);
	}
	protected void test2() {
		System.out.println("protected variable calling from same class :-"+c);
	}
	private void test3() {
		System.out.println("private variable calling from same class :-"+d);
	}
}
