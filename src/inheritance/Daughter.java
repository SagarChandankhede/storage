package inheritance;

public class Daughter extends Mother {
	
	 int a=100;
	
	public void jwell() {
		System.out.println("daughter has jwell");
	}
	public static void money() {
		System.out.println("honey is money fro daughter");
	}
	
	
	
	public static void main(String[] args) {
		home();
		System.out.println("calling static c value from mother class as it is extended c = "+c);
	}
	
}
