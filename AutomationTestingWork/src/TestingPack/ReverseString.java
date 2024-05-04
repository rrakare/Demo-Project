package TestingPack;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Raavi";
		char[] ca = str.toCharArray();
		
		int len = ca.length;
		String reverString = " ";
		for (int i = len - 1; i >= 0; i--) {

			reverString = reverString + ca[i];
		}
		System.out.print("Origenal String: "+str+" ---> Reveres String: "+reverString);
	}

}
