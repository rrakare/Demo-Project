package Interview_QA_Pack;

public class StringLengthCount {

	public static void main(String[] args) {

		String str = "ACFT";

		int count = 0;
		
		for(char s:str.toCharArray()) {
			count++;
			
		}
		System.out.println(count);

	}

}
