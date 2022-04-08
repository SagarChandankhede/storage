package this_super;

public class Dell extends Laptop {
	int a =10;
	
	public void display() {
		int a=20;//local variable
		
		int sum=10+a;
		System.out.println("sum of A is "+sum);
		
		int sum1=10+this.a;
		System.out.println("sum of global A from same class "+sum1);
		
		int sum2=10+super.a;
		System.out.println("sum of global A from diff class "+sum2);
	}
	
	public static void main(String[] args) {
		
		Dell obj=new Dell();
		obj.display();
		
	}
	
}

