package stringprograms;
public class ReverseofaString {
	public static void main(String[] args) {
		String s1="Abinaya";
		String res="";
		for(int i=s1.length()-1;i>=0;i--) {
			res=res+s1.charAt(i);
		}
		System.out.println(res);
	}
}
