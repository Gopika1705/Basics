package stringprograms;
public class Ngpstring {
	public static void main(String[] args) {
		String st1="Abdul";
		String st2=new String("Abdul");
		char ch[]=new char[] {'A','b','d','h','u','l'};
		String st3=new String(ch);
		String st4="Abdul";
		String st5=new String("Abdul");
		System.out.println(st1.length());
		System.out.println(st1.equals(st2));
		System.out.println(st1.charAt(0));
	}
}
