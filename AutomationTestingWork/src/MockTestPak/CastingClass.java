package MockTestPak;

public class CastingClass {

	//*******implicit*******//
	
	byte a = 50; //1
	short s= a; // 2
	int b =s;  //4
	long l = b; //8
	
	float f = l; //4
	double d= f;  //8
	
	//********Explicit**********//
	
	double d1= 20.00;
	float f1 = (float) d1;
	
	long l1 = (long) f1;
	int b1 =(int) l1; 
	
	public static void main(String[] args) {
		CastingClass ob = new CastingClass();
		System.out.println(ob.b1+","+ob.d);
	}
}
 