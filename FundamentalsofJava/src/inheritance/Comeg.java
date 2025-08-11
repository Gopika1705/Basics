package inheritance;

public class Comeg {
	 void meth(float a,float b) {
		 System.out.println(a*b);
	 }
	 void meth(float a,int b) {
		 System.out.println(a+b);
	 }
	 void meth(int a,float b) {
		 System.out.println(a-b);
	 }
	 public static void main(String[] args) {
		 Comeg es=new Comeg();
		 es.meth(2.5f,2);
	 }
}
