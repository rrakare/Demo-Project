package Interview_QA_Pack;

public class PalidroneNumber {

	public static void main(String[] args) {

		int num = 2002;

		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("this is palindrone number");
	}

}
