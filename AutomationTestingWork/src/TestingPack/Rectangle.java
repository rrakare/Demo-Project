package TestingPack;

import java.util.Scanner;

public class Rectangle extends Shape {

	public int area_rect;

	public void printArea() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		area_rect = a * b;
		System.out.println("Area of rectangel "+area_rect);
	}
}
