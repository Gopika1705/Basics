package stringprograms;
public class Frequencyofcharacters {
	public static void main(String[] args) {
		String st1="cricket";
		char ch,c;
		int count=0;
		String chk="";
		for(int i=0;i<st1.length();i++) {
			ch=st1.charAt(i);
			count=0;
			if(chk.indexOf(ch)>=0) {
				continue;
			}
			chk+=ch;
			for(int j=0;j<st1.length();j++) {
				c=st1.charAt(j);
				if(ch==c) {
					count++;
					
				}
			}
			System.out.println(ch+" : "+count);
		}	
	}
}
	
