package Ifelse;

public class Ifelse_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		if (num>2) {
			System.out.println("the number is greater than 2");
		}
		
		else {
			System.out.println("failed");
		
		}
	Ifelse_Study grade=new Ifelse_Study();
	grade.test();
	}
public void test() {
//	if my grade is
//	A--> %>=75
//	B--> % >=60-<=75
//	C--> %>40-<60
//	D--> fail
	int percen=39;
	if (percen>=75) {
		System.out.println("you have A grade");
	}
		else if(percen>=60 & percen<75) {
			System.out.println("you have B grade");
		}
		else if(percen>=40 & percen<60) {
				System.out.println("you have C grade");

		}
		else {
			System.out.println("you have failed");
		}
	}
}
