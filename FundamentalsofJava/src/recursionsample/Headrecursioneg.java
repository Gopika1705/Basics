package recursionsample;
public class Headrecursioneg {
	static void meth(int n) {
		if(n>0) {
			meth(n-1);
			meth(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println("By using recursion meth");
		meth(n);
		System.out.println("Method terminated");
	}
}
