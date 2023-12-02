package org.bank;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// super.deposit();
		System.out.println("Deposit new");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();

	}

}
