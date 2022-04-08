package loops;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for1();
		for2();	
	}
	public static void for1() {
		int sum=0;
		
		System.out.println("the sum of all no is :");
			for (int i=0; i<=5; i++) 
				sum=sum+i;
				System.out.println(sum);
	}
	public static void for2() {
		System.out.println("table of 4 is :\n");	
		for (int a=0;a<=40;a=a+4) {
				System.out.println(a);		
		}
	}
}
