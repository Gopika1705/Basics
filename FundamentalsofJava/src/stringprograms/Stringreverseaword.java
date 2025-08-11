package stringprograms;

public class Stringreverseaword {
	public static void main(String[] args) {
		String st="Eswar is a good cricketer";
		StringBuilder sb=new StringBuilder();
		sb.append(st);
		StringBuilder a=new StringBuilder(sb.substring(0,5));
		StringBuilder b=new StringBuilder(sb.substring(6,8));
		StringBuilder c=new StringBuilder(sb.substring(9,10));
		StringBuilder d=new StringBuilder(sb.substring(11,15));
		StringBuilder e=new StringBuilder(sb.substring(16,25));	
		System.out.println(a.reverse()+" "+b.reverse()+" "+c.reverse()+" "+d.reverse()+" "+e.reverse());
		
	}
}
