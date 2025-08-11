package stringprograms;

public class Upperandlowercase {
	public static void main(String[] args) {
		String s1="Abdul Will Be Called As Java Developer";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
				System.out.print(ch);
			}
			else {
				ch=(char)(ch-32);
				System.out.print(ch);
			}
	}
}
}
