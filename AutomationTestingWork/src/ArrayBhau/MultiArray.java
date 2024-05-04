package ArrayBhau;

public class MultiArray {

	public static void main(String[] args) {
		
		int[][] intArray = {{10,20,50,30},{14,8,16,12},{13,26,20,9}};

		for(int i=0; i<3;i++)
			for(int j=0; j<4; j++)
				
				System.out.print(" "+intArray[i][j]);
	}

}
