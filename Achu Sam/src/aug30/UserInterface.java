package aug30;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter Your Phone Number:");
		String number=sc.nextLine();
		System.out.println("Enter the Street Name:");
		String streetName=sc.nextLine();
		System.out.println("Enter Your BillAmount:");
		double amount=sc.nextDouble();
		System.out.println("Enter Your Distance:");
		int distance=sc.nextInt();
		
		CustomerDetails cd= new CustomerDetails(name,number,streetName,amount,distance);
		System.out.println(cd);
	}
}
