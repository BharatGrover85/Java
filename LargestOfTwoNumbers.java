package java2;

public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		int num1=44, num2=43;
		
		// Check Largest Number..
		
		if (num1>num2) {
			System.out.println("Number1 is Bigger: " + num1);
		} else if(num2>num1) {
			System.out.println("Number2 is Bigger: "+num2);
		}else {
			System.out.println("Both are Equal");
		}
	}

}
