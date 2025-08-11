package recursionsample;
public class Oddnousingrecursion {
	static void meth(int n) {
		if(n>0) {
			meth(n-2);
				System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int n=50;
		System.out.println("By using recursion method");
		meth((n%2==0)?--n:n);
		System.out.println("Method terminated");
	}
}
