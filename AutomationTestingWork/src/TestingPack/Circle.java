package TestingPack;

import java.util.Scanner;

public class Circle extends Shape {

	double area_Circle;
	public void printArea() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		area_Circle = (0.5*a * b);
		System.out.println("Area of rectangel "+area_Circle);
	}
}
