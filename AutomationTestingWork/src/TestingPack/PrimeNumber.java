package TestingPack;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// Step 1 enter the number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		scan.close();

		// Step 2 logic for checking weather number is prime or not
		boolean isPrime = true;

		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		} else {
			isPrime = false;
		}
		if (isPrime) {
			System.out.println(num + "  is prime number");
		} else {
			System.out.println(num + "  is not prime number");
		}

	}

}
