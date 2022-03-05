package week3.day1;

public class AxisBank extends BankInfo {

	public static void deposit() {
		System.out.println("Deposit from AxisBank.deposit");
	}

	public static void main(String[] args) {

		AxisBank.deposit();
		BankInfo.deposit();
	}

}
