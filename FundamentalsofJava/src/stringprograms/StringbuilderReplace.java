package stringprograms;

public class StringbuilderReplace {
	public static void main(String[] args) {
		String st="Eswar is a good cricketer";
		StringBuilder sb=new StringBuilder();
		sb.append(st);
		System.out.println(sb);
		sb.replace(11, 15, "bad");
		System.out.println(sb.reverse());
	}
}
