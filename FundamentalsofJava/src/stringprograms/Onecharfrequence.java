package stringprograms;

public class Onecharfrequence {
	public static void main(String[] args) {
		String st1="Eswar plays good cricket in ground";
		int count=0;
		for(int i=0;i<st1.length()-1;i++) {
			char ch=st1.charAt(i);
			if(ch=='a') {
				count++;
			}
			
		}	
		System.out.println("a:"+count);
	}
	
}


