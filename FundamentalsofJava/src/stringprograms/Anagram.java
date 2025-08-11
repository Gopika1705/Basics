package stringprograms;
import java.util.Arrays;
public class Anagram {
	static boolean anagram(String st,String st1) {
		char ch[]=st.toCharArray();
		char ch1[]=st1.toCharArray();
 		Arrays.sort(ch);
		Arrays.sort(ch1);
		return Arrays.equals(ch,ch1);
	}
	public static void main(String[] args) {
		String st="race";
		String st1="care";
		if(anagram(st,st1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
}
