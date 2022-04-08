package loops;

public class Allloops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allloops obj=new Allloops();
		obj.test();
	
	}
	public Allloops() {
		
		for (int i=1; i<2; i++) {
			System.out.println("This is for incrementing ");
		}
		for (int i=2;i>=1;i--)	{
			System.out.println("This is for decrementing");
		
		}
	}	
	public void test() {
	int i=1;//local variable	

		System.out.println(i);
	
		while(i>-1) {
		System.out.println("This is while decrementing");
		i--;
		}
		System.out.println(i);
		while( i<2)//here reference value of i is minimum of i of previous while because of i--; 
		{
		i++;
		System.out.println("This is while incrementing");
		
				}
	}
	public void test1() {
	int i=1;//local variable	

		

		while( i<2)
		{
		i++;
		System.out.println("This is while incrementing");
		
				}
		System.out.println(i);
		while(i>-1)//here reference value of i is maximum of i of previous while because of i++; 
		{
		System.out.println("This is while decrementing");
		i--;
	}

	}
}

