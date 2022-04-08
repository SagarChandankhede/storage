package accessIdentifier;

public class Ai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ai1 obj=new Ai1();
		obj.test();
		obj.test1();
		obj.test2();
		//obj.test3();  private method can't be called in another class
		
		System.out.println("call public variable "+obj.b);
		System.out.println("call default variable "+obj.a);
		System.out.println("call protected variable "+obj.c);
		//System.out.println("call private variable "+obj.d);  private variable can't be called in another class
	}

}
