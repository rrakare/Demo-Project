package ExceptionHand;

public class TryCatchBlock {

	public static void main(String[] args) {

		int a = 2;
		int[] b = { 1, 2, 8, 15 };
		int c;

		try {
			c = b[4] / a;
			System.out.println(c);
		} catch (Exception ee) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("All block executes");
		}
	}

}
