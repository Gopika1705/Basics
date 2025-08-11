package stringprograms;

public class freqofcharall {
	public static void main(String[] args) {
		String st="Cricket is a GOOD Sports in 2025";
		int arr[]=new int[128];
		for(char ch:st.toCharArray()) {
			arr[ch]++;
		}
		//capital
		for(int i='A';i<'Z';i++) {
			if(arr[i]!=0)
				System.out.println((char)(i)+" : "+arr[i]);
		}
		//Small
		for(int i='a';i<'z';i++) {
			if(arr[i]!=0)
				System.out.println((char)(i)+" : "+arr[i]);
		}
		// Numeric
		for(int i='0';i<'9';i++) {
			if(arr[i]!=0)
				System.out.println((char)(i)+" : "+arr[i]);
		}
		}
}
