package stringprograms;

public class Frequencyofchartwo {
	public static void main(String[] args) {
		String st="cricket";
		int arr[]=new int[26];
		for(char ch:st.toCharArray()) {
			arr[ch-97]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println((char)(i+97)+" : "+arr[i]);
			}
		}
		
	}
}
