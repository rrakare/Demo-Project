package TestingPack;


public class FibonacciSeries {
	
	static int n1=0;
	static int n2=1;
	static int n3=0;
	
	public static void main(String[] args) {
		int count=10;
		
		System.out.print(n1+" "+n2);
		fabSeriesWithRecursion(count-2);
	}
	// FibonacciSeries in Java with using recursion
	public static void fabSeriesWithRecursion(int count) {
		
		if (count>0) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fabSeriesWithRecursion(count-1);
		}
	}

}
