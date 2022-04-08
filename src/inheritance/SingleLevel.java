package inheritance;

public class SingleLevel
{
public static void main(String[] args) {
	Mother ob1=new Mother();
	Daughter.home();//as Mother class is attached to daughter class we can call method of mother class by daughter reference as it is inherited 
	ob1.look();
	Daughter ob2=new Daughter();
	ob2.jwell();
	Daughter.money();
	System.out.println("calling a from daughter class "+ ob2.a);
	System.out.println("calling b from Mother class "+ ob1.b);
	
}
}
