package ArrayBhau;

public class ArrayClass {

	public static void main(String[] args) {

		int[] sumArray = { 40, 12, 13, 15, 14, 10 };

		float sumAll = 0;
		
		for (int i = 0; i < sumArray.length; i++) {
			sumAll = sumAll+sumArray[i];
		}
		System.out.println(sumArray.length);
		System.out.println(sumAll);
		System.out.println(sumAll/sumArray.length);
		
		int min = sumArray[0];
		
		for(int i=1; i<sumArray.length; i++) {
			
			if(min > sumArray[i])
			min = sumArray[i];
			
		}
		System.out.println(min);
		
	}

}
