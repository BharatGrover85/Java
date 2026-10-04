package java2;

public class Challenge3_NumberDivisibleBy3And5 {
	public static void main(String[] args) {
//		Check:
//			divisible by both 3 and 5
//			divisible only by 3
//			divisible only by 5
//			not divisible by 3 or 5
		
		int number=75;
		
		if(number%3==0 || number%5==0) {
			if(number%3==0 && number%5==0) {
				System.out.println("Divisible by both 3 and 5");
			} else if(number%3==0) {
				System.out.println("Divisible only by 3");
			} else {
				System.out.println("Divisible only by 5");
			}
		} else {
			System.out.println("Not Divisible by 3 or 5");
		}
	}

}
