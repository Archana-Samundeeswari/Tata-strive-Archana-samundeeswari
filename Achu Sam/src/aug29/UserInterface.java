package aug29;
import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ICICI icici=new ICICI();
		SBI sbi=new SBI();
		GPay gpay=icici;
		int ch=0;
		System.out.println("User Interface \n---------------");
		
		do {
			System.out.println("1.Withdraw Money");
			System.out.println("2.Deposit Money");
			System.out.println("3.Check Balance");
			System.out.println("4.See History");
			System.out.println("5.Switch Account");
			System.out.println("6.Exit");
			ch=sc.nextInt();
			
			if(ch==1) {
				System.out.println("Enter the Amount to Widthdraw");
				double amount =sc.nextDouble();
				gpay.withdrawAmount(amount);
			}
			else if(ch==2){
				System.out.println("Enter the Amount to deposit");
				double amount=sc.nextDouble();
				gpay.depositAmount(amount);
			}
			else if(ch==3) {
				System.out.println("Enter the pin");
				int pin=sc.nextInt();
				System.out.println("Your Account Balance");
				gpay.checkBalance(pin);	
			}
			else if(ch==4) {
				System.out.println("Your Transaction History");
				gpay.ShowHistory();
			}
			else if(ch==5) {
				System.out.println("Choose your Bank Account\n1.ICICI \n2.SBI");
				int cho =sc.nextInt();
				if(cho==1) {
					gpay=icici;
				}
				else if(cho==2) {
					
				}
			}
		}
	}
}

			
			
				

