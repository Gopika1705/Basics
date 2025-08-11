package stringprograms;
public class StringBufferinstring {
	public static void main(String[] args) {
		String st="Eswar is a good cricketer";
		StringBuffer sb=new StringBuffer("Eswar");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(st);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
