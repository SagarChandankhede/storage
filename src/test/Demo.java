package test;

import accessIdentifier.Ai1;

public class Demo extends Ai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ai1 obj1=new Ai1();
		obj1.test();
		Demo obj=new Demo();
		obj.test2();
		
		System.out.println("call public variable "+obj1.b);
		System.out.println("call protected variable "+obj.c);
	}

}
