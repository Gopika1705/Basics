package recursionsample;
public class Ngp {
	static void meth(int n) {
		if(n==11) {
			return;
		}
		System.out.println(n);
		meth(n+1);
	}
	public static void main(String[] args) {
		int n=1;
		System.out.println("By using recursion meth");
		meth(n);
		System.out.println("By using Loop");
		while(n<=10) {
			System.out.println(n);
			n++;
		}
	}
}
