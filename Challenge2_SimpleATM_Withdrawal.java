package java2;

public class Challenge2_SimpleATM_Withdrawal {
	public static void main(String[] args) {
		int balance =5000;
		int withdrawAmount = 2300;
		
		if(balance>=withdrawAmount) {
			System.out.println("Withdrawal Successfull");
			System.out.println("Remaining Amount: "+(balance-withdrawAmount));
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}

}
