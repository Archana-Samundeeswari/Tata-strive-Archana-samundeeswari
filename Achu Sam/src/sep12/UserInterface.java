package sep12;

import java.util.Scanner;

public class UserInterface {
	public String extractString(String sentence,int number1,int number2)
	{
		String result="";
		try {
			result=sentence.substring(number1, number2);
			result="The Output String is"+result+". ";
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.print("Invalid Index Position. ");
		}
		finally {
			return result+"Thanks for using this application.";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String sentence = sc.nextLine();
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		UserInterface ui=new UserInterface();
		System.out.println(ui.extractString(sentence,num1,num2));

	}

}
