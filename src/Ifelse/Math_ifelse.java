package Ifelse;

public class Math_ifelse {

	public Math_ifelse(){
		
		
		
	}
	public void test (int age, String name) {
	
		if(age>=21) {
			System.out.println("age Verified");
			
			if(name=="sagar") {
				System.out.println("name verified \nprocess complete \nThank you");
			}
			else {
				System.out.println("Invalid name");
			}
		}
		
		else {
			System.out.println("invalid age"); 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math_ifelse ob =new Math_ifelse();
		ob.test(21, "sagar");
	}

}
