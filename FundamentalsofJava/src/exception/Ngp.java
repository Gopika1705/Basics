package exception;

public class Ngp {
	String bin(int num) {
		String res="";
		while(num>0) {
			res=(num%2)+res;
			num=num/2;
		}
		return res;
	}
	public static void main(String[] args) {
		Ngp n=new Ngp();
		String res=n.bin(12);
		System.out.println(res);
	}
}
