package TestingPack;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int n=6;
		boolean b = isPerfect(n);
		
		if(b)
			System.out.println("This is perfect number");
		else
			System.out.println("This is not perfect number");
	}
	
	public static boolean isPerfect(int number) {
		int sum = 0;
		for(int i=1; i<number; i++) {
			if(number % i == 0)
				sum = sum + i;
		}
		if(number == sum)
			return true;
		else
			return false;
	}
}
