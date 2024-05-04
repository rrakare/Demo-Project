package Interview_QA_Pack;

import java.util.Scanner;

public class Armstrong_Numer {

	public static void main(String[] args) {
		
		int n;
		int arm =0;
		Scanner sc = new Scanner(System.in);//153
		System.out.println("Enter number");
		n = sc.nextInt();
		
		int b =n;
		while(n>0) {
			int rem = n%10;
			arm = rem*rem*rem+arm;
			n=n/10;
		}
		if(arm == b)
		System.out.println("This is armstrong number");
		else 
			System.out.println("This is not armstrong number");
	}

}
