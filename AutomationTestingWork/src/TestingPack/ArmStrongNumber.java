package TestingPack;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int n=8;
		int temp=n;
		int r,sum=0;
		
		while(n>0)
		{
		r=n%10;
		n=n/10;
		sum = sum + r*r*r;
		}
		if(temp == sum) {
			System.out.println("this is armstrong number");
		}else
		System.out.println("this is not armstrong number");
		
	}

}
