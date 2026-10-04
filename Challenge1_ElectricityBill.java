package java2;

public class Challenge1_ElectricityBill {
	public static void main(String[] args) {
		int units =180;
		int rate1 =5;
		int rate2 =8;
		int bill;
		
		if(units>100) {
			bill=(rate1*100)+(rate2*(units-100));
			System.out.println("Your Total Bill: "+bill);			
		}else {
			bill=rate1*units;
			System.out.println("Your Total Bill: "+bill);
		}
	}

}
