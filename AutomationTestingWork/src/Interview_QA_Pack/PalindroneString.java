package Interview_QA_Pack;

public class PalindroneString {

	public static void main(String[] args) {

		String str = "ABCBA";

		String tempStr =str;
		char[] ch = str.toCharArray();
		int len = ch.length;
		String result = "";

		for (int i = len-1; i >=0; i--) {
			result = result + ch[i];
		}
		if(tempStr.equals(result))
		System.out.println(" This is origenal String: "+tempStr+ ", this is palindrone string: " +result);

	}

}
