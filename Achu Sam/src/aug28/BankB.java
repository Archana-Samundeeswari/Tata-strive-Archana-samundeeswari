package aug28;

public class BankB extends GPay{
		private double balance = 7000;
		private int pin=2004;

		public void makePayment(double amount) {
			if (amount <= balance) {
				balance -= amount;
				String transDetails = "payment of rs." + amount + "made usinh BankA";
				recordTransaction(transDetails);
				}

		}

		public void recordTransaction(String transDetails) {
			// TODO Auto-generated method stub
			
		}

		public void checkBalance(int pin) {
			// TODO Auto-generated method stub
			if(this.pin==pin) {
			System.out.println("your balance is :"+balance);
			}else {
				System.out.println("invalid pin");
			}
		}

	}


