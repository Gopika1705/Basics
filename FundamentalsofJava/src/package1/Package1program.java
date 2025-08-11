package package1;
import package2.Package2program;
public class Package1program {
	void mul(int n1,int n2) {
		System.out.println(n1*n2);
	}
	protected void sub(int n1,int n2) {
		System.out.println(n1-n2);
	}
	private void div(int n1,int n2) {
		System.out.println(n1/n2);
	}
     public static void main(String[] args) {
		Package1program p1p=new Package1program();
		p1p.mul(10,20);
		p1p.sub(5, 2);
		p1p.div(5, 2);
	}
}
