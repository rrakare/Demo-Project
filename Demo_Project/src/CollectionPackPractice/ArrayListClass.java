package CollectionPackPractice;

public class ArrayListClass {

	public static void main(String[] args) {

		int[] num = { 10, 90, 58, 74 };// 0, 1, 2, 3

		// length
		int len = num.length;
		System.out.println(len);

		for (int i = 0; i < len; i++) // 0<4,1<4,2<4,3<4,4<4

			System.out.print(num[i] + " ");// 10,20,58,74
         System.out.println();
         
         
		int i = 0;
		while (len > i) {
			System.out.print(num[i] + " ");
			i++;
		}

		
		
	}

}
