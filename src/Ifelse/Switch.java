package Ifelse;

public class Switch {
	
	public static void add(int m, int n) {
		int add=m+n;
		System.out.println("addition is "+add);
	}
	public void sub() {
		int m=10,n=8;
		int s=m-n;
		System.out.println("subtraction is "+s);
	}
	public static void multi()
	{
		int m=10,n=8;
		int multi=m*n;
		System.out.println("Multification is "+multi);
	}
	public void div(float n, float m)
	{
		float d=m/n;
		System.out.println("dividion is "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch obj=new Switch();
	
	System.out.println("choose A for addition \nchoose s for subtraction \nchoose M for multification \nchoose D for division");
	char choice='D';
	
	switch (choice) {
	
	case 'A': add(5, 7);
		break;
	case 'S' : 
		obj.sub();
	break;

	case 'M':multi();
		break;
	case 'D':obj.div(3f, 6f);
		break;

	default:System.out.println("invalid input");
		break;
	}
}
	
}

