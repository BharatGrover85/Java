package java2;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int num1=3434, num2=546,num3=67;
		// check the largest
		
		if(num1>num2 && num1>num3) {
			System.out.println("Number 1 is the Largest: "+num1);
		} else if(num2>num1 && num2>num3) {
			System.out.println("Number 2 is the Largest: "+num2);
		} else {
			System.out.println("Number 3 is the Largest: "+num3);
		}
		
	}

}
