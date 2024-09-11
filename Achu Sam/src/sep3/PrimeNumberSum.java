package sep3;

import java.util.Scanner;

public class PrimeNumberSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int arraysize=sc.nextInt();
		
		if((arraysize>5)||(arraysize<1)) {
			System.out.println(arraysize+"is an invalid array size");
			return;
		}
		int[] num=new int[arraysize];
		System.out.println("Enter the Number:");
		for(int i = 0;i<arraysize;i++) {
			num[i]=sc.nextInt();
			if((num[i]<=0)||(num[i]>=100)){
				System.out.println(num[i]+"is an invalid number");
			}
	}
}
}
