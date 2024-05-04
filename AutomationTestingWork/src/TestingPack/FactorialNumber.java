package TestingPack;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5;
		int numfact = checkFactorialNum(num);
		System.out.print("Factorial Number "+num+" of "+numfact);
	}

	static int checkFactorialNum(int n) {
		
		if(n==0) {
			return 1;
		}else {
			return n*checkFactorialNum(n-1);
		}
	}
}
