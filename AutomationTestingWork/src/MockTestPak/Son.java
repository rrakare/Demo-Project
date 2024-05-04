package MockTestPak;

public class Son {
	
	
	public static void main(String[] args) {
		Human h = new Human();
		h.setAge(50, true);

		System.out.println(h.getAge() + " " + h.getWeigth());
	}
}
