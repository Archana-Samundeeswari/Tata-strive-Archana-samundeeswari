package aug20;

import java.util.Scanner;

public class OxygenPlants {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the room(in m)");
		double length =sc.nextDouble();
		if(length<=0) {
			System.out.println("invalid length");
		}
		System.out.println("Enter the breadth of the room(in m)");
		double breadth =sc.nextDouble();
		if(breadth<=0) {
			System.out.println("invalid breadth");
		}
		System.out.println("Enter the area of a single plant(in cm)");
		double area =sc.nextDouble();
		if(area<=0) {
			System.out.println("invalid area");
		}
		double totalplants=(length*breadth/area)*100*100;
		totalplants-=totalplants%10;
		System.out.printf("Total number of plants is %.0f\n",totalplants);
		double totaloxygen=totalplants*0.9;
		System.out.printf("Total Oxygen production is %.2f litres",totaloxygen);
		}

}