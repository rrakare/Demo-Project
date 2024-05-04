package TestingPack;

import java.util.Scanner;

public class ArmStrongNumber2 {

	// ArmStrong ==> 153 ==> (1*1*1)+(5*5*5)+(3*3*3)==> 153
	public static void main(String[] args) {

		// enter range of the number which is find  number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Starting number:  ");
		int startingNumber = scan.nextInt();

		System.out.println("Enter ending number:  ");
		int endingNumber = scan.nextInt();
		
		System.out.println("List of Armstrong number present " +startingNumber+ " to "+endingNumber+" are ");
		for(int i =startingNumber; i<=endingNumber; ++i ) {
			if(checkArmstrong(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean checkArmstrong(int number) {
		int n = number;
		int digitCount = String.valueOf(n).length();
		int reminder = 0, sum = 0;

		while (n > 0) {
			reminder = n % 10;
			sum = sum + (int) Math.pow(reminder, digitCount);
			n = n / 10;
		}
		if(sum == number) {
			return true;
		}else
			return false;
	}
}
