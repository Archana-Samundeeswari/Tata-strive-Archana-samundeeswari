package sep12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LuckyNameFinder {
	public static String getLuckyNumber(String path, int num) {
		String name = "";
		String achu = "";
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
			while ((name = br.readLine()) != null) {
				//System.out.println(NameSum(name));
				if (num == NameSum(name)) {
					achu += name + "";
				}
//			if(achu==""){
//				System.out.println("There is no matching with your Lucky Number");
//			}
//			else {
//				System.out.println(achu);
//			}
			}
			if(!achu.equals(""))
			return "Lukky names are: "+achu;
			else
				return "not found any lukky names";
		}
		

		catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
			;
		}
		return "Thank you";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path:");
		String path = sc.nextLine();
		System.out.println("Enter the LUcky Number:in two digit");
		int num = sc.nextInt();
	
		System.out.println(getLuckyNumber(path, num));
	}

	private static int NameSum(String name) {
		int sum = 0;
		for (char ch : name.toLowerCase().toCharArray()) {
			sum += ch - 'a' + 1;
		}
		return sum;
	}
}
