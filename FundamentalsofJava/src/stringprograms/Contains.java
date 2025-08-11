package stringprograms;
public class Contains {
	public static void main(String[] args) {
		String st1="   Eswar plays good cricket in ground ";
		System.out.println(st1.contains("of"));
		System.out.println(st1.substring(8,17));
		System.out.println(st1.substring(16));
		System.out.println(st1.trim());
		System.out.println(st1.replace("in","on"));
		System.out.println(st1.replaceAll("[a,e,i,o,u]","*"));
		System.out.println(st1.startsWith("E"));
		System.out.println(st1.endsWith(" "));
		
}
}
