package loops;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("this is Multiplyer of 2 :\n");	
	Dowhile obj=new Dowhile();
	obj.test(0);
	}
	public void test(int a) {
		
		
		do {
			
			int b=a%2;//use for odd and even search it on google
			if(b==0) {
				System.out.println(a+" even no : "+a*a);
			}else {
				System.out.println(a+" odd no  : "+a*a*a);
			}a++;
		} while (a<=10);
		
	}
}