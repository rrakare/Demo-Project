package Interview_QA_Pack;

public class InterviewProgram {

	public static void main(String[] args) {
		InterviewProgram.ReverseString();
		System.out.println("-----------------");
		InterviewProgram.ReverseWordString();
		System.out.println("-----------------");
		InterviewProgram.ReverseNumber();
		System.out.println("-----------------");
		InterviewProgram.AmstrongNumber();
		System.out.println("-----------------");
		InterviewProgram.PalidroneNumber();
		System.out.println("-----------------");
		InterviewProgram.PerfectNumber();
		
	}

	public static void ReverseString() {

		String str = "Nagpur";
		char[] ch = str.toCharArray();

		String str1 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			str1 = str1 + ch[i];
		}
		System.out.println(str1);

	}

	public static void ReverseWordString() {
		String str = "I am in Nagpur";
		String[] st = str.split(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " ");
		}

	}

	public static void ReverseNumber() {

		int a = 5847888;
		int b = 0;

		while (a > 0) {
			int rem = a % 10;
			b = (b * 10) + rem;
			a = a / 10;
		}
		System.out.println(b);
	}

	public static void AmstrongNumber() {

		int a= 153;
		int temp =a;
		int b=0;
		while(a>0) {
			int rem = a%10;
			b = rem*rem*rem + b;//27+125+1
			a=a/10;
		}
		if(temp == b)
			System.out.println("Amstrong Number");
	}
	public static void PalidroneNumber() {

		int a =2002;
		int temp =a;
		int b=0;
		while(a>0) {
			int rem = a%10;
			b = (b*10)+rem;
			a=a/10;
		}
		if(temp == b)
		System.out.println("Palidrone number");
	}
	public static void PerfectNumber() {

		int a =6;
		int temp =a;
		int b=0;
		for(int i=1; i<a;i++) {
			if(a % i == 0)
				b= b +i;
		}
		if(temp == b)
		System.out.println("Perfect number");
	}

}
