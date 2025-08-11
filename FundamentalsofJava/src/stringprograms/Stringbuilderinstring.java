package stringprograms;

public class Stringbuilderinstring {
	public static void main(String[] args) {
		String st="Eswar is a good cricketer";
		StringBuilder sb=new StringBuilder();
		sb.append(st);
		sb.insert(5,'n');
		sb.insert(sb.indexOf("d")+1," Sitch ball");
		System.out.println(sb);
		sb.delete(7,9);
		System.out.println(sb);
	}
}
