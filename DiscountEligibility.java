package java2;

public class DiscountEligibility {
	public static void main(String[] args) {
		//Discount Eligibility
		
		boolean isStudent=false;
		boolean isSeniorCitizen=true;
		
		if(isStudent || isSeniorCitizen) {
			System.out.println("Discount Available");
		} else {
			System.out.println("No Discount Available");
		}
		
	}
}
