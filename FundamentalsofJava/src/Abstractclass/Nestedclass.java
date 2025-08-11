package Abstractclass;
class Outer{
	void outMeth() {
		System.out.println("outer class method");
	}
	class Inner{
		void inMeth() {
			System.out.println("Inner class method");
		}
	}
}
public class Nestedclass {
	public static void main(String[] args) {
		Outer out=new Outer();
		out.outMeth();
		Outer.Inner in=out.new Inner();
		in.inMeth();
	}
}
