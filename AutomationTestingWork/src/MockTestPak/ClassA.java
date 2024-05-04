package MockTestPak;

public class ClassA {

	//Method of overloading/Compile time /static/ early binding
	public void methodA() {
		System.out.println(" Method Overloading Start");}

	public void methodA(int a) {
		System.out.println(a);}

	public void methodA(float a) {
		System.out.println(a);}

	public void methodA(double d, String str) {
		System.out.println(d+" "+str);}

	public void methodA(String str) {
		System.out.println(str);}

	public void methodA(String str, double d) {
		System.out.println(str+" "+d);}

	public void methodA(boolean b, int a) {
		System.out.println(b+" "+a);}
}
