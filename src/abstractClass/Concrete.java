package abstractClass;

public class Concrete extends Sample {

	public static void main(String[] args) {
		
		Concrete obj=new Concrete();
		obj.test();
		obj.test1();
		obj.test2();
		
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2 method completed in concrete class");
	}
	
	public void test1() {
		System.out.println("Method from concrete class");
		System.out.println("this is new added line for git study");
		System.out.println("adding one more line for github");
	}
}
