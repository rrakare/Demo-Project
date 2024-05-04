package TestingPack;

public class PrimeNumber2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			boolean isPrime = true;
			//checking prime number 
			if (i > 1) {
				
				for (int j = 2; j < i; j++) {
					//divided the number to check reminder
					if (i % j == 0) {
						isPrime = false;
					}
				}
			} else {
				isPrime = false;
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}

}
