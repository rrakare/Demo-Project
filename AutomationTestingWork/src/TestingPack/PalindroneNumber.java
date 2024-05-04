package TestingPack;

public class PalindroneNumber {

	public static void main(String[] args) {

		int number = 2002;

		int tempNum = number;
		int revNum = 0;

		while (number != 0) {
			int reminder = number % 10;

			revNum = (revNum * 10) + reminder;

			number = number / 10;
		}
		if (revNum == tempNum  ) {
			System.out.println("Number is palindrone " +number);
		} else {
			System.out.println("Number is not palindrone " +number);
		}

	}

}
