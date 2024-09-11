package aug29;

import java.util.ArrayList;

public abstract class GPay {
	private static ArrayList<String> transaction=new ArrayList<String>();
	
	public abstract void depositAmount(double amount);
	public abstract void withdrawAmount(double amount);
	public abstract void checkBalance(int pin);
	
	public void recordTransaction(String amount) {
		transaction.add(amount);)
	}
	
	public void ShowHistory() {
		transaction.forEach(s->System.out.println(s));
	}	
}
