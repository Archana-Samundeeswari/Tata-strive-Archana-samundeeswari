package aug29;

public class SBI extends GPay{
	private double Balance=30000;
	private int pin=2007;
	
	public void depositAmount(double amount) {
		Balance+=amount;
		String recordTrans="Amount rs"+ amount +"Deposit in SBI";
		recordTransaction(recordTrans);
	}
	public void widthdrawAmount(double amount) {
		if(Balance>amount)
		{
			Balance -=amount;
			String recordTrans ="Amount rs"+ amount +"Withdraw in SBI";
			recordTransaction(recordTrans);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public void chackBalance(int pin) {
	if(this.pin==pin) {
		System.out.println("Your Account Balance is:"+Balance+"in SBI Bank");
	}
	else {
		System.out.println("Invalid pin");
	}
}
}
