package aug20;

import java.util.Scanner;

public class BMICalculator {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter weight in kg");
	double weight=sc.nextDouble();
	System.out.println("Enter height in cm");
	double height=sc.nextDouble();
	double bmi=weight/(height/100)*(height/100);
	if(bmi)
	
}
}
