package recursionsample;

public class Nestedrecursion {
	int fun(int n) {
		if(n>100) {
			return n-10;
		}
		return fun(fun(n+11));
	}
	public static void main(String[] args) {
		Nestedrecursion n=new Nestedrecursion();
		int num=95;
		int res=n.fun(num);
		System.out.println(res);
		
	}
}
