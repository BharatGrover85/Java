package java2;

public class LoginCheck {
	public static void main(String[] args) {
		// Login Check
		String username="admin";
		String password="1234";
		
		if(username=="admin") {
			if(password=="1234") {
				System.out.println("Login Successful");
			} else {
				System.out.println("Incorrect Password");
			}
		}else {
			System.out.println("Invaild Login");
		}
		
	}

}
