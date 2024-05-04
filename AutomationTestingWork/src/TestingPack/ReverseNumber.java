package TestingPack;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int num = 125487;
		int revNum = 0;
		
		while(num>0) {
			
			int reminder = num % 10;
			revNum = (revNum*10) + reminder;
			num= num/10;
		}
		System.out.print(revNum);
	}

}
