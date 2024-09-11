package aug28;

//import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class UserInterface  {
	public static void main(String[] args) {
		//GPay gpay = new BankA();
		///Gpay gpay= bankb;

		BankA banka=new BankA();
		BankB bankb=new BankB();	
		GPay gpay= bankb;

		Scanner sc = new Scanner(System.in);

		int ch = 0;
		do {
			System.out.println("User interface\n*********");
			System.out.println("1.Make payment");
			System.out.println("2.Check balance");
			System.out.println("3.Show Transaction Histroy");
			System.out.println("4.Switch Account");
			System.out.println("5.Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the amount");
				double amount = sc.nextDouble();
				gpay.makePayment(amount);
				break;
			case 2:
				System.out.println("Enter the pin");
				int pin = sc.nextInt();
				gpay.checkBalance(pin);
				break;
			case 3:
				System.out.println("Transaction Details");
				gpay.showHistory();
				break;
			case 4:
				System.out.println("Select the account  \n1.BankA\n2.Bank2");
				int ch2 = sc.nextInt();
				if(ch2==1) {
					gpay=banka;
					System.out.println("BankA");
				}else if(ch2==2) {
					gpay=bankb;
					System.out.println("BankB");

				}
				break;
			case 5:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid data");
			}
		} while (ch != 5);

	}
}
