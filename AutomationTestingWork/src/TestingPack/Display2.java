package TestingPack;

import MockTestPak.AccessSpecifier;
import MockTestPak.Display;

public class Display2 extends AccessSpecifier {

	static int c= 20;
	public static void main(String[] args) {

		Display2 dis = new Display2();
		dis.method2();
		dis.method3();
		
		
		AccessSpecifier disp = new Display2();
		disp.method3();
			
		Display obj = new Display();
		int b = obj.demo();
		int d = b*c;
		System.out.println(d);
	}

}
