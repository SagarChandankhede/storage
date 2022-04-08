package Ifelse;

public class IRCTC {

	public static void main(String[] args) {
		String ID="velocity";
		String Password="kuhu123";
		int Cap=54321;
		
		if (ID=="velocity") {
			System.out.println("Enter password");
			if(Password=="kuhu123") {
				System.out.println("Enter Captcha");
				if(Cap==54321) {
					System.out.println("Login success");
				}
				else {
					System.out.println("Incorrect CAptcha");
				}
			
			}
			else {
				System.out.println("Incorrect password");
			}
			
		}	
		else {
			System.out.println("incorrect username");
		}
	}

}
