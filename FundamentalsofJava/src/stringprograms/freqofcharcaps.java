package stringprograms;
public class freqofcharcaps {
	public static void main(String[] args) {
		String st="Cricket is a GOOD Sports";
		int arr[]=new int[26];
		int arr1[]=new int[26];
		for(char ch:st.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				arr1[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				arr[ch-97]++;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0) {
				System.out.println((char)(i+65)+" : "+arr1[i]);
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {
				System.out.println((char)(j+97)+" : "+arr[j]);
			}
		}
		
}
}
