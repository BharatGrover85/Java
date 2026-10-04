package java2;

public class Challenge4_SimpleCalculatorUsingSwitch {
	public static void main(String[] args) {
		int a=10;
		int b=9;
		char operator='%';
		
		switch(operator) {
		case '+':
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case '-':
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		case '*':
			System.out.println(a+" * "+b+" = "+(a*b));
			break;
		case '/':
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
		case '%':
			System.out.println(a+" % "+b+" = "+(a%b));
			break;
			default:
				System.out.println("Only +, -, *, /, % operators are Supported");
		}

	}
}
