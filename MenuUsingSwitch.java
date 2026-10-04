package java2;

public class MenuUsingSwitch {
	public static void main(String[] args) {
		int choice=3;
		
		switch(choice) {
		case 1: 
			System.out.println("Add Money");
			break;
		case 2:
			System.out.println("Withdraw Money");
			break;
		case 3:
			System.out.println("Check Balance");
			break;
		case 4: 
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Choice");
				
		}
	}

}
