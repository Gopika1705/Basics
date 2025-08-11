package stringprograms;
public class Vowels {
	public static void main(String[] args) {
		String s1="Abdul";
		s1=s1.toUpperCase();
		for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') { 
					System.out.println();
					System.out.print("Vowels: "+ch);
				}
				 else {
					 System.out.println();
					System.out.print("consonants: "+ch);
				}
		}
	}
}
