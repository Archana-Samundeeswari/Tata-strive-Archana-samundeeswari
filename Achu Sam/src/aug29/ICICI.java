package aug29;

public class ICICI extends GPay {
	private double Balance=5000;
	private int pin=2003;
	
	public void depositAmount(double amount) {
		Balance+=amount;
		String recordTrans="Amount rs"+ amount +"Deposit in ICICI";
		recordTransaction(recordTrans);
	}
public void widthdrawAmount(double amount) {
	if(Balance>amount)
	{
		Balance -=amount;
		String recordTrans ="Amount rs"+ amount +"Withdraw in ICICI";
		recordTransaction(recordTrans);
	}
	else {
		System.out.println("Insufficient Balance");
	}
}
public void chackBalance(int pin) {
if(this.pin==pin) {
	System.out.println("Your Account Balance is:"+Balance+"in ICICI Bank");
}
else {
	System.out.println("Invalid pin");
}
}
}

