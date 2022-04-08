package abstractClass;

public abstract class Sample {
	//Abstract class is incomplete class
	
	public static void main(String[] args) {
		//Sample s=new Sample(); object can not created in abstract method
	}	
			


	public void test() {
		
		System.out.println("this is complete Method");
	
		
	}
	
	public void test1() {
		//method have body
		//even if body is empty, this is complete method
	
	}
	
	public abstract void test2();//this is incomplete method
	
}
