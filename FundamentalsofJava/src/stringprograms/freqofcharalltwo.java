package stringprograms;

public class freqofcharalltwo {
	public static void main(String[] args) {
		String st="Cricket is a GOOD Sports in 2025";
		int arr[]=new int[128];
		for(char ch:st.toCharArray()) {
			arr[ch]++;
		}
		int max=arr['A'];
		char c='A';
		for(int i='A';i<'Z';i++) {
			if(arr[i]>max) {
				max=arr[i];
				c=(char)(i);
			}
		}
		System.out.println(c+" : "+max);
		for(int i='a';i<'z';i++) {
			if(arr[i]>max) {
				max=arr[i];
				c=(char)(i);
			}
		}
		for(int i='0';i<'9';i++) {
			if(arr[i]>max) {
				max=arr[i];
				c=(char)(i);
			}
		}
		System.out.println(c+" : "+max);
		}
}
