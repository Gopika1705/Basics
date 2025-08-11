package recursionsample;
public class Factorial {
	static int meth(int n) {
		if(n==0 || n==1) {
			return 1;
		}
			return n*meth(n-1);
		}
	public static void main(String[] args) {
		int num=5;
		int res=meth(num);
		System.out.println("Factorial:"+res);
	}
}

