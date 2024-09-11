package aug28;

public class BankA extends GPay {
	private double balance = 75000;
	private int pin=2003;

	@Override
	public void makePayment(double amount) {
		if (amount <= balance) {
			balance -= amount;
			String transDetails = "payment of rs." + amount + "made usinh BankA";
			recordTransaction(transDetails);

		}

	}

	@Override
	public void checkBalance(int pin) {
		// TODO Auto-generated method stub
		if(this.pin==pin) {
		System.out.println("your balance is :"+balance);
		}else {
			System.out.println("invalid pin");
		}
	}

}


